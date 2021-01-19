/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktoriai;

/**
 *
 * @author 37067
 */
public class Konstruktoriai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        K2 k = new K2("Alius");
//        k.labas();
//        k.labas("Pone");
//        k.labas(8);
//        k.labas("Ponaiti", 3);
//        k.labas(2, "gerbiamasis");
//        K2 b = new K2();
//        b.labas();
//        b.labas(3, "gerbiamasis");
        K3 c = new K3();
        c.labas();
        System.gc();
        
        System.out.println("pabaiga");
    }
    
}
