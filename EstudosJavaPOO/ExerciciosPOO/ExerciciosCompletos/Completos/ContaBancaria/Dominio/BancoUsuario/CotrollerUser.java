package LogicaJava.ExerciciosCompletos.Completos.ContaBancaria.Dominio.BancoUsuario;

import LogicaJava.ExerciciosCompletos.Completos.ContaBancaria.Dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class CotrollerUser {


    private List<Usuario> usuarios = new ArrayList<>();


    public void adicionarUsuario(Usuario usuario) {

        if (usuario == null) {
            System.out.println("Usuário inválido!");
            return;
        }

        usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }


    public void removerUsuario(Usuario usuario) {

        if (usuario == null) {
            System.out.println("Usuário inválido!");
            return;
        }

        if (usuarios.remove(usuario)) {
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }


    public Usuario buscarUsuarioPorCpf(String cpf) {

        for (Usuario usuario : usuarios) {

            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }

        return null;
    }


    public void listarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("===== USUÁRIOS CADASTRADOS =====");

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }


    public int totalUsuarios() {
        return usuarios.size();
    }


    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}



