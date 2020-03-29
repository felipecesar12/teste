import java.util.Scanner;

public class Clientedados {

    public static void main(String[] args) {

        Cliente negoVeio1 = criaCliente();
        DadosConta DADOSnegoVeio1 = criaDados();


        System.out.println("O "+negoVeio1.getNome()+ " cujo sobrenome é "+negoVeio1.getSobrenome()+
                " e sua idade é "+negoVeio1.getIdade()+ " tem os seguintes dados bancários: "+
                "\n"+"Agencia:"+DADOSnegoVeio1.getNumeroAgencia()+
                "\n"+"Conta: "+DADOSnegoVeio1.getNumeroConta()+
                "\n"+"Codigo Banco: "+DADOSnegoVeio1.getCodigoBanco());

    }

    public static Cliente criaCliente() {
        Cliente negoVeio1 = new Cliente();
        negoVeio1.setNome(digita("Nome: "));
        negoVeio1.setSobrenome(digita("Sobrenome: "));
        negoVeio1.setIdade(digita("Idade: "));
        return negoVeio1;
    }
        public static  DadosConta criaDados(){
        DadosConta DADOSnegoVeio1 = new DadosConta();
            DADOSnegoVeio1.setNumeroAgencia(digita("Agência: "));
            DADOSnegoVeio1.setNumeroConta(digita("Conta: "));
            DADOSnegoVeio1.setCodigoBanco(Integer.parseInt(digita("Codigo Banco: ")));
        return DADOSnegoVeio1;
    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();

    }



}// FINAL
