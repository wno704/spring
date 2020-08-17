package com.wno704.boot.service.impl;

import com.wno704.boot.dao.StudentDao;
import com.wno704.boot.model.Student;
import com.wno704.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int add(Student student) {
        return this.studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentDao.update(student);
    }

    @Override
    public int deleteBysno(int sno) {
        return this.studentDao.deleteBysno(sno);
    }

    @Override
    public List<Map<String, Object>> queryStudentsListMap() {
        return this.studentDao.queryStudentsListMap();
    }

    @Override
    public Student queryStudentBySno(int sno) {
        return this.studentDao.queryStudentBySno(sno);
    }
}
