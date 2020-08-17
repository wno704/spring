package com.wno704.boot.service;

import com.wno704.boot.model.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(int sno);
    Student queryStudentBySno(int sno);
}
