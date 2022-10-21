package trabalho;

public class Exe {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(7);
		/*Os comandos são insere, remove, mostra, busca
		 * o insere é auto explicativo ele insere no vetor
		 * o remove tambem é auto explicativo ele remove no vetor
		 * o mostra eu adicionei para poder escrever o vetor inteiro na tela
		 * e o busca ele busca um elemeno na posição expecifica
		 * vc pode colocar o numero exato da posição para remover e buscar
		 * pois coloquei no codigo um esquema para não ter que por o numero anterior
		 */
		vetor.insere(1);
		vetor.insere(2);
		vetor.insere(3);
		vetor.insere(4);
		vetor.insere(0);
		vetor.insere(6);
		vetor.insere(7);
		vetor.mostra(0);
		vetor.remove(7);
		vetor.insere(9);
		vetor.insere(11);
		vetor.mostra(0);
		vetor.remove(4);
		vetor.mostra(0);
		vetor.insere(1);
		vetor.insere(1);
		vetor.mostra(0);
		System.out.println("\n" + "\n" + "O elemento que vc busca é o : " + vetor.buscaElemento(2));
	}
}