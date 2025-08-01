/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class Problem136 {
    public static void main(String[] args) {
        System.out.println(Problem136.singleNumber(new int[]{4,1,2,1,2}));
    }
    
    public static int singleNumber(int[] nums) {
          if(nums.length == 1) return nums[0];
          
          int result=0;
          
          for(int i=0;i<nums.length;i++){
              result = result^nums[i];
          }
          
          return result;
    }
}
