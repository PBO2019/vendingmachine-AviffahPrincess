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
public class Kopi {
    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;
    
    public void setJenisKopi(String JenisKopi){
        this.JenisKopi = JenisKopi;
    }
    
    public String getJenisKopi(){
        return JenisKopi;
    }
    
    public void setJumlahStokKopi(int JumlahKopi){
        this.JumlahStokKopi = JumlahStokKopi;
    }
    
    public int getJumlahStokKopi(){
        return JumlahStokKopi;
    }
    public void setTopping(String Topping){
        this.Topping=Topping;
    }
    public String getTopping(){
        return Topping;
    }
    }



   