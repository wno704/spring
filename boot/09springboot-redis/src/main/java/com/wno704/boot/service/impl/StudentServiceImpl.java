package com.wno704.boot.service.impl;

import com.wno704.boot.mapper.StudentMapper;
import com.wno704.boot.model.Student;
import com.wno704.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student save(Student student) {
        this.studentMapper.add(student);
        return this.studentMapper.queryStudentBySno(student.getSno());
    }

    @Override
    public Student update(Student student) {
        this.studentMapper.update(student);
        return this.studentMapper.queryStudentBySno(student.getSno());
    }

    @Override
    public void deleteStudentBySno(int sno) {
        this.studentMapper.deleteStudentBySno(sno);
    }

    @Override
    public Student queryStudentBySno(int sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }

}
