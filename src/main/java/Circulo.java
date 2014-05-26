/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1562339
 */
public class Circulo extends Elipse{
    private double perimetro;
    public double getPerimetro(double r){
        this.perimetro = 2*Math.PI*r;
        return this.perimetro;
    }
}
