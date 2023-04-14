/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Local;

/**
 *
 * @author Valentina Contreras
 */
@Local
public interface CalcBeanLocal {

    Integer suma(int val1, int val2);

    Integer resta(int val1, int val2);

    Integer multiplicacion(int val1, int val2);

    Integer division(int val1, int val2);

    double Elevaralcuadrado(int val);

    Integer Modulo(int val1, int val2);

    



  
    
}
