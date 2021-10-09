/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println("5!= 120; actual: "+ result);
        
        System.out.println("3!= 6; actual: "+ MathUtil.getFactorial(3));
        //MathUtil.getFactorial(-5);
    }
    
}
