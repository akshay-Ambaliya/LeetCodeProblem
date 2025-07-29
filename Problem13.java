/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package easyProblems;
import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class Problem13 {
    public static void main(String[] args) {
        System.out.println(Problem13.romanToInt("MCMXCIV"));
    }
    
    public static int romanToInt(String s) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);

        int result = 0,sum;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                sum=hm.get(s.charAt(i)+""); 
            }
            else if(hm.get(s.charAt(i)+"") < hm.get(s.charAt(i+1)+"")){
                sum=hm.get(s.charAt(i+1)+"") - hm.get(s.charAt(i)+"");
                i++;
            }
            else{
                sum=hm.get(s.charAt(i)+"");
            }
            result+=sum;
        }
        return result;
    }
}
