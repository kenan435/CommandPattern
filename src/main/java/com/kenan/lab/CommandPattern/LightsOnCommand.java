package com.kenan.lab.CommandPattern;

// Concrete command
public class LightsOnCommand implements Command {

    // We need a reference to light
    Light light;

    public LightsOnCommand( final Light light ) {

        this.light = light;
    }

    public void execute() {

        light.switchOn();

    }

}
