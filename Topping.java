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
public class Topping {
    private String JenisTopping;
    private int JumlahStokTopping;
    
    public void setJenisTopping(String JenisTopping){
        this.JenisTopping = JenisTopping;
    }
    public String getJenisTopping(){
        return JenisTopping;
    }
    public void setJumlahStokTopping(int JumlahStokTopping){
        this.JumlahStokTopping = JumlahStokTopping;
    }
    public int JumlahStokTopping(){
        return JumlahStokTopping;
    }
}
