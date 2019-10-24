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
public class Human extends LivingThing {
    
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(getNama()+" Sedang Berjalan");; //To change body of generated methods, choose Tools | Templates.
    }
    
}
