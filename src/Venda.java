import java.util.Random;
import java.util.Scanner;

public class Venda {

    public Vendedor vendedor = null;
    public ClienteVend cliente = null;


    public static void main(String[] args) {

        Vendedor vendedor = criaVendedor();
        ClienteVend clienteVend = criaClienteVend();

        int salario = clienteVend.getSalario();
        int parcela = clienteVend.getValorParcela();
        boolean diferença = salario  >= 3*  parcela;

        if (diferença){
            System.out.println("CADASTRO EFETUADO COM SUCESSO !" +
                    "\n"+"Nome: " + clienteVend.getNomeCliente()+
                    "\n"+"Seu grupo é: "+clienteVend.getCodGrupo()+
                    "\n"+"Sua cota é: "+clienteVend.getCodCota()+
                    "\n"+"Salário: "+clienteVend.getSalario()+
                    "\n"+"Sua parcela ficou: "+clienteVend.getValorParcela());
        } else {
            System.out.println("Seu salário não esta de acordo com os critérios ");
        }
    }

    public static Vendedor criaVendedor() {
        Vendedor vendedor = new Vendedor();
        vendedor.setNomeRep(digita("Razão social: "));
        vendedor.setCodigoRep(Integer.parseInt(digita("Digite seu codigo de Representação: ")));
        return vendedor;
    }

    public static ClienteVend criaClienteVend() {
        ClienteVend clienteVend = new ClienteVend();
        clienteVend.setNomeCliente(digita("Nome cliente: "));
        clienteVend.setCodGrupo(digita("Grupo: "));
        clienteVend.setCodCota(criaCotaTT());
        clienteVend.setCpf(digita("CPF cliente:"));
        clienteVend.setSalario(Integer.parseInt(digita("Salario do cliente: ")));
        clienteVend.setValorParcela(Integer.parseInt(digita("Valor da parcela: ")));
        return clienteVend;
    }

    public static int criaCotaTT() {
        int randomInt = (int) ( 320 * Math.random());
        return randomInt;
    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }


}