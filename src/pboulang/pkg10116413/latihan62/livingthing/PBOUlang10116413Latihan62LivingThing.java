/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan62.livingthing;

/**
 *
 * @author Lenovo
 */
public class PBOUlang10116413Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Human human = new Human();
        human.setNama("Harry Apriadi");
        System.out.print(human.getNama()+" ");
        human.walk("");
        System.out.print(human.getNama()+" ");
        human.breath("");
        System.out.print(human.getNama()+" ");
        human.eat("");
    }
    
}