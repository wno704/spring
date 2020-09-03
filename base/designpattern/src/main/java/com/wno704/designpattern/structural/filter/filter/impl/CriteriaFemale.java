package com.wno704.designpattern.structural.filter.filter.impl;

import com.wno704.designpattern.structural.filter.filter.Criteria;
import com.wno704.designpattern.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
