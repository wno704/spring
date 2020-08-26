package com.wno704.boot.service.impl;

import org.springframework.stereotype.Repository;

import com.wno704.boot.model.Person;
import com.wno704.boot.service.PersonService;

@Repository("personService")
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService{

}
