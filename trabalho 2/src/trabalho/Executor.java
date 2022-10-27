package trabalho;

public class Executor {
	public static void main(String[] args) {
		ListaLigada listaLigada = new ListaLigada();
		System.out.println(listaLigada.getTamanho());

		// Inserindo um elemento na lista ligada
		listaLigada.adicionaFinal(8);
		listaLigada.adicionaInicio(10);
		listaLigada.adicionaInicio(9);
		listaLigada.adicionaInicio(8);
		listaLigada.adicionaFinal(11);
		listaLigada.adicionaFinal(12);
		listaLigada.adicionaInicio(0);
		listaLigada.removeInicio();
		listaLigada.removeFim();
		// Verificando elementos da minha lista ligada
		listaLigada.mostraNos();
		System.out.println(listaLigada.getTamanho());

	}

}