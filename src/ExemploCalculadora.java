import java.util.*;
public class ExemploCalculadora {
    public static void main(String[] args) {

        int A, B;
        char op;
        String s, Saida = "";

        Scanner entrada_dado = new Scanner (System.in);
        System.out.println("Digite o primeiro valor: ");
        A = entrada_dado.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = entrada_dado.nextInt();
        s = entrada_dado.next();
            op = s.charAt(0); 

            switch (op) {
                case '+': Saida += +A+ " + "+B+" = "+(A+B); break;
                case '-': Saida += +A+ " - "+B+" = "+(A-B); break;
                case '*': Saida += +A+ " * "+B+" = "+(A*B); break;
                case '/': {if (B == 0){
                    Saida = "A operação não pode ser executada";
                }
                else {
                    Saida += +A+ " / "+B+" = "+(A/B); break;
                }
            }
                default: Saida = "Operação invalida";
            }

            System.out.println(Saida);
    }
}
