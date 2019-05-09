package com.example.school_system.demo.service;

import com.example.school_system.demo.pojo.Student;

import java.util.List;

public interface StudentPersonalMsgService {
    public boolean insertBatchStudentPersonalMessage(List<Student> studentList);
    public String getLastStudentIdByClassId(String classId);
}
