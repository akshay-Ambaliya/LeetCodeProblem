/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyProblems;

/**
 *
 * @author Dell
 */
public class Problem35 {
    public static void main(String[] args) {
        System.out.println(Problem35.searchInsert(new int[]{1,3,5,6,9},9));
    }
    
    public static int searchInsert(int[] nums, int target) {
        int min = 0,max=nums.length-1,mid=0;
        
        while(min<=max){
            mid = (min+max)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                min = mid+1;
            }
            else if(nums[mid]>target){
                max = mid-1;
            }
        }
        return min;
        
    }
}
