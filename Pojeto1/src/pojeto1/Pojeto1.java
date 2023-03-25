/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pojeto1;

/**
 *
 * @author ferna
 */
public class Pojeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProjetoClasse eq = new ProjetoClasse();
        double delta,x1,x2;
        eq.setA(2);
        eq.setB(3);
        eq.setC(1);
        
        delta = eq.calculaDelta();
        x1 = eq.calculax1();
        x2 = eq.calculax2();
        
        
        
        System.out.println("Delta = " + delta + "\n x1 = " + x1 +"\n x2 = " + x2);
                
      
    }
    
    
}
