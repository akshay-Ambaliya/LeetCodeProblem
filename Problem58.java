/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem58 {
    public static void main(String[] args) {
        Problem58.lengthOfLastWord("Hello how are 6465    ");
    }
    
    public static int lengthOfLastWord(String s) {
        
        String result[]= s.trim().split(" ");
        System.out.println(result[result.length -1].length());
        return result[result.length -1].length();
    }
            
}
