/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTambahanPolimorfisme;

/**
 *
 * @author ASUS
 */
public class OperasiPengurangan extends OperasiBilanganAbs {
    protected double a,b,c;
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(){
        this.c = this.a - this.b;
    }
    protected double get_A(){
        return a = a;
    }
    protected double get_B(){
        return b = b;
    }
    protected double get_C(){
        return c = c;
    }
    protected void tampil(){
        set_C();
        System.out.println("Hasil penjumlahan a - b adalah " +get_C());
}
}
