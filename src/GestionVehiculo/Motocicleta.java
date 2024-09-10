/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionVehiculo;

class Motocicleta extends Vehiculo implements Mantenimiento {
    private int cilindrada;

    public Motocicleta(String matricula, String marca, String modelo, int añoFabricacion, int cilindrada) {
        super(matricula, marca, modelo, añoFabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCostoMantenimiento() {
        int antiguedad = 2024 - getAñoFabricacion();
        return cilindrada * 0.1 + antiguedad * 20;
    }

    @Override
    public void realizarRevision() {
        System.out.println("Revision realizada a la motocicleta " + getMatricula());
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Aceite cambiado a la motocicleta " + getMatricula());
    }
}

