import java.util.Arrays;
import java.util.Scanner;

public class Cola {

    private Scanner teclado;
    private int numero;
    private int cola[];
    private int contador;


    public Cola() {
        teclado = new Scanner(System.in);
        cola = new int[2];
    }

    public int getString() {
        return numero;
    }

    public int putElement() {
        System.out.println("¿Que numero quieres introducir?");
        numero = teclado.nextInt();
        cola[contador] = numero;
        contador++;
        if (contador == cola.length) {
            cola = Arrays.copyOf(cola, cola.length + 2);
        }
        return getString();
    }

    public int getElement() {
        contador--;
        if (contador <= 0) {
            System.out.println("La cola esta vacia, introduce un numero primero");
        }
        if (contador > 0) {
            System.out.println("si entra aki resta");
            cola[contador] = 0;
        }
        return getString();
    }

    public void size(int contador) {
        System.out.println("La cola tiene " + (contador) + " elementos");
    }

    public void imprimirCola() {
        int recorerCola = 0;
        while (recorerCola != contador) {
            System.out.println(cola[recorerCola]);
            recorerCola++;
        }
    }

}
/**
 * Ender Luis, [22.10.18 18:46]
 * Crea una interfaz (espero que sepas lo que es a estas alturas)
 * <p>
 * Ender Luis, [22.10.18 18:47]
 * Que se llame Cola y tenga todos los métodos que necesitas
 * <p>
 * Ender Luis, [22.10.18 18:47]
 * -putElement()  (introducir elemento)
 * -getElement()  (extraer elemento)
 * -size()        (cuantos elementos tiene)
 * <p>
 * Ender Luis, [22.10.18 18:48]
 * Y luego crea una clase que implemente esa interfaz llamada ColaConArray
 * <p>
 * Qué utilice un array para implementar esos metodos
 **/