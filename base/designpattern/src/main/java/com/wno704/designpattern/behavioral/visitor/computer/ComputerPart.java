package com.wno704.designpattern.behavioral.visitor.computer;

import com.wno704.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
