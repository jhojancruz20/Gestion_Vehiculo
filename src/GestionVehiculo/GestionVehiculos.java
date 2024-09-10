package GestionVehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionVehiculos {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Gestion de Vehiculos");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Consultar costo de mantenimiento");
            System.out.println("3. Realizar mantenimiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarVehiculo(scanner);
                    break;
                case 2:
                    consultarCostoMantenimiento(scanner);
                    break;
                case 3:
                    realizarMantenimiento(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
    }

    private static void registrarVehiculo(Scanner scanner) {
        System.out.print("Ingrese la matricula: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año de fabricacion: ");
        int año = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("//////////////////////////////////");

        System.out.println("Tipo de vehículo (1. Coche, 2. Camion, 3. Motocicleta): ");
        int tipo = scanner.nextInt();

        Vehiculo vehiculo = null;

        switch (tipo) {
            case 1:
                vehiculo = new Coche(matricula, marca, modelo, año);
                break;
            case 2:
                System.out.print("Ingrese el peso del camion: ");
                double peso = scanner.nextDouble();
                vehiculo = new Camion(matricula, marca, modelo, año, peso);
                break;
            case 3:
                System.out.print("Ingrese la cilindrada de la motocicleta: ");
                int cilindrada = scanner.nextInt();
                vehiculo = new Motocicleta(matricula, marca, modelo, año, cilindrada);
                break;
            default:
                System.out.println("Tipo de vehiculo invalido.");
                return;
        }

        vehiculos.add(vehiculo);
        System.out.println("Vehiculo registrado con exito.");
    }

    private static void consultarCostoMantenimiento(Scanner scanner) {
        System.out.print("Ingrese la matricula del vehiculo: ");
        String matricula = scanner.nextLine();

        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                v.mostrarInformacion();
                System.out.println("Costo de Mantenimiento: $" + v.calcularCostoMantenimiento());
                return;
            }
        }

        System.out.println("Vehiculo no encontrado.");
    }

    private static void realizarMantenimiento(Scanner scanner) {
        System.out.print("Ingrese la matricula del vehiculo: ");
        String matricula = scanner.nextLine();

        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                if (v instanceof Mantenimiento) {
                    Mantenimiento m = (Mantenimiento) v;
                    m.realizarRevision();
                    m.cambiarAceite();
                } else {
                    System.out.println("Este vehiculo no soporta operaciones de mantenimiento.");
                }
                return;
            }
        }

        System.out.println("Vehiculo no encontrado.");
    }
}

