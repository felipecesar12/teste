import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AproCred {

    public Cliente cliente1;

    public static void main(String[] args) throws ParseException {

        Cliente cliente1 = criaCliente();
        double limiteCred = 1500.51;
        double salario = cliente1.salario;
        double diferençaLimite = limiteCred - cliente1.getSalario();
        if (cliente1.getSalario() > limiteCred) {
            System.out.println("Nome:" + cliente1.getNome() +
                    "\n" + "CPF:" + cliente1.getCpf() +
                    "\n" + "Data nasc:" + cliente1.getDtNasc() +
                    "\n" + "Seu salário:" + "R$ " + cliente1.getSalario() +
                    "\n" + "Sua empresa:" + cliente1.getNomeEmpresa() +
                    "\n" + "SEU CREDITO FOI APROVADO NO VALOR DE:" + " R$" + (cliente1.salario * 3));
        } else {
            System.out.println("Error 404 not Found" + "Não foi aprovado seu limite. Valor faltante : " + "R$" + diferençaLimite);
        }


    }

    public static Cliente criaCliente() throws ParseException {
        Cliente cliente1 = new Cliente();
        cliente1.setNome(digita("Nome completo: "));
        cliente1.setCpf(digita("CPF: "));
        cliente1.setDtNasc(convertDate(digita("Dt Nasc: ")));
        cliente1.setSalario(Integer.parseInt(digita("Seu salário: ")));
        cliente1.setNomeEmpresa(digita("Empresa que você trabalha"));
        return cliente1;

    }

    public static String digita(String mens) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }

    public static Date convertDate(String Datenasc) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(String.valueOf(Datenasc));
        return date;
    }
}
