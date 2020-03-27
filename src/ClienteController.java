import java.util.Scanner;
public class ClienteController {

    public static void main(String[] args) {

        Cliente consorciado = new Cliente();

        System.out.println("nome: "+ consorciado.getNome());
        System.out.println("nome: "+ consorciado.getNome());
    }


    public static String digita(String mens){
        Scanner teclado = new Scanner(System.in);
        System.out.println(mens);
        return teclado.next();
    }// ======= final do digita =========


    public static boolean isInt(String v) {
        try {
            Integer.parseInt(v);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
