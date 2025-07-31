/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Problem202 {
    public static void main(String[] args) {
        System.out.println("Hello World\n");
        System.out.println(Problem202.isHappy(4));
    }
    
    public static boolean isHappy(int n) {
        
        Set<Integer> coll = new HashSet<Integer>();
        int sum=n;
        while(sum!=1){
            
            sum = squareOfNumber(sum);
            if(coll.contains(sum))return false;
            coll.add(sum);
        }
        return true;
    }

    public static int squareOfNumber(int n){
    
        int sum=0;
        int digit=0;
        while(n!=0){
            digit=n%10;
            sum+=(digit*digit);
            n/=10;
        }
        System.out.println("Sum : " + sum);
        return sum;
    }
}
