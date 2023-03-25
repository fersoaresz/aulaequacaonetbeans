/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojeto1;
public class ProjetoClasse {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    
    
    
    public double calculaDelta(double a, double b, double c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
        
        setDelta((Math.pow (b,2))-(4*a*c));
        
        return getDelta();
    }
    
    public double calculaDelta(){
        this.setA(getA());
        this.setB(getB());
        this.setC(getC());
        this.setDelta((Math.pow(getB(), 2)) - (4 * getA() * getC()));
        return getDelta();
    }
    
    public double calculax1(){
        
        setX1(-getB() + Math.sqrt(getDelta()) / 2 * getA());
        return getX1();
    }
    
    public double calculax2(){
        setX2(-getB() - Math.sqrt(getDelta()) / 2 * getA());
        return getX2();
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the delta
     */
    public double getDelta() {
        return delta;
    }

    /**
     * @param delta the delta to set
     */
    public void setDelta(double delta) {
        this.delta = delta;
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }

    
}   





