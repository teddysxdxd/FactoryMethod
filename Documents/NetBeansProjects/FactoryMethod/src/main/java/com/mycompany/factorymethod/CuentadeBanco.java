/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author USUARIO
 */
public interface CuentadeBanco {
    
    Boolean ValidarIdentidadUsuario(String Usuario);
    double CalcularRangoInteres (double monto);
    boolean RegistrarCuenta (String Registrar);
    
    
    
}
