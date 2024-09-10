/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionVehiculo;

class Coche extends Vehiculo implements Mantenimiento {
    public Coche(String matricula, String marca, String modelo, int añoFabricacion) {
        super(matricula, marca, modelo, añoFabricacion);
    }

    @Override
    public double calcularCostoMantenimiento() {
        int antiguedad = 2024 - getAñoFabricacion();  // Considera 2024 como año actual
        return 100 + antiguedad * 10;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revision realizada al coche " + getMatricula());
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Aceite cambiado al coche " + getMatricula());
    }
}

