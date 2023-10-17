import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        List<String> senhasRegistradas = new ArrayList<>();
        senhasRegistradas.add("senha123");
        senhasRegistradas.add("outraSenha");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = sc.next();

        if (verificarSenha(senha, senhasRegistradas)) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso bloqueado");
        }

        sc.close();
    }

    private static boolean verificarSenha(String senha, List<String> senhasRegistradas) {
        for (String senhaRegistrada : senhasRegistradas) {
            if (senhaRegistrada.equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
