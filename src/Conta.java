

public class Conta{
	//Para especificar um valor faça igual abaixo:
	//int agencia = 42;
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//pode ser assim tbm: Cliente titular = new Cliente;
	private static int total; //Este atributo static e um atributo da classe e não do objeto quando for instanciado
	
	
	public Conta(int agencia, int numero, Cliente cliente) {
		Conta.total++;
		System.out.println("O total de contas é: "+total);
		this.agencia = agencia;
		this.numero = numero;
		this.titular = cliente;
		System.out.println("Criando conta para o cliente: " + cliente + "Agencia: " + agencia + "Número: " + numero);
	}
	
	public double depositar(double valor){
		System.out.println("Foi depositado na sua conta "+valor);
		return this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
		 this.saldo -= valor;
		 System.out.println("Foi retirado da sua conta "+valor+" seu saldo é: "+this.saldo);
		 return true;
		}else {
			System.out.println("Você não tem saldo suficiente");
			return false;
		}

	}
	
	public boolean transferencia(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -=valor;
			destino.depositar(valor);
			System.out.println("Transferencia feita com sucesso!");
			return true;
		}else {
			System.out.println("Você não possui saldo suficiente");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("Não pode colocar o número da conta menor ou igual a 0");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if(novaAgencia <= 0) {
			System.out.println("Não pode colocar o agencia da conta menor ou igual a 0");
			return;
		}
		this.agencia = novaAgencia;
	}
	
	public void setTitular(Cliente novoCliente) {
		this.titular = novoCliente;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}