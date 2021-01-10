package POO;

public class Cliente {
	private String nomeDoCliente;
	private String generoDoCliente;
	private String idadeDoCliente;
	private String cidadeDoCliente;
	
	public Cliente (String nome,String genero,String idade,String cidade) {
		nomeDoCliente=nome;
		generoDoCliente=genero;
		idadeDoCliente=idade;
		cidadeDoCliente=cidade;
	}
	
	public String getDadosDoCliente()
	{
		String todosOsDadosDoCliente = "Nome do Cliente: "+nomeDoCliente+"\nGênero que se identifica (Não obrigatório): "
										+generoDoCliente+"\nIdade: "+idadeDoCliente+"\nCidade em que mora: "+cidadeDoCliente;
		return todosOsDadosDoCliente;
	}
}
