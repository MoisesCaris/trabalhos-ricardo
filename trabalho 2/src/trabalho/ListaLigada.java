package trabalho;

public class ListaLigada<T> {

	private No<T> primeiro;
	private int tamanho;

	public ListaLigada() {
		primeiro = null;
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void adicionaInicio(T conteudo) {
		No<T> novoNo = new No<T>(conteudo, null, null);
		if (tamanho == 0) {
			primeiro = novoNo;
		} else {
			novoNo.setProximo(primeiro);
			novoNo.setAnterior(null);
			primeiro.setAnterior(novoNo);
			primeiro = novoNo;
		}
		tamanho++;
	}

	public void adicionaFinal(T conteudo) {
		if (tamanho == 0) {
			No<T> novoNo = new No<T>(conteudo, null, null);
			primeiro = novoNo;
		} else {
			No<T> atual = primeiro;
			while (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			No<T> novoNo = new No<T>(conteudo, null, atual);
			atual.setProximo(novoNo);
		}
		tamanho++;
	}

	public void removeInicio() {
		if(tamanho == 0) {
			System.out.println("Não é possivel apagar uma lista vazia");
		}if(tamanho == 1) {
		No<T> atual = primeiro.getProximo();
		primeiro.setProximo(null);
		primeiro.setConteudo(null);
		atual.setAnterior(null);
		primeiro = atual;
		tamanho--;
	}}

	public void removeFim() {
		if(tamanho == 0) {
			System.out.println("Não é possivel apagar uma lista vazia");
		}
		if (tamanho == 1) {
			primeiro.setConteudo(null);
			primeiro.setAnterior(null);
		}
		if (tamanho > 2) {
			No<T> atual = primeiro;
			int contador = 0;
			while (atual.getProximo() != null) {
				System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
				atual = atual.getProximo();
				contador++;
			}
			No<T> ultimo = atual.getAnterior();
			atual.setConteudo(null);
			atual.setProximo(null);
			ultimo.setProximo(null);
			tamanho--;
		}
	}

	public void mostraNos() {
		if (tamanho != 0) {
			No<T> atual = primeiro;
			int contador = 0;
			System.out.println("\n"+"cresente");
			while (atual.getProximo() != null) {
				atual = atual.getProximo();
				contador++;
			}
			System.out.println("\n"+"Decresente");
			while (atual.getAnterior() != null) {
				System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
				atual = atual.getAnterior();
				contador--;
			}
			System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
		} else {
			System.out.println("Não existe nenhum elemento nessa lista");
		}

	}
}