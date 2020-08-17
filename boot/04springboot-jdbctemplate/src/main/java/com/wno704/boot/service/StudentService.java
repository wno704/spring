package com.wno704.boot.service;

import com.wno704.boot.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(int sno);
    List<Map<String, Object>> queryStudentsListMap();
    Student queryStudentBySno(int sno);
}
