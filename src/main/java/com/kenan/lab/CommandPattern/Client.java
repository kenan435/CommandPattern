package com.kenan.lab.CommandPattern;

// https://dzone.com/articles/design-patterns-command

/*
 * This pattern ends up forcing a lot of Command classes that will 
 * make your design look cluttered - more operations being made possible 
 * leads to more command classes. Intelligence required of which 
 * Command to use and when leads to possible maintainence issues 
 * for the central controller.
 * 
 */

/**
 * @author Kenan Karamehmedovic
 *
 */
// Client
public class Client {

    public static void main( final String[] args ) {

        final RemoteControl control = new RemoteControl();
        final Light light = new Light();

        final Command lightsOn = new LightsOnCommand( light );
        final Command lightsOff = new LightsOffCommand( light );

        // switch on
        control.setCommand( lightsOn );
        control.pressButton();

        // switch off
        control.setCommand( lightsOff );
        control.pressButton();
    }
}