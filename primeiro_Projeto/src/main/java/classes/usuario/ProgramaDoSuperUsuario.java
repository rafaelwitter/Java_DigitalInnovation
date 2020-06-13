package classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1234%$#@");
        var batman = new SuperUsuario("rafael","haha");
        var nome = batman.getLogin();
        var senha = batman.getSenha();
        System.out.println(nome);
        System.out.println(senha);


        superUsuario.getLogin();

        superUsuario.getSenha();

        String root = superUsuario.nome;

    }

}
