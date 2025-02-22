import java.util.Scanner;

public class BusquedaJava {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        //Insertar métodos para hacer las preguntas:
        
    }
    public void Inicio(){
        System.out.println("Adivinnaré el número\nPiensa un número del 1 al 10 y lo adivinaré con unas preguntas\nEstas preguntas son similares al algoritmo de búsqueda bianria:");
        
        System.out.println("Tú número es menor que 5? (Sí,No)");
        


    }
    public boolean VerificarSoN (String User) {
        User=in.next().toUpperCase();
        Character ClearUser=User.charAt(0);
        switch (ClearUser) {
            case 'S':
                return true;
            case 'N':
                return false;        
            default:
                System.out.println("Error");
                return System.exit(0);
        }
        
    }
}
