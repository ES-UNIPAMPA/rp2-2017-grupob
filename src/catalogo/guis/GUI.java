package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;

public abstract class GUI implements IMidiaUsuario {

    EntradasDoUsuarioComValidacao es = new EntradasDoUsuarioComValidacao();
    public void menu() {
        boolean ficar = true;
        do {
            System.out.print("O que você deseja fazer?");
            System.out.println("1- Cadastrar um Filme");
            System.out.println("2- Excluir um filme");
            System.out.println("3- Consultar um filme");
            System.out.println("4- Exibir todos os filmes");
            System.out.println("5- Editar um filme");
            System.out.println("6 -Sair");
            int escolhaUsuario = es.nextInt(false);
            switch (escolhaUsuario) {
                case 1:
                    cadastro();
                    break;
                case 2:
                    exclusao();
                    break;
                case 3:
                    consulta();
                    break;
                case 4:
                    exibirDadosTodasMidias();
                    break;
                case 5:
                    editar();
                    break;
                case 6:
                    ficar = false;
                    break;
                default:
                    System.out.println("Não entendi!");
            }
        } while (ficar);
    }

}