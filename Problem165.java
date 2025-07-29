/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem165 {
    public static void main(String[] args) {
        System.out.println(Problem165.convertToTitle(701));
    }
    
    public static String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder("");
        int rem=0;
        while(columnNumber>0){
            columnNumber--;
            rem = columnNumber%26;
            result.append((char)(rem+'A'));
            columnNumber /=26;
        }
        return result.reverse().toString();
    }
}
