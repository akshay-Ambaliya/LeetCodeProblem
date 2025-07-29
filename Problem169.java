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
public class Problem169 {
    
    
    public static void main(String[] args) {
        Problem169.majorityElement(new int[]{1,2,3,3,3,3,3,4,1,2,2});
    }
    
    public static int majorityElement(int[] nums) {
        
        if(nums.length==1)return nums[0];
        Arrays.sort(nums);
        
        int max=0;
        int lastmax=0,element=0 ;
        
        for(int i=0;i<nums.length;i++){
            if(i<=nums.length-2 && nums[i]!=nums[i+1]) max=0;
            else if( i<=nums.length-2 && nums[i]==nums[i+1]){
                max++;
            } 
            if(lastmax<max){
                lastmax=max;
                element = nums[i];
            }
        }
        
        System.out.println(element);
        return element;
    }
}
