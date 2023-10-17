import java.util.Scanner;

public class geraSenha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Registre sua senha: ");

        String suaSenha = sc.next();

        System.out.println("Digite a senha: ");

        String senha = sc.next();
        int contador = 0;

        while(!senha.equals(suaSenha) && contador <= 3){
            System.out.println("Senha Incorreta. \nTentativas restantes:" + (4-contador));
            contador++;
            senha=sc.next();
        }
    if(senha.equals(suaSenha)){
        System.out.println("Acesso Permitido");
    } else {
        System.out.println("Acesso bloqueado.");
    }
        sc.close();
    }
}
