package trabalho;

public class Vetor {
	int tamanho, inse = 0;
	int[] vetor;

	public Vetor(int tamanho) {
		this.tamanho = tamanho;
		this.vetor = new int[this.tamanho];
	}

	public void mostra(int vetor) {
		System.out.println("\n");
		System.out.println("Este seu vetor :");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(this.vetor[i] + " ");
		}
	}

	public void insere(int valor) {
		if (inse <= tamanho) {
			vetor[inse] = valor;
			inse++;
			System.out.println("\n"+"Inserido com sucesso");
			if(vetor[inse - 1] == 0) {
				System.out.println("\n"+"Erro");
				inse--;
			}
		}
	}

	public void remove(int posicao) {
		posicao = posicao - 1;
		if (posicao >= 0 && posicao < tamanho) {
			if (posicao == tamanho - 1) {
				vetor[posicao] = 0;
				inse--;
				System.out.println("\n"+"Removido com sucesso");
			}
			for (int i = posicao; i < tamanho - 1; i++) {
				vetor[i] = vetor[i + 1];
				if (i + 1 == tamanho - 1) {
					i = i + 1;
					vetor[i] = 0;
				}
			}
			System.out.println("\n"+"Removido com sucesso");
			inse--;
		}
	}

	public int buscaElemento(int posicao) {
		posicao = posicao - 1;
		return (vetor[posicao]);
	}
}
