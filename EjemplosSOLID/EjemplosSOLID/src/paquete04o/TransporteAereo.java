/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

public class TransporteAereo extends Transporte {
    
    private String cooperativaAereo;

    public void establecerCooperativaAereo(String n) {
        cooperativaAereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 15.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return cooperativaAereo;
    }
    
}
