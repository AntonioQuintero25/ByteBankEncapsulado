
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("645.876.121-34");
		paulo.setProfissao("Programador");
		
		
		
		Conta contaDoPaulo = new Conta(1231,323242,paulo);
		contaDoPaulo.setTitular(paulo);
		
		System.out.println(contaDoPaulo.getTitular().getNome());
		contaDoPaulo.getTitular().setProfissao("Desenvolvedor");
		System.out.println(paulo.getProfissao());
		
	}
}
