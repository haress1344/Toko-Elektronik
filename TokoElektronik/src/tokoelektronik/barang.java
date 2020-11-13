/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoelektronik;

/**
 *
 * @author alan
 */
public class barang {
    String nama;
    double harga;

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}
