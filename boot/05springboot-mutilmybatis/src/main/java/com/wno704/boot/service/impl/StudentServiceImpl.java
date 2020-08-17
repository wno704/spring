package com.wno704.boot.service.impl;

import com.wno704.boot.mysqldao.MysqlStudentMapper;
import com.wno704.boot.oracledao.OracleStudentMapper;
import com.wno704.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private MysqlStudentMapper mysqlStudentMapper;

    @Autowired
    private OracleStudentMapper oracleStudentMapper;

    @Override
    public List<Map<String, Object>> getAllStudentsWithMysql() {
        return this.mysqlStudentMapper.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsWithOracle() {
        return this.oracleStudentMapper.getAllStudents();
    }
}
