import java.util.Scanner;

//Un centro de reciclaje recibe durante una jornada una cantidad variable de cargas de material. El peso de cada carga se registra en kilogramos y debe encontrarse entre 5 y 200 kg.

//La cantidad de cargas que se registrará debe estar entre 3 y 20.

//Construya un programa que almacene los pesos en un arreglo y permita obtener la siguiente información:

//Cantidad de cargas con peso entre 5 y 80 kg, incluidos ambos límites.
//Cantidad de cargas con peso superior a 80 kg.
//Peso total recibido durante la jornada.
//Promedio de peso por carga.
//Mayor peso registrado.
//Cantidad de cargas cuyo peso fue superior al promedio.
//Número de la primera carga en la que apareció el mayor peso.
//Listado numerado de todos los pesos registrados.

public class CentroReciclaje {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner leer = new Scanner(System.in);

        double[] kilogramos = new double[]; 
        int n = cantidadCargas(leer);
    }

    public static int cantidadCargas(Scanner leer) {
        int n = 0;
        do {
            System.out.println("Ingrese la cantidad de cargas");
            n = leer.nextInt();
            if (n < 3 || n > 20) {
                System.out.println("Error. La cantidad de cargas debe estar entre 3 y 20");
            }
        } while (n < 3 || n > 20);
        return n;
    }

    public static void cargaEntre(int[] kilogramos, Scanner leer) {
        for (int i = 0; i < kilogramos.length; i++) {
            do {
                System.out.println("Ingrese el peso de la carga " + (i + 1));
                kilogramos[] = leer.nextDouble();
                if (kilogramos[i]) {
                    
                }
            } while (condition);
        }
    }
}
