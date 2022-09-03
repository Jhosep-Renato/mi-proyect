package domain;

import java.util.Scanner;
import paquete.Paquete;
import sucursal.Sucursal;

public class Main {

    public static int buscarSucursal(Sucursal t[], int conteoSucursal, int numero) {
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i < conteoSucursal; i++) {
            if (t[i].getNumeroSucursal() == numero) {
                indice = i;
                encontrado = true;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int opciones, nmrSucursal, dni, nmrReferencia, peso, prioridad, conteoSucursal = 0, conteoPaquete = 0, sucursales = 0;
        String direccion, ciudad;
        Paquete paquete[] = new Paquete[50];
        Sucursal sucursal[] = new Sucursal[50];

        do {
            System.out.println("...OPCIONES...");
            System.out.println("1. Agregar Sucursales");
            System.out.println("2. Enviar paquetees");
            System.out.println("3. COnsulta de sucursales");
            System.out.println("4. Consulta de paquetes");
            System.out.println("5. EXIT");
            opciones = valor.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("");
                    System.out.print("Ingrese el numero de la sucursal: ");
                    nmrSucursal = valor.nextInt();
                    System.out.print("Ingrese la direccion: ");
                    direccion = valor.nextLine();
                    valor.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    ciudad = valor.nextLine();

                    sucursal[conteoSucursal] = new Sucursal(nmrSucursal, direccion, ciudad);
                    conteoSucursal++;
                    break;

                case 2:
                    System.out.println("");
                    System.out.print("Ingrese la sucursal: ");
                    nmrSucursal = valor.nextInt();

                    int indice = buscarSucursal(sucursal, conteoSucursal, nmrSucursal);
                    if (indice == -1) {
                        System.out.println("Esa sucursal no existe");
                    } 
                    else {
                        
                        System.out.print("Ingrese dni: ");
                        dni = valor.nextInt();
                        System.out.print("Ingrese el numero de Referencia: ");
                        nmrReferencia = valor.nextInt();
                        valor.nextLine();
                        System.out.print("Ingrese cuantos kilos tiene el paquete: ");
                        peso = valor.nextInt();
                        System.out.println("Ingrese en que prioridad quiere enviar el paquete: ");
                        prioridad = valor.nextInt();

                        paquete[conteoPaquete] = new Paquete(nmrReferencia, dni, prioridad, peso);
                        
                        
                        double precio = sucursal[indice].calcularPrecio(paquete[conteoPaquete]);
                        System.out.println("Precio: " + precio);
                        conteoPaquete++;
                    }
                    break;
                
                case 3: for (int i = 0; i < conteoSucursal; i++) {
                            System.out.println(sucursal[i]);
                        }
                case 4: for (int i = 0; i < conteoPaquete; i++) {
                            System.out.println(paquete[i].toString());
                        }
                
                case 5: break;
            }
        } while (opciones != 5);
    }
}
