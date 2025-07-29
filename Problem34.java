/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medium;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Problem34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Problem34.searchRange(new int[]{1,1,1,2,2,5,5,5,5,7,7,8,9,16},5)));

    }    
    
    public static int[] searchRange(int[]nums ,int target){
        int min=0,max=nums.length-1,mid = nums.length/2;
        int from,to,index=-1;
        if(nums.length == 0|| (nums.length == 1 && target!=nums[0])) return new int[]{-1,-1};
	else if(nums.length == 1 && target==nums[0]) return new int[]{0,0};
        else {
            while(min<=max){
                mid = (max+min)/2;
                
                if(nums[mid]==target){
                    index = mid;
                    break;
                }
                else if(nums[mid] < target){
                    min = mid+1;
                }
                else if(nums[mid] > target){
                    max = mid-1;
                }
            }
           
            if(index==-1)return new int[]{-1,-1};
            
            from =index;
            to = index;
            while(from!=0&&nums[from-1]==target) from--;
            while(to!=nums.length-1&&nums[to+1] == target) to++;
            
            return new int[]{from,to};
        }
        
    }
}
