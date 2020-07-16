package com.bjpowernode;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.MyStudent;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.MyBatisUtils;
import com.bjpowernode.vo.QueryParam;
import com.bjpowernode.vo.ViewStudent;
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
    public void testSelectViewStudent() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        ViewStudent student = dao.selectStudentReturnViewStudent(1005);
        System.out.println("1005 student="+student);
    }
    @Test
    public void testSelectCount() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int counts = dao.countStudent();
        System.out.println("学生的数量="+counts);
    }
    //返回Map
    @Test
    public void testSelectMap() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<Object, Object> map = dao.selectMapById(1005);
        System.out.println("map=="+map);
    }
    @Test
    public void TestSelectAllStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectAllStudents();
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void TestSelectAllStudent2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

       List<MyStudent> students = dao.selectMyStudent();
        for (MyStudent stu : students) {
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void selectDiffColProperty(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> students = dao.selectDiffColProperty();
        for (MyStudent stu : students) {
            System.out.println("###学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void selectLikeOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        准备好like的内容
        String name = "%李%";

        List<Student> students = dao.selectLikeOne(name);
        for (Student stu : students) {
            System.out.println("###学生="+stu);
        }
        sqlSession.close();
    }
    @Test
    public void selectLikeTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        准备好like的内容
        String name = "李";

        List<Student> students = dao.selectLikeTwo(name);
        for (Student stu : students) {
            System.out.println("***学生="+stu);
        }
        sqlSession.close();
    }
}
