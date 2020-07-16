package com.bjpowernode;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMybatis {
    @Test
    public void testSelectIf() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        List<Student> students = dao.selectStudentIf(student);
        for (Student stu : students) {
            System.out.println("if==="+stu);
        }
    }
    @Test
    public void testSelectWhere() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
//        student.setName("李四");
//        student.setAge(20);
        List<Student> students = dao.selectStudentWhere(student);
        for (Student stu : students) {
            System.out.println("where==="+stu);
        }
    }
    @Test
    public void testfor(){
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
//        String sql = "select * from student where id in (1001,1002,1003)";
        String sql = "select * from student where id in";
        StringBuilder builder = new StringBuilder("");
        int len = list.size();
        //添加开始的（
        builder.append("(");
        for (Integer i : list) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length()-1);

        //循环结尾
        builder.append(")");
        sql = sql +builder.toString();
        System.out.println("sql=="+sql);
    }
    @Test
    public void testSelectForEach() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1003);
        list.add(1004);
        list.add(1005);
        List<Student> students = dao.selectForeachOne(list);
        for (Student stu : students) {
            System.out.println("foreach--one==="+stu);
        }
    }

}
