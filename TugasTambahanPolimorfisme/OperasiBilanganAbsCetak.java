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
final class OperasiBilanganAbsCetak {
    public void
    cetakSemua(OperasiBilanganAbs[]OB,double a,double b){
    for(int i = 0; i< OB.length;i++){
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].tampil();
            System.out.println("");
        }    
}

    
}
