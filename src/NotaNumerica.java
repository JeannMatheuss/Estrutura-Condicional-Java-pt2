import java.util.*;
public class NotaNumerica {
    public static void main(String[] args) {
        
        double nota;
        Scanner valor_digitado = new Scanner (System.in);
        System.out.println("Digite uma nota: ");
        nota = valor_digitado.nextDouble();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Nota A");
        }
        else if (nota >= 7 && nota < 9) {
            System.out.println("Nota B");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Nota C");
        }
        else if (nota >= 2.5 && nota < 5) {
            System.out.println("Nota D");
        }
        else if (nota >= 0 && nota < 2.5) {
            System.out.println("Nota E");
        }
        
    }
}
