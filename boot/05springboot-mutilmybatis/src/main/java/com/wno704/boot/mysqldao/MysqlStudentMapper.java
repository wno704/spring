package com.wno704.boot.mysqldao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository("mysqlStudentMapper")
public interface MysqlStudentMapper {
    List<Map<String, Object>> getAllStudents();
}
