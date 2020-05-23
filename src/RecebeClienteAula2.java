import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class RecebeClienteAula2 {

    public static void main(String[] args) throws ParseException {

        ClienteAula2 comparsa1 = criaCliente();
        listaComparsa(comparsa1);

        ClienteAula2 comparsa2 = criaCliente();
        listaComparsa(comparsa2);

        ClienteAula2 comparsa3 = criaCliente();
        listaComparsa(comparsa3);
    }

    public static ClienteAula2 criaCliente() throws ParseException {

        ClienteAula2 comparsa1 = new ClienteAula2();
        comparsa1.setNomeCliente(digita("Nome: "));
        comparsa1.setCpf(digita("CPF: "));
        String date = digita("Data de nascimento: ");
        comparsa1.setDataNasc(new SimpleDateFormat("dd/MM/yyyy").parse(date));
        comparsa1.setScoreRandom(getRandon());
        comparsa1.setLimiteCartao(criaLimite(comparsa1));
        return comparsa1;
    }

    public static Double criaLimite(ClienteAula2 cliente) {
        Double limiteComparsa = null;

        if (cliente.getScoreRandom() < 2) {
            limiteComparsa = 0.00;
        }

        if (cliente.getScoreRandom() >= 2 && cliente.getScoreRandom() <= 5) {
            limiteComparsa = 500.00;
        }
        if (cliente.getScoreRandom() >= 6 && cliente.getScoreRandom() <= 9) {
            limiteComparsa = 1000.00;
        }
        if (cliente.getScoreRandom() == 10) {
            limiteComparsa = 30000.00;
        }

        return limiteComparsa;

    }

    public static int getRandon() {
        int randomScore = (int) (10 * Math.random());
        return randomScore;
    }


    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mens);
        return teclado.next();
    }

    public static void listaComparsa(ClienteAula2 comparsa1) {
        System.out.println("Nome: " + comparsa1.getNomeCliente());
        System.out.println("CPF: " + comparsa1.getCpf());
        System.out.println("Data Nasc: " + comparsa1.dataNasc);
        System.out.println("Score: " + comparsa1.getScoreRandom());

        if (comparsa1.getLimiteCartao() == 0) {

            System.out.println("Crédito não liberado.");
        } else {
            System.out.println("Seu limite é R$ " + comparsa1.getLimiteCartao());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}// final
