package com.bjpowernode;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.MyBatisUtils;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {
    @Test
    public void testSelectStudentById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentById(1003);
        System.out.println("student="+student);
    }
    @Test
    public void TestSelectMultiParam(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectMultiParam("李四", 23);
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectMultiObject(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        QueryParam param = new QueryParam();
        param.setParamName("张三");
        param.setParamAge(12);
        List<Student> students = dao.selectMultiObject(param);
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectMultiStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张三");
        student.setAge(12);
        List<Student> students = dao.selectMultiStudent(student);
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectMultiPosition(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectMultiPosition("李四",20);
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectMultiByMap(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<String, Object> data = new HashMap<>();
        data.put("myname","张三");
        data.put("age",28);
        List<Student> students = dao.selectMultiByMap(data);
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectUse$(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectUse$("'李四'");
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectUse$Order(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students =dao.selectUse$Order("name");
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }

}
