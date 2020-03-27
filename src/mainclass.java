import java.util.Scanner;

public class mainclass {
    public static void main(String[] args) {


        String nome = digita("Fala o nome do josnel: ");
        String nomeDaMina = digita("Fala o nome da nega veia: ");

        System.out.println("meu nome: " + nome);
        System.out.println("nome da mina" + nomeDaMina);

    }

    public static String digita(String mens){
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }// ======= final do digita =========


} //fim da classe


