package catalogo.guis;

import catalogo.EntradasDoUsuarioComValidacao;

public abstract class GUI implements IMidiaUsuario {

    EntradasDoUsuarioComValidacao es = new EntradasDoUsuarioComValidacao();
    public void menu(String nomeDaMidia) {
        boolean ficar = true;
        do {
            carregar();
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Cadastrar um(a) "+nomeDaMidia);
            System.out.println("2- Excluir um(a) "+nomeDaMidia);
            System.out.println("3- Consultar um(a) "+nomeDaMidia);
            System.out.println("4- Exibir todos(as) os(as) "+nomeDaMidia+"s");
            System.out.println("5- Editar um(a) "+nomeDaMidia);
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