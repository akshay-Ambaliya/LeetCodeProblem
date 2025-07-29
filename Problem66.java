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
public class Problem66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Problem66.plusOne(new int[]{9,9,9,9})));
    }
    
    public static int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length-1];
        boolean all9 = true;
        if(lastDigit>=0 && lastDigit<=8){
            digits[digits.length-1]++;
        }else{
            for(int i=0;i<digits.length;i++){
                if(digits[i]!=9){
                    all9 = false;
                    break;
                }
            }
            
            
            if(all9){
                int[] result = new int[digits.length+1];
                result[0] = 1;
                for(int i=1;i<result.length;i++){
                    result[i]=0;
                }
                return result;
            }else{
                int i;
                for( i=digits.length-1;digits[i]==9;i--){
                    digits[i]=0;
                }
                digits[i]++;
                
            }
        }
        digits.equals(all9);
        
        return digits;
    }
}
