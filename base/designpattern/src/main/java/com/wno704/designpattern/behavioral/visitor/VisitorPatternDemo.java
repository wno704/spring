package com.wno704.designpattern.behavioral.visitor;

import com.wno704.designpattern.behavioral.visitor.computer.ComputerPart;
import com.wno704.designpattern.behavioral.visitor.computer.part.Computer;
import com.wno704.designpattern.behavioral.visitor.visitor.impl.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
