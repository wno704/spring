package com.wno704.boot.service.impl;

import com.wno704.boot.mysqldao.MysqlStudentDao;
import com.wno704.boot.oracledao.OracleStudentDao;
import com.wno704.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private OracleStudentDao oracleStudentDao;

    @Autowired
    private MysqlStudentDao mysqlStudentDao;

    @Override
    public List<Map<String, Object>> getAllStudentsWithMysql() {
        return this.mysqlStudentDao.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsWithOracle() {
        return this.oracleStudentDao.getAllStudents();
    }
}
