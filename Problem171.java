/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem171 {
    
    public static void main(String[] args) {
        System.out.println(Problem171.titleToNumber("YZ"));
    }
    
    public static int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int result=0;
        int pow = 1;
        while(length!=0){
            result += (pow*(columnTitle.charAt(length-1)-64));
            pow*=26;
            length--;
        }
        
        return result;
    }
}
