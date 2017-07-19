/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.solid.command;

/**
 *
 * @author USER
 */
public class ExitCommand extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        System.exit(0);
        return 0;
    }
    
}
