/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Problem121 {
    
    public static void main(String[] args) {
        System.out.println(Problem121.maxProfit(new int[]{2,4,1}));
    }
            
    public static int maxProfit(int[] prices) {
        
        if(prices.length==1)return 0;
        else{
            int min=prices[0],max=prices[0];
            int diff=0;
            for(int i=0;i<prices.length;i++){               
                if(prices[i]>max){
                    max=prices[i];
                }
                if(prices[i]<min){
                    min=prices[i];
                    max=prices[i];
                } 
                if(max-min > diff)
                   diff=max-min;
                System.out.println(min + " "  + max);
            }
            return diff;
        }
    }
}
