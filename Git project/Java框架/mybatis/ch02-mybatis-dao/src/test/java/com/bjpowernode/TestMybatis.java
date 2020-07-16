package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.impl.StudentDaoImpl;
import com.bjpowernode.domain.Student;
import org.junit.Test;
import java.util.List;

public class TestMybatis {
    @Test
    public void testselectStudents(){
        //com.bjpowernode.dao.StudentDao
        StudentDao dao = new StudentDaoImpl();
        /**
        * List<Student> studentList = dao.selectStudents();调用
         * 1、dao对象，类型是StudentDao,全限定名称是：com.bjpowernode.dao.StudentDao
         * 全限定名称 和 namespace是一样的。
         * 2.方法名称， selectStudents , 这个方法就是mapper文件中的id值 selectStudents
         * 3.通过dao方法中的返回值也可以确定Mybatis要调用的SqlSession的方法
         *   如果返回值是List,要调用的是SqlSession.selectList()方法。
         *   如果返回值 int 或者非List的，看mapper文件中的 标签是<insert>,<update>就会调用SqlSession的insert，update等方法
         *
         *   mybatis的动态代理：mybatis根据dao 的方法调用，获取执行sql语句的信息。
         *   mybatis根据你的dao接口，创建出一个dao接口的实现类，并创建这个类的对象。
         *   完成SqlSession调用方法，访问数据库。
         */
        List<Student> studentList = dao.selectStudents();
        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }
    @Test
    public void testinsertStudent(){
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(1010);
        student.setName("李信");
        student.setEmail("lixin.com");
        student.setAge(23);
        int nums = dao.insertSudent(student);
        System.out.println("添加对象的数量："+nums);
    }
}
