package com.wno704.designpattern.behavioral.iterator;

import com.wno704.designpattern.behavioral.iterator.container.Iterator;
import com.wno704.designpattern.behavioral.iterator.container.impl.NameRepository;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
