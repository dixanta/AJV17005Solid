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
public class MathContext {
    private MathCommand cmd;
    
    public MathContext(MathCommand cmd){
        this.cmd=cmd;
    }
    
    public void doOperation(double x, double y){
        System.out.println(cmd.calculate(x, y));
    }
    
    
}
