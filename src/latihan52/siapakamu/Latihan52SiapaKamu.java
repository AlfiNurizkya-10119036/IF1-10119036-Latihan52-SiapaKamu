/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan52.siapakamu;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Memasukkan Data Manusia
 */
public class Latihan52SiapaKamu {
    public static void main(String[] args) {
    Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119036");
        System.out.println("NIM MAHASISWA : ".concat(mahasiswa.getNim()));
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}