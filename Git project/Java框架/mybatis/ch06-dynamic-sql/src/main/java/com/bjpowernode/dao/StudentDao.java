package com.bjpowernode.dao;


import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    //动态sql，使用java对象作为参数
    List<Student>  selectStudentIf(Student student);
    //where 使用
    List<Student>  selectStudentWhere(Student student);
    //foreach用法1
    List<Student> selectForeachOne(List<Integer> idlist);

}




