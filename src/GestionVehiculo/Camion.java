/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionVehiculo;

class Camion extends Vehiculo implements Mantenimiento {
    private double peso;

    public Camion(String matricula, String marca, String modelo, int añoFabricacion, double peso) {
        super(matricula, marca, modelo, añoFabricacion);
        this.peso = peso;
    }

    @Override
    public double calcularCostoMantenimiento() {
        int antiguedad = 2024 - getAñoFabricacion();
        return peso * 0.5 + antiguedad * 50;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revision realizada al camion " + getMatricula());
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Aceite cambiado al camion " + getMatricula());
    }
}

