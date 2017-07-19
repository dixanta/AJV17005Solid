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
public abstract class MathCommand {
    
    public abstract double calculate(double x,double y);
    
    public void test(){
        System.out.println("This is test method");
    }
}

