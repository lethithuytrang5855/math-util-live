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
public class MathUtil {
        public static long getFactorial(int n){
            if(n<0 || n>20){
                throw new IllegalArgumentException("ERROR!");
            }
            if(n==0 || n==1){
                return 1;
            }
            long s=1;
            for(int i=2; i<= n; i++)         
            s *=i;            
            return s;
            
            
          
        }
}
