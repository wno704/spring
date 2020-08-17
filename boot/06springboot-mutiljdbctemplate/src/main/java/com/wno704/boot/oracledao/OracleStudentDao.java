package com.wno704.boot.oracledao;

import java.util.List;
import java.util.Map;

public interface OracleStudentDao {
    List<Map<String, Object>> getAllStudents();
}
