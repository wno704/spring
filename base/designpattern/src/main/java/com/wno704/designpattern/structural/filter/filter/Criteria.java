package com.wno704.designpattern.structural.filter.filter;

import com.wno704.designpattern.structural.filter.model.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
