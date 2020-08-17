package com.wno704.boot.dao;

import com.wno704.boot.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface StudentDao {

    int add(Student student);

    int update(Student student);

    int deleteBysno(int sno);

    List<Map<String, Object>> queryStudentsListMap();

    Student queryStudentBySno(int sno);
}
