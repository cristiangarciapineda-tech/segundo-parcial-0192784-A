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

        double[] kilogramos = new double[n]; 
        int n = cantidadCargas(leer);
        cargaRango(kilogramos, leer);
        int contador1 = cargaEntre(kilogramos);
        int contador2 = cargaMas(kilogramos);
        int total = totalPeso(kilogramos);
        double promedio = promedioKilogramo(total, n);
        int arribaPromedio = superiorPromedio(promedio, kilogramos);


        System.out.println("Cantidad de cargas entre 5 y 80 kg: " + contador1);
        System.out.println("Cantidad de cargas con un peso superior a 80 kg: " + contador2);
        System.out.println("Peso total recibido durante la jornada: " + total);
        System.out.println("Promedio de peso: " + promedio);

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

    public static void cargaRango(double[] kilogramos, Scanner leer) {
        for (int i = 0; i < kilogramos.length; i++) {
            do {
                System.out.println("Ingrese el peso de la carga " + (i + 1));
                kilogramos[i] = leer.nextDouble();
                if (kilogramos[i] < 5 && kilogramos[i] > 200) {
                    System.err.println("Error. El peso debe estar entre 5kg y 200kg");
                }
            } while (kilogramos[i] < 5 && kilogramos[i] > 200);
        }
    }

    public static int cargaEntre(double[] kilogramos) {
        int contador1 = 0;
        for (int i = 0; i < kilogramos.length; i++) {
            if (kilogramos[i] >= 5 && kilogramos[i] <= 80) {
                contador1++;
            }
        }
        return contador1;
    }

    public static int cargaMas(double[] kilogramos) {
        int contador2 = 0;
        for (int i = 0; i < kilogramos.length; i++) {
            if (kilogramos[i] > 80) {
                contador2++;
            }
        }
        return contador2;
    }

    public static int totalPeso(int[] kilogramos) {
        int total = 0;
        for (int i = 0; i < kilogramos.length; i++) {
            total += kilogramos[i];
        }
        return total;
    }

    public static double promedioKilogramo(int total, int n) {
        double promedio = (double) total / n;
        return promedio;
    }

    public static int totalKilogramos(double[] kilogramos) {
        int mayor = kilogramos[0]
        for (int i = 0; i < kilogramos.length; i++) {
            if (kilogramos[i] > mayor) {
                mayor = kilogramos[i];
            }
        }
        return mayor;
    }

    public static int superiorPromedio(double promedio, double[] kilogramos) {
        int arribaPromedio = 0;
        for (int i = 0; i < kilogramos.length; i++) {
            if (kilogramos[i] > promedio) {
                arribaPromedio++;
            }
        }
        return arribaPromedio;
    }


}
