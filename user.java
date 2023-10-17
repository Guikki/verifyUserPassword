import java.util.Scanner;
public class verificaUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Registre seu Usuário:");

        String usuario = sc.next();

        System.out.println("Seja bem vindo(a), " + usuario);
        sc.close();
    }

}
