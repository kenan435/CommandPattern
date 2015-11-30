package com.kenan.lab.CommandPattern;

//Concrete Command
public class LightsOffCommand implements Command {
    // reference to the light
    Light light;

    public LightsOffCommand( final Light light ) {

        this.light = light;
    }

    public void execute() {

        light.switchOff();
    }
}