package com.wno704.boot.controller;

import com.wno704.boot.model.Student;
import com.wno704.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping( value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentBySno(int sno) {
        return this.studentService.queryStudentBySno(sno);
    }

    @RequestMapping( value = "/addstudent", method = RequestMethod.GET)
    public int addstudent(Student student) {
        return this.studentService.add(student);
    }

    @RequestMapping( value = "/queryallstudent", method = RequestMethod.GET)
    public List<Map<String, Object>> queryallstudent() {
        return this.studentService.queryStudentsListMap();
    }

    @RequestMapping( value = "/deletestudent", method = RequestMethod.GET)
    public int deletestudent(int sno) {
        return this.studentService.deleteBysno(sno);
    }

}
