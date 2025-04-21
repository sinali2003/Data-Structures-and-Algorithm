/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datastrucre;
import java.util.LinkedList;
import java.util.SequencedCollection;



/**
 *
 * @author HP
 */
public class sequencedcollection {
    public sequencedcollection(){
        SequencedCollection sc = new LinkedList();
        sc.addFirst(7);
        sc.addFirst(3);
        sc.addLast(8);
        System.out.println(sc.getFirst());
        System.out.println(sc.removeLast());
        System.out.println(sc);
        System.out.println(sc.reversed());
    }
    public static void main(String[] args){
        new sequencedcollection();
    }
    
}
