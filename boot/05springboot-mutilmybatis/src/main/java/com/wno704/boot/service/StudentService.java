package com.wno704.boot.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<Map<String, Object>> getAllStudentsWithMysql();
    List<Map<String, Object>> getAllStudentsWithOracle();
}
