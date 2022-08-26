
public class TestaValores {
	public static void main(String[] args) {
		
		Cliente Antonio = new Cliente();
		
		Conta conta = new Conta(1231, 456789, Antonio);
		Conta conta2 = new Conta(1231, 456789, Antonio);
		conta.setAgencia(-1);
		conta2.setNumero(-40);
		
		System.out.println(Conta.getTotal());
	}
}
