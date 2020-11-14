/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan43.gajipegawai;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan gaji pegawai
 * dengan pendekatan berorientasi objek
 */
public class IF110119032Latihan43GajiPegawai {
    public static void main(String[] args) {
        GajiPegawai pegawai1 = new GajiPegawai();
        pegawai1.setNama("Ginanjar Tubagus Gumilar");
        pegawai1.setAlamat("Jalan Semar dlm 4 no 72/66");
        pegawai1.setUangTransport(250000);
        pegawai1.setUangTunjangan(300000);
        pegawai1.setUangTunjangan(300000);
        pegawai1.setGajiPokok(4500000);
        pegawai1.setTotalGaji(pegawai1.getGajiPokok());
        pegawai1.tampilData(pegawai1.getNama(), 
                pegawai1.getAlamat(), 
                pegawai1.getUangTunjangan(), 
                pegawai1.getUangTransport(), 
                pegawai1.getGajiPokok(), 
                pegawai1.getTotalGaji());
    }
}