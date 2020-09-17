package com.wno704.designpattern.behavioral.visitor.visitor.impl;

import com.wno704.designpattern.behavioral.visitor.computer.part.Computer;
import com.wno704.designpattern.behavioral.visitor.computer.part.Keyboard;
import com.wno704.designpattern.behavioral.visitor.computer.part.Monitor;
import com.wno704.designpattern.behavioral.visitor.computer.part.Mouse;
import com.wno704.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
