package LogicaJava.ExerciciosCompletos.Completos.BancoJava.Test;

import LogicaJava.ExerciciosCompletos.Completos.BancoJava.ControllerUser;
import LogicaJava.ExerciciosCompletos.Completos.BancoJava.Usuarios.Usuario;

import java.util.Scanner;

public class Menu {

    private ControllerUser usuarios = new ControllerUser();
    private Scanner entrada = new Scanner(System.in);

    public Menu() {
        UsuariosIniciais();
    }

    public void UsuariosIniciais(){
        if(usuarios == null){
            return;
        }

        Usuario[] usuariosIniciais = {
            new Usuario("Vitor Gabriel", "00989701244") ,
            new Usuario("Emily Santos", "98765432100") ,
            new Usuario("Mariana Costa", "74185296310") ,
            new Usuario("Pedro Henrique", "15975348620") ,
            new Usuario("Rafael Souza", "25836914700")

        };

        for(Usuario usuario: usuariosIniciais){
            usuarios.addUsuariosIniciais(usuario);
        }

    }

    public void iniciarMenu() throws InterruptedException {
        boolean continuar = true;


        do {

            System.out.println("\n===== BANCO JAVA =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário por CPF");
            System.out.println("4 - Remover usuário");
            System.out.println("5 - Total de usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = entrada.next();

                    entrada.nextLine(); // limpar buffer

                    System.out.println("Digite seu CPF: ");
                    String cpf = entrada.next();

                    Usuario usuarioNovo = new Usuario(nome, cpf);
                    usuarios.addUsuario(usuarioNovo);
                    break;

                case 2:
                    usuarios.listarUsuario();
                    break;


                case 3:
                    System.out.println("Digite o CPF: ");
                    String cpfBusca = entrada.next();

                    usuarios.buscarUsuarioPorCpf(cpfBusca);
                    break;

                case 4:
                    usuarios.listarUsuario();

                    System.out.println("Digite o índice a ser removido: ");
                    int indice = entrada.nextInt();
                    usuarios.removeUsuario(indice);
                    break;





                case 5:
                    usuarios.TotalUsuarios();
                    break;


                case 0:
                    continuar = false;
                    break;

            }


        } while (continuar);


    }


}
