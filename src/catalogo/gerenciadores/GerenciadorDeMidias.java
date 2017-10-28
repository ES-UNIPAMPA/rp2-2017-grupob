package catalogo.gerenciadores;

import catalogo.midias.Midia;
import java.util.List;

public abstract class GerenciadorDeMidias {

	private List midias;

	
	public boolean cadastrar(Midia midia) {
		return false;
	}

	public boolean remover(String path) {
		return false;
	}


	public Midia consultar(String titulo) {
		return null;
	}

	public String exibir() {
		return null;
	}

	public abstract void  ordenar();

	public boolean editar(String titulo) {
		return false;
	}


	public boolean salvarArquivo() {
		return false;
	}

	public abstract boolean  carregarArquivo();

}
