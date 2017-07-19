/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.solid;

import com.leapfrog.solid.command.AddCommand;
import com.leapfrog.solid.command.MathCommand;
import com.leapfrog.solid.command.MathCommandFactory;
import com.leapfrog.solid.command.MathContext;
import com.leapfrog.solid.command.MaxCommand;
import com.leapfrog.solid.command.MinCommand;
import com.leapfrog.solid.command.PowerCommand;
import com.leapfrog.solid.command.SubCommand;
import com.leapfrog.solid.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=5,y=3;
        MathContext ctx=new MathContext(new PowerCommand());
        ctx.doOperation(x, y);
    }

}
