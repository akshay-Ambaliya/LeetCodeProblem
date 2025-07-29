/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem28 {
    public static void main(String[] args) {
        
    }
    
    public static int  strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        else{
            for(int i=0;i<haystack.length()-1;i++){
                if(haystack.substring(i).startsWith(needle))
                    return i;
            }
        }
        
        return -1;
    }
}
