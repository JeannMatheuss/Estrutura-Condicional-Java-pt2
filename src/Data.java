import java.util.*;
public class Data {
    public static void main(String[] args) {
        
        int dia, mes, ano;
        Scanner dado_digitado = new Scanner (System.in);

        System.out.println("Tranformando a data (dd/mm/aaaa)");
        System.out.println("Digite o dia: ");
        dia = dado_digitado.nextInt();

        System.out.println("Digite o mês: ");
        mes = dado_digitado.nextInt();

        System.out.println("Digite o ano: ");
        ano = dado_digitado.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mes invalido");
            return;
        }

        switch (mes) {
            case 01:
                System.out.println(dia + " de Janeiro " + ano);
                break;
            case 2:
                System.out.println(dia + " de Fevereiro " + ano);
                break;
            case 3:
                System.out.println(dia + " de Março " + ano);
                break;
            case 4:
                System.out.println(dia + " de Abril " + ano);
                break;
            case 5:
                System.out.println(dia + " de Maio " + ano);
                break;
            case 6:
                System.out.println(dia + " de Junho " + ano);
                break;
            case 7:
                System.out.println(dia + " de Julho " + ano);
                break;
            case 8:
                System.out.println(dia + " de Agosto " + ano);
                break;
            case 9:
                System.out.println(dia + " de Setembro " + ano);
                break;
            case 10:
                System.out.println(dia + " de Outubro " + ano);
                break;
            case 11:
                System.out.println(dia + " de Novembro " + ano);
                break;
            case 12:
                System.out.println(dia + " de Dezembro " + ano);
                break;
            default:
                System.out.println("Mes Invalido");
                break;
            
        }
    }
}
