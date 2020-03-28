import java.util.Scanner;

public class AproCred {

    public static Cliente cliente1;

    public static void main(String[] args) {
        
        Cliente cliente1 = criaCliente();
        double salario = cliente1.salario;

        System.out.println("Nome:"+cliente1.getNome()+
                "\n"+"CPF:"+cliente1.getCpf()+
                "\n"+"Data nasc:"+cliente1.getDtNasc()+
                "\n"+"Seu salário:"+"R$ "+cliente1.getSalario()+
                "\n"+"Sua empresa:"+cliente1.getNomeEmpresa()+
                "\n"+"SEU CREDITO FOI APROVADO NO VALOR DE:"+" R$"+(cliente1.salario * 3));
    }

    public static Cliente criaCliente(){
        Cliente  cliente1 =  new Cliente();
        cliente1.setNome(digita("Nome completo: "));
        cliente1.setCpf(digita("CPF: "));
        cliente1.setDtNasc(digita("Data de nasc: "));
        cliente1.setSalario(Integer.parseInt(digita("Seu salário: ")));
        cliente1.setNomeEmpresa(digita("Empresa que você trabalha"));
        return cliente1;

    }
    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }














}
