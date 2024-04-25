package com.design.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command to execute");
    }

    @Override
    public void undo() {

    }
}
