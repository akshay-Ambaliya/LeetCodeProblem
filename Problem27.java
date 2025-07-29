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
public class Problem27 {
    public static void main(String[] args) {
        Problem27.removeElement(new int[]{2,2,5,4,5}, 2);
    }
            
    public static int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
