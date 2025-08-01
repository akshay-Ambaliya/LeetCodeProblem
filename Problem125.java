/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem125 {
    
    public static void main(String[] args) {
        System.out.println(Problem125.isPalindrome(".a"));
    }
    
    public static boolean isPalindrome(String s) {
        
        if(s.length() == 1) return true;
        StringBuilder result=new StringBuilder("");
        s = s.toLowerCase();
        System.out.println(s.toLowerCase());
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) >= 'a' && s.charAt(i)<='z') || (s.charAt(i) >= '0' && s.charAt(i)<='9'))
            {
                result.append(s.charAt(i));
            }
        }
        String original = result.toString();
        String cleaned = result.reverse().toString();
        
        
        return original.equals(cleaned);
        
        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }
}
