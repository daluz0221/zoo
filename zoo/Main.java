package zoo;

import java.util.Scanner;

/**
 * main
 */
public class Main {


   
    public static void main(String[] args) {
        BaseDatos DB = new BaseDatos();
        System.out.println("Bienvenido al sistema de Gestión de animales zoo-happy");
        Scanner scanner = new Scanner(System.in);
        var opcion = 0;
        boolean isValid = false;
        

        do {

            System.out.println("Selecciona una de las siguientes opciones");
            System.out.println("1. Registrar Animal");
            System.out.println("2. Ver cantidad de ovíparos en el zoo");
            System.out.println("3. Ver cantidad de mamíferos en el zoo");
            System.out.println("4. Ver cantidad de mamíferos por especie en el zoo");
            System.out.println("5. Salir");
            
            
            while (isValid == false) {
                try{
                    opcion = Integer.parseInt(scanner.nextLine());
                    // We have good data, so, break out of the loop.
                    isValid = true;
                } catch(NumberFormatException e) {
                    System.out.println("Porfavor ingresa solo números");
                }
            }
            switch (opcion) {
                case 1:
                    DB.ingresarAnimal();
                    isValid = false;
                    break;
                case 2:
                    DB.getBaseDatos();
                    isValid = false;
                    break;
                case 3:
                    isValid = false;
                    break;
                case 4:

                    isValid = false;
                    break;
                case 5:
                    isValid = false;
                    break;
                default:
                    System.out.println("Por favor selecciona una de las opciones numéricas descritas");
                    isValid = false;
                    break;
            }
        } while (opcion !=5);
        System.out.println("Gracias por usar nuestro sistema!");

    }


    

    public static void ListarOviparos(){
        
      

    };
}