import java.util.*;
public class BodasCasamento {
    public static void main(String[] args) {
        int ano_casamento, ano_atual;
        int boda;

        Scanner dado_digitado = new Scanner (System.in);

        System.out.println("Digite o ano do casamento: ");
        ano_casamento = dado_digitado.nextInt();

        System.out.println("Digite o ano atual: ");
        ano_atual = dado_digitado.nextInt();

        boda = ano_atual - ano_casamento;

        if (boda >= 25 && boda <= 49) {
            System.out.println("Parabéns, você está de boda de PRATA de 25 anos!");
            System.out.println("Com "+ boda + " anos de casados");
        }
        else if (boda >= 50 && boda <= 74) {
            System.out.println("Parabéns, você está de boda de OURO de 50 anos!");
            System.out.println("Com "+ boda + " anos de casados");
        }
        else if (boda >= 75) {
            System.out.println("Parabéns, você está de boda de DIAMANTE de 75 anos!");
            System.out.println("Com "+ boda + " anos de casados");
        }
        else {
            System.out.println("Você não está de boda de prata, ouro ou diamante ainda!");
        }
    }
}
