/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datastrucre;
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author HP
 */
public class set {
    public set(){
        Set<Integer>myset = new HashSet();
        myset.add(8);
        myset.add(5);
        myset.add(8);
        myset.add(2);
        myset.add(6);
        myset.remove(2);
        System.out.println(myset);
        
    }
    public static void main(String[] args){
        new set();
        
        
    }
    
}
