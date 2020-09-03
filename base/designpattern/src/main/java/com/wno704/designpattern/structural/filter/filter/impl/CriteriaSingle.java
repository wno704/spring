package com.wno704.designpattern.structural.filter.filter.impl;

import com.wno704.designpattern.structural.filter.filter.Criteria;
import com.wno704.designpattern.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
