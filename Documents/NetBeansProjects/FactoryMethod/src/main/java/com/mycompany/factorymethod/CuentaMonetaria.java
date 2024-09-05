/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author USUARIO
 */
public class CuentaMonetaria implements CuentadeBanco {
       @Override
    public Boolean ValidarIdentidadUsuario(String Usuario) {
   Boolean esValido = false;
        return esValido;
    }

    @Override
    public double CalcularRangoInteres(double monto) {
    double tasa = 0.12;
    double MontoMasInteres;
    MontoMasInteres = monto*tasa;
    
    return MontoMasInteres;
    }

    @Override
    public boolean RegistrarCuenta(String Registrar) {
    String Id = "";
    String contraseña = "";
    boolean seRegistro = false;
    
    return seRegistro;
    }
    
}
