/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaequacao;

/**
 *
 * @author Glender
 */
public class AulaEquacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Equacao eq = new Equacao();
        double delta, x1, x2;
        
        eq.setA(2);
        eq.setB(3);
        eq.setC(1);
        
        delta = eq.calculaDelta();
        x1 = eq.calculaX1();
        x2 = eq.calculax2();
        
        System.out.println("Delta = " + delta +
                "\n X1 = " + x1 +
                "\n X2 = " + x2);
                
        
        
        
        
        
        
    }
    
}
