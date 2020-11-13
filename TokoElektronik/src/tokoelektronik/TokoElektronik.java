/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoelektronik;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alan
 */
public class TokoElektronik {
    /**
     * @param args the command line arguments
     */
    static Scanner inp = new Scanner (System.in);
    static ArrayList <barang> data  = new ArrayList<>();
    public static void main(String[] args) {
        int pil;
        do{
            System.out.println("1. input");
            System.out.println("2. view");
            System.out.println("3. update");
            System.out.println("4. delete");
            System.out.println("0. exit");
            System.out.print("pilih ");
            pil = inp.nextInt();
            switch(pil){
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
            }
        }while(pil!=0);
    }
    static void input(){
        System.out.print("Nama barang = ");
        String nama = inp.next();
        System.out.print("harga barang = ");
        double harga = inp.nextDouble();
        data.add(new barang(nama,harga));
    }
    
    static void view(){
        System.out.println(data.size());
        for(int i=0;i<data.size();i++){
                System.out.println("nama = "+data.get(i).getNama());
                System.out.println("harga "+data.get(i).getHarga());
        }
    }
    static void update(){
        System.out.println("index ke ");
        int index = inp.nextInt();
        System.out.print("Nama barang = ");
        String nama = inp.next();
        System.out.print("harga barang = ");
        double harga = inp.nextDouble();
        data.set(index, new barang(nama,harga));
    }
    static void delete(){
        System.out.println("index ke ");
        int index = inp.nextInt();
        data.remove(index);
    }
}
