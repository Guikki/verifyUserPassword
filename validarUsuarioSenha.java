import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidaUsuarioSenha {
    public static void main(String[] args) {
        List<UsuarioSenha> usuariosRegistrados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Usuário:");
        String usuario = sc.next();

        UsuarioSenha usuarioExistente = obterUsuario(usuario, usuariosRegistrados);
        if (usuarioExistente != null) {
            // Usuário existe, pede a senha e valida
            int tentativasRestantes = 3;
            while (tentativasRestantes > 0) {
                System.out.println("Digite a senha:");
                String senha = sc.next();

                if (usuarioExistente.getSenha().equals(senha)) {
                    System.out.println("Acesso Permitido. Seja bem-vindo(a), " + usuarioExistente.getUsuario());
                    break;
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + (tentativasRestantes - 1));
                    tentativasRestantes--;
                }
            }
            if (tentativasRestantes == 0) {
                System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
            }
        } else {
            // Usuário não existe, pede cadastro de senha
            System.out.println("Crie uma senha:");
            String novaSenha = sc.next();

            UsuarioSenha novoUsuarioSenha = new UsuarioSenha(usuario, novaSenha);
            usuariosRegistrados.add(novoUsuarioSenha);

            System.out.println("Usuário registrado com sucesso!");
        }

        sc.close();
    }

    private static UsuarioSenha obterUsuario(String usuario, List<UsuarioSenha> usuariosRegistrados) {
        for (UsuarioSenha usuarioSenha : usuariosRegistrados) {
            if (usuarioSenha.getUsuario().equals(usuario)) {
                return usuarioSenha;
            }
        }
        return null;
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
