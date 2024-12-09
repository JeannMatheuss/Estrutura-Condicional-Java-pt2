import java.util.*;
public class MaiorMenor {
    public static void main(String[] args) {

        int A, B, C;
        Scanner valor_digitado = new Scanner (System.in);
        System.out.println("Digite o primeiro valor: ");
        A = valor_digitado.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = valor_digitado.nextInt();
        System.out.println("Digite o terceiro valor: ");
        C = valor_digitado.nextInt();

        System.out.println("Dentre os valores " + A + ", " + B + ", " + C);
        if (A > B && A > C) {
            System.out.println("O maior valor é: " + A);
        }
        else if (B > A && B > C) {
            System.out.println("O maior valor é: " + B);
        }
        else if (C > A && C > B) {
            System.out.println("O maior valor é: " + C);
        }
        else {
            System.out.println("Os valores são iguais");
        }

        if (A < B && A < C) {
            System.out.println("O menor valor é: " + A);
        }
        else if (B < A && B < C) {
            System.out.println("O menor valor é: " + B);
        }
        else if (C < A && C < B) {
            System.out.println("O menor valor é: " + C);
        }
        else {
            System.out.println("Os valores são iguais");
        }

    }
}
