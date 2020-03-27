import java.util.Scanner;

public class Clientedados {

    public static void main(String[] args) {

        Cliente negoVeio1 = criaCliente();


        System.out.println("Nome: "+negoVeio1.getNome()+
                "\n"+"Agencia: "+negoVeio1.numeroagencia+
                "\n"+"Conta: "+negoVeio1.getNumeroconta()+
                "\n"+"Codigo Banco: "+negoVeio1.getCodigobanco());
    }

    public static Cliente criaCliente() {
        Cliente negoVeio1 = new Cliente();
        negoVeio1.setNome(digita("Nome: "));
        negoVeio1.setNumeroagencia(digita("Agencia: "));
        negoVeio1.setNumeroconta(digita("Conta: "));
        negoVeio1.setCodigobanco (Integer.parseInt(digita("Codigo Banco: ")));
        return negoVeio1;
    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();

    }



}// FINAL
