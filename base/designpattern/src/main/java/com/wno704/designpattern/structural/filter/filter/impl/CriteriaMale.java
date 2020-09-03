package com.wno704.designpattern.structural.filter.filter.impl;

import com.wno704.designpattern.structural.filter.filter.Criteria;
import com.wno704.designpattern.structural.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
