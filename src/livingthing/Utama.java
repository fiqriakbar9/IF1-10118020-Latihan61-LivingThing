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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human human = new Human();
        
        human.setNama("Rizki Adam Kurniawan");
        
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
        
    }
    
}
