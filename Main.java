/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopi;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
    ArrayList<String> kopi   = new ArrayList<String>();
    ArrayList<String> topping= new ArrayList<String>();
    
        Kopi robusta = new Kopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
        robusta.setTopping("Gula");
        topping.add(robusta.getTopping());
        
        Kopi arabica = new Kopi();
        arabica.setJenisKopi("arabica");
        arabica.setJumlahStokKopi(40);
        kopi.add(arabica.getJenisKopi());
        arabica.setTopping("Susu");
        topping.add(arabica.getTopping());
        
        Kopi flores = new Kopi();
        flores.setJenisKopi("flores");
        flores.setJumlahStokKopi(40);
        kopi.add(flores.getJenisKopi());
        flores.setTopping("Cream");
        topping.add(flores.getTopping());
        
	for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }
        

        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Menu Topping adalah "+j+" "+topping.get(i));
        }
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
        int pilihantopping = keyboard.nextInt() -1;
        
        System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihanKopi) + " dengan topping " + topping.get(pilihantopping));
    
}
}
