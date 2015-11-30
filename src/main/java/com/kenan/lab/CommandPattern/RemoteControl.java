package com.kenan.lab.CommandPattern;

// Our invoker in this case is the remote control.
public class RemoteControl {

    private Command command;

    public void setCommand( final Command command ) {

        this.command = command;
    }

    public void pressButton() {

        command.execute();
    }

}
