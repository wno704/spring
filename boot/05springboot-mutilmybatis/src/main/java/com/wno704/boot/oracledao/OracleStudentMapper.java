package com.wno704.boot.oracledao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository("oracleStudentMapper")
public interface OracleStudentMapper {
    List<Map<String, Object>> getAllStudents();
}
