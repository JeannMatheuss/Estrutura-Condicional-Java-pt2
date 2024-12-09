import java.util.*;
public class ExemploTrianguloPadrao {
    public static void main(String[] args) {
        
        int A, B, C;
        Scanner entrada_dado = new Scanner(System.in);
        System.out.println("Digite três lados de um triângulo(inteiros): ");
        A = entrada_dado.nextInt();
        B = entrada_dado.nextInt();
        C = entrada_dado.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("As mediads: "+A+", "+B+", "+B+" "+C+" formam um triângulo ");
            if (A == B && A == C) {
                System.out.println("O triângulo é equilátero");
            }
            else if (A == B || A == C || B == C) {
                System.out.println("O triângulo é isósceles");
            }
            else {
                System.out.println("O triângulo é escaleno");
            }
        }
        else {
            System.out.println("As medidas: "+A+", "+B+", "+C+" NÃO formam um triângulo!");
        }
    }

}
