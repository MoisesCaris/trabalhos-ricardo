package trabalho3;

public class Executor  {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Cleitom","Avenida MyconKister 2332","123.456.789-11", 1, 1500, "Corrente") ;
		System.out.print("Nome Titular: ");
		System.out.println(conta1.getNome());
		System.out.print("Endereço: ");
		System.out.println(conta1.getEndereco());
		System.out.print("CPF: ");
		System.out.println(conta1.getCpf());
		System.out.print("Saldo: ");
		System.out.println(conta1.getSaldo());
		System.out.print("Tipo de Conta: ");
		System.out.println(conta1.devolveTipoConta());
		System.out.println("\n");
		Conta conta2 = new Conta("Xavier","Rua São Paulo 22","234.567.891-12", 2, 25000, "Poupança") ;
		System.out.print("Nome Titular: ");
		System.out.println(conta2.getNome());
		System.out.print("Endereço: ");
		System.out.println(conta2.getEndereco());
		System.out.print("CPF: ");
		System.out.println(conta2.getCpf());
		System.out.print("Saldo: ");
		System.out.println(conta2.getSaldo());
		System.out.print("Tipo de Conta: ");
		System.out.println(conta2.devolveTipoConta());
	}
}