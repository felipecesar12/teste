import java.util.Scanner;

public class Clientedados {

    public static void main(String[] args) {

        Cliente negoVeio1 = criaCliente();
        DadosConta negoveio1 = criaDados();


        System.out.println("Nome: "+negoVeio1.getNome()+
                "\n"+"Agência: "+negoveio1.getNumeroAgencia()+
                "\n"+"Conta: "+negoveio1.getNumeroConta()+
                "\n"+"Codigo Banco: "+negoveio1.getCodigoBanco());

    }

    public static Cliente criaCliente() {
        Cliente negoVeio1 = new Cliente();
        negoVeio1.setNome(digita("Nome: "));
        return negoVeio1;
    }
        public static  DadosConta criaDados(){
        DadosConta negoVeio1 = new DadosConta();
        negoVeio1.setNumeroAgencia(digita("Agência: "));
        negoVeio1.setNumeroConta(digita("Conta: "));
        negoVeio1.setCodigoBanco(Integer.parseInt(digita("Codigo Banco: ")));
        return negoVeio1;
    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();

    }



}// FINAL
