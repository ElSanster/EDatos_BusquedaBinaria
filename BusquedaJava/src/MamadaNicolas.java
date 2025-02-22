import java.util.Scanner;

public class MamadaNicolas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int intentos = 0;
        boolean adivinado = false;
 
        System.out.println("Piensa en un numero entre " + min + " y " + max + ". Yo intentare adivinarlo.");
        while (!adivinado && min <= max) {
            int guess = (min + max) / 2;
            System.out.println("¿Es " + guess + " tu numero? (responde 'si', 'mayor' o 'menor')");
            String respuesta = scanner.nextLine().trim().toUpperCase();
            intentos++;
            if (respuesta.equals("SI")) {
                System.out.println("¡He adivinado tu numero!: Es " + guess);
                adivinado = true;
            } else if (respuesta.equals("MAYOR")) {
                min = guess + 1;
            } else if (respuesta.equals("MENOR")) {
                max = guess - 1;
            } else {
                System.out.println("Entrada no valida. Por favor, responde solo con 'si', 'mayor' o 'menor'.");
            }
        }
        if (!adivinado) {
            System.out.println("Al parecer tu numero no esta entre 1 y 100 intentelo de nuevo. Asegurate de responder correctamente.");
        }
 
        scanner.close();
    }
}
