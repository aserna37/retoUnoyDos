/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounoydos;

import java.text.DecimalFormat;


/**
 *
 * @author USER
 */
public class Division extends Operacion{
    
    double division;
    
    public Division(double numero1, double numero2){
    super(numero1,numero2);
    this.division = numero1 / numero2;
        
    this.respuesta = Math.round(this.division * Math.pow(10, 2)) / Math.pow(10, 2);
    
    }
}
