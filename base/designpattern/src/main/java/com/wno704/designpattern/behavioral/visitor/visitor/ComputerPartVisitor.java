package com.wno704.designpattern.behavioral.visitor.visitor;

import com.wno704.designpattern.behavioral.visitor.computer.part.Computer;
import com.wno704.designpattern.behavioral.visitor.computer.part.Keyboard;
import com.wno704.designpattern.behavioral.visitor.computer.part.Monitor;
import com.wno704.designpattern.behavioral.visitor.computer.part.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
