/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem70 {
    public static void main(String[] args) {
        System.out.println(Problem70.climbStairs(7));
    }
    
    
    public static int climbStairs(int n) {
        if(n<4) return n;
        int a=1,b=2;
        int result=0;
        for(int i=2;i<n;i++){
            result=a+b;
            a=b;
            b=result;
        }
       
        return result;
    }
}
