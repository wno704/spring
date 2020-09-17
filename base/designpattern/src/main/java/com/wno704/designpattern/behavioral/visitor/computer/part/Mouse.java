package com.wno704.designpattern.behavioral.visitor.computer.part;

import com.wno704.designpattern.behavioral.visitor.computer.ComputerPart;
import com.wno704.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}