/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datastrucre;
import java.util.LinkedHashSet;
import java.util.SequencedSet;



/**
 *
 * @author HP
 */
public class sequencedset {
    public sequencedset(){
        SequencedSet<Integer> myset = new LinkedHashSet();
        myset.add(5);
        myset.add(2);
        myset.add(5);
        myset.add(3);
        myset.add(4);
        myset.remove(2);
        System.out.println(myset);
    }
    public static void main(String[] args){
        new sequencedset();
    }
    
}
