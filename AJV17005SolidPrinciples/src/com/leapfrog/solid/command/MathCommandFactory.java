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
public class MathCommandFactory {
    public MathCommand get(int ch){
        switch(ch){
            case 1:
                return new AddCommand();
            case 2:
                return new SubCommand();
            case 3:
                return new MaxCommand();
            case 4:
                return new MinCommand();
            case 5:
                return new PowerCommand();
            case 6:
                return new ExitCommand();
        }
        return null;
    }
}
