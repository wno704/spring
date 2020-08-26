package com.wno704.boot.service;

import java.util.List;

public interface BaseService<T> {
	
	List<T> selectAll();

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
    
}
