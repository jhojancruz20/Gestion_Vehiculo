
package GestionVehiculo;

abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int añoFabricacion;

    public Vehiculo(String matricula, String marca, String modelo, int añoFabricacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void mostrarInformacion() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricacion: " + añoFabricacion);
    }

    public abstract double calcularCostoMantenimiento();
}
