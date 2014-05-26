/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1562339
 */
public class Elipse implements FiguraComEixos{
    private double area;
    private double perimetro;
    
    public  double getArea(double r, double s){
        this.area = Math.PI*r*s;
        return this.area;
    }
    public double getPerimetro(double r, double s){
        this.perimetro = Math.PI*Math.abs(3*(r + s) - Math.sqrt((3*r + s)*(r + 3*s)));
        
        return this.perimetro;
    }

    @Override
    public double getEixoMenor() {
        return 0;
    }

    @Override
    public double getEixoMaior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
