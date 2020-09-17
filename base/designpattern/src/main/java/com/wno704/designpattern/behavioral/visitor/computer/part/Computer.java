package com.wno704.designpattern.behavioral.visitor.computer.part;

import com.wno704.designpattern.behavioral.visitor.computer.ComputerPart;
import com.wno704.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
