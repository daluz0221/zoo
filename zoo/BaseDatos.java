package zoo;

import java.util.Scanner;

public class BaseDatos {
    private Animal[] baseDatos =  {
        new Mamalian("león", "Felíno", 150, 80),
        new Mamalian("tigre", "Felíno", 130, 50),
        new Oviparous("tortuga", 45, 30),
        new Oviparous("Gallina", 15, 8)
    };

    public Animal[] getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(Animal[] baseDatos) {
        this.baseDatos = baseDatos;
    }

    public static void ingresarAnimal(){
        System.out.println("¿Que tipo de animal desea ingresar?");
        Scanner scanner = new Scanner(System.in);
        var opcion = 0;
        boolean isValid = false;
        do {

            
            System.out.println("1. Ovíparo");
            System.out.println("2. Mamífero");
            System.out.println("3. Salir");
            
            
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
                    
                    isValid = false;
                    break;
                case 2:

                    isValid = false;
                    break;
                case 3:
                    isValid = false;
                    break;
                
                default:
                    System.out.println("Por favor selecciona una de las opciones numéricas descritas");
                    isValid = false;
                    break;
            }
        } while (opcion !=3);

    }

}
