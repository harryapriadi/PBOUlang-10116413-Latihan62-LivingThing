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
public class Human extends LivingThing {
 private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama){
        System.out.println("Sedang Berjalan");
    }   
}