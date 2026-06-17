package LogicaJava.ExerciciosCompletos.Completos.BancoJava;


import LogicaJava.ExerciciosCompletos.Completos.BancoJava.Usuarios.StatusUsuario;
import LogicaJava.ExerciciosCompletos.Completos.BancoJava.Usuarios.Usuario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ControllerUser extends Usuario {
    private List<Usuario> usuarios = new ArrayList<>();
    private StatusUsuario statusUsuario;
    private int totalUsuarios = 0;


    public ControllerUser(String nome, String cpf) {
        super(nome, cpf);
    }

    public ControllerUser(String nome, String cpf, List<Usuario> usuarios, StatusUsuario statusUsuario) {
        super(nome, cpf);
        this.statusUsuario = StatusUsuario.NAO_LOGADO;
        this.usuarios = usuarios;
    }

    public ControllerUser() {
        super();
    }


    public void addUsuariosIniciais(Usuario usuario) {
        this.usuarios.add(usuario);
        totalUsuarios++;

    }


    public void addUsuario(Usuario usuario) {
        if (usuario == null) {
            System.out.println("Usuário invalido!");
            statusUsuario = StatusUsuario.NAO_LOGADO;
            return;

        }
        usuarios.add(usuario);
        System.out.println("Usuario adicinado com sucesso!");
        System.out.println("----------------------------");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("----------------------------");
        statusUsuario = StatusUsuario.LOGADO;
        totalUsuarios++;


    }


    public void removeUsuario(int indice) throws InterruptedException {
        if (indice < 0 || indice >= usuarios.size()) {
            System.out.println("Usuario invalido!");
            System.out.println("Retorne...");
            Thread.sleep(1500);
            return;
        }

        Usuario usuarioRemovido = usuarios.remove(indice);

        System.out.println("Usuario removido com sucesso!");
        System.out.println("----------------------");
        System.out.println("USUÁRIO REMOVIDO: ");
        System.out.println("Nome: " + usuarioRemovido.getNome());
        System.out.println("CPF: " + usuarioRemovido.getCpf());
        return;


    }


    public void listarUsuario() {
        if (usuarios == null || usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado!");

            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {

            Usuario usuario = usuarios.get(i);


            if (usuarios.contains(usuario)) {
                System.out.println("===== USUÁRIOS CADASTRADOS =====");
                System.out.println("-----------------------------");

                System.out.println("[" + i + "]");
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("CPF: " + usuario.getCpf());
            }

        }

    }

    public void TotalUsuarios() {
        System.out.println("========TOTAL DE USUARIOS======");
        System.out.println(" ");
        System.out.println("Total de usuarios logados: " + totalUsuarios);


    }


    public void buscarUsuarioPorCpf(String cpf) throws InterruptedException {
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("CPF invalido!");
            System.out.println("Retorne...");
            Thread.sleep(1500);
            return;

        }


        for (Usuario usuario : usuarios) {

            if (usuario.getCpf().equals(cpf)) {

                System.out.println("Usuario encontrado!");
                System.out.println("------------------------------");
                System.out.println("Usuario: " + usuario.getNome());
                System.out.println("CPF: " + usuario.getCpf());
                return;


            }
        }

        System.out.println("CPF invalido!");
        System.out.println("Retorne...");
        Thread.sleep(1500);


    }

    public void totalUsuarios(Usuario usuario) {

    }


    public int totalUsuarios() {
        return usuarios.size();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public StatusUsuario getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(StatusUsuario statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
}


