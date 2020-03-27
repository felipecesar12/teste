import java.util.Scanner;

public class ClienteController2 {

    public static void main(String[] args) {

        Cliente negoVeio1 = criaCliente();
        Cliente negoVeio2 = criaCliente();
        Cliente negaVeia1 = criaCliente();
        Cliente negaVeia2 = criaCliente();

        System.out.println(negoVeio1+" & "+negaVeia1);
        System.out.println(negoVeio2+" & "+negaVeia2);

    }

    public static Cliente criaCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(digita("nome: "));
        return cliente;
    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }// ======= final do digita =========
}
