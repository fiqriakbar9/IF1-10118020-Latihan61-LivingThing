/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livingthing;

/**
 *
 * @author 'KoalaX'
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1 
 * Deskripsi Program : Program ini berisi program untuk menampilkan kegiatan
 * mahluk Hidup
 */
public abstract class LivingThing {
    
   public abstract void walk(String nama);
   
   public void breath(String nama){
       System.out.println(nama+" Bernafas");
   }
   
   public void eat(String nama){
       System.out.println(nama+" Makan");
   }
}
