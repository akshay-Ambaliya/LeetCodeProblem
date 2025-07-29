/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

import java.awt.BorderLayout;
import java.util.Stack;

/**
 *
 * @author Dell
 */
public class Problem20 {
    public static void main(String[] args) {
        System.out.println(Problem20.isValid("]"));
    }
    
    public static boolean isValid(String s){
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            if(stack.isEmpty())
            switch(s.charAt(i)){
                case '{':
                case '(':
                case '[':
                    stack.push(s.charAt(i));
                break;
                case '}':
                    if(stack.peek()=='{' && !stack.isEmpty())stack.pop();
                    else return false;
                break;
                case ']':
                    if(!stack.isEmpty() && stack.peek()=='[' )stack.pop();
                    else return false;
                break;
                case ')':
                    if(!stack.isEmpty() && stack.peek()=='(' )stack.pop();
                    else return false;
                break;
                        
            }

                
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
