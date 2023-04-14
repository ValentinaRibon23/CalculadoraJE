/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Stateless;

/**
 *
 * @author Valentina Contreras
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer suma(int val1, int val2) {
        return (val1+val2);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer resta(int val1, int val2) {
        return (val1-val2);
    }

    @Override
    public Integer multiplicacion(int val1, int val2) {
        return (val1*val2);
    }

    @Override
    public Integer division(int val1, int val2) {
        return (val1/val2);
    }

    @Override
    public double Elevaralcuadrado(int val) {
        return Math.pow(val, 2);
    }

    @Override
    public Integer Modulo(int val1, int val2) {
        return (val1%val2);
    }
    
    
 
}
