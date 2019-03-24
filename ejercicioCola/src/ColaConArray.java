import java.util.Arrays;
import java.util.Scanner;

public class ColaConArray extends Cola {

    private Scanner teclado;
    private int arrayCola[];
    private int contador = 0;

    public ColaConArray() {
        teclado = new Scanner(System.in);
        arrayCola = new int[2];
    }

    public void queHacer() {
        int hacer = - 1;
        while (hacer != 0) {
            System.out.println("Introduce con un numero lo que quieras hacer con la cola: ");
            System.out.println("si quieres añadir un numero pulsa 1");
            System.out.println("si quieres extraer un numero pulsa 2");
            System.out.println("si quieres imprimir la cola pulsa 3");
            System.out.println("si quieres saber la cantidad de numeros que tiene la cola 4");
            System.out.println("para salir pulsa 0");
            hacer = teclado.nextInt();
            if (hacer == 1) {
                int numeroAIntroducir;
                putElement();
                numeroAIntroducir = teclado.nextInt();
                arrayCola[contador] = arrayCola[numeroAIntroducir];
                System.out.println("lo que esta haciendo en añadir");
                System.out.println(arrayCola[contador]);
                if (contador == arrayCola.length) {
                    arrayCola = Arrays.copyOf(arrayCola, arrayCola.length + 2);
                    System.out.println("Array ampliada.");
                }
                contador++;
            }
            if (hacer == 2) {
                contador--;
                int apoyo;
                getElement();
                apoyo = teclado.nextInt();
                arrayCola[contador] = arrayCola[apoyo];
            }
            if (hacer == 3) {
                imprimirCola();
            }
            if (hacer == 4) {
                size(contador);
            }
        }
    }



    public static void main(String[] args) {
        ColaConArray ejercicioCola = new ColaConArray();
        ejercicioCola.queHacer();
    }
}
