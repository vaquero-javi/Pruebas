import java.util.Scanner;

public class EntradaTeclado {

    static Scanner escribirTeclado = new Scanner(System.in);

    public static void main(String[] args){
        String nombre;
        System.out.println("DIME TU NOMBRE");
        nombre = escribirTeclado.next();
        System.out.println("TU NOMBRE ES "+nombre);
    }

}
