/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datastrucre;

import java.util.LinkedList;
import java.util.Collection;

        

/**
 *
 * @author HP
 */
public class collectionimplementation {
    public collectionimplementation(){
        Collection c = new LinkedList();
        c.add(4);
        c.add(3);
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains(4));
        c.remove(4);
        System.out.println(c);
    }
    public static void main(String[] args){
        new collectionimplementation();
        
    }
    
    
}
