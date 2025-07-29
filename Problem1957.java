/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

import java.util.Stack;

/**
 *
 * @author Dell
 */
public class Problem1957 {
    public static void main(String[] args) {
        System.out.println(Problem1957.makeFancyString(new String("aakkkkshay")));
    }
    
    public static String makeFancyString(String s) {
        
        if(s.length() < 3)return s;
        int count=0;
        char ch = s.charAt(0);
        StringBuilder result=new StringBuilder("");
        
        for(char c:s.toCharArray()){

            if (c == ch) {
                count++;
            } else {
                ch = c;
                count = 1;
            }

            if (count < 3) {
                result.append(c);
            }
            
        }
        
        
        return result.toString();
    }
}
