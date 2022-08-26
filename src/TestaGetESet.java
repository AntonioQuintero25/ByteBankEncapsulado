
public class TestaGetESet {
	public static void main(String[] args) {
		Cliente teste = new Cliente();
		Conta conta = new Conta(1231,32323,teste);
		conta.setNumero(1231);
		System.out.println(conta.getNumero());
	}
}
