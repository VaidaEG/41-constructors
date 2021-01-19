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
public class K2 extends K1 {
    private String vardas;
    
    public K2(String vardas) {
        // super();
        this.vardas = vardas;
    }
    public K2() {
        this("anonymous");
        System.out.println("Pradedu");
    }
    public void labas() {
        System.out.println("Labas " + this.vardas);
    }
    public void labas(String kreipinys) {
        System.out.println("Labas " + kreipinys + " " + this.vardas);
    }
    public void labas(int kiek) {
        for (int i = 0; i < kiek; i++) {
            System.out.println("Labas " + this.vardas);
        }
    }
    public void labas(String kreipinys, int kiek) {
        for (int i = 0; i < kiek; i++) {
            System.out.println("Labas " + kreipinys + " " + this.vardas);
        }
    }
    public void labas(int kiek, String kreipinys) {
        for (int i = 0; i < kiek; i++) {
            System.out.println("Labas " + kreipinys + " " + this.vardas);
        }
    }
    
}
