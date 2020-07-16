package com.bjpowernode;
import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.List;

public class TestMybatis {
    @Test
    public void testselectStudents() {
        /**
         *使用mybatis动态代理机制，使用SqlSession.getMapper(dao接口)
         * getMapper能获取dao 接口对于的实现类对象。
         */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //com.sun.proxy.$Proxy2:jdk的动态代理
        System.out.println("dao="+dao.getClass().getName());
        //调用dao的方法，执行数据库的操作
        List<Student> students = dao.selectStudents();
        for (Student stu : students) {
            System.out.println("学生="+stu);
        }
    }
    @Test
    public void testinsertStudent(){
        SqlSession sqlSession =MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1008);
        student.setName("李飞");
        student.setEmail("lifei@163.com");
        student.setAge(28);
        int nums = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("添加对象的数量："+nums);
    }
}
