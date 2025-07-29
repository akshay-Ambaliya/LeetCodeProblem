/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Dell
 */
public class Problem26 {
    public static void main(String[] args) {
        System.out.println(Problem26.removeDuplilcates(new int[]{2,5,4,4,4,6,7,7,8,8,8,}));
        
    }
    
    public static int removeDuplilcates(int [] nums){
    
        int element=0;
        for(int i = 1; i<nums.length;i++){ 
            if(nums[i]!=nums[element]){
                element++;
                nums[element] = nums[i];
            }
        }
        
        return element+1;
    } 
    
}
