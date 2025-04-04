package ChatBot;
import java.util.Scanner;
public class chatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido! Escribe <salir> cuando quieras acabar la conversacion...");
        boolean salir = false;
        while (!salir){
            String frase = sc.nextLine().toLowerCase();
            switch (frase){
                case "hola":
                    System.out.println("Hola, ¿En que puedo ayudar?");
                    break;
                case "¿como estas?":
                    System.out.println("¡Estoy listo para ayudarte!");
                    break;
                case "adios":
                    System.out.println("¡Hasta luego!");
                    break;
                case "gracias":
                    System.out.println("¡De nada! Que tengas un buen dia");
                    break;
                case "salir":
                    System.out.println("¡Adios!");
                    salir = true;
                    break;
                default:
                    System.out.println("No te entiendo :(");
                    break;
            }
        }
    }
}
