import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidaUsuarioSenha {
    public static void main(String[] args) {
        List<UsuarioSenha> usuariosRegistrados = new ArrayList<>();
        usuariosRegistrados.add(new UsuarioSenha("usuario1", "senha123"));
        usuariosRegistrados.add(new UsuarioSenha("usuario2", "outraSenha"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Registre seu Usuário:");
        String usuario = sc.next();

        System.out.println("Digite a senha:");
        String senha = sc.next();

        if (validarCredenciais(usuario, senha, usuariosRegistrados)) {
            System.out.println("Acesso Permitido. Seja bem-vindo(a), " + usuario);
        } else {
            System.out.println("Acesso bloqueado. Verifique seu usuário e senha.");
        }

        sc.close();
    }

    private static boolean validarCredenciais(String usuario, String senha, List<UsuarioSenha> usuariosRegistrados) {
        for (UsuarioSenha usuarioSenha : usuariosRegistrados) {
            if (usuarioSenha.getUsuario().equals(usuario) && usuarioSenha.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    private static class UsuarioSenha {
        private String usuario;
        private String senha;

        public UsuarioSenha(String usuario, String senha) {
            this.usuario = usuario;
            this.senha = senha;
        }

        public String getUsuario() {
            return usuario;
        }

        public String getSenha() {
            return senha;
        }
    }
}
