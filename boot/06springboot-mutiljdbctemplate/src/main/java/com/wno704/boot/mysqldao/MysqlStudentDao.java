package com.wno704.boot.mysqldao;

import java.util.List;
import java.util.Map;

public interface MysqlStudentDao {
    List<Map<String, Object>> getAllStudents();
}
