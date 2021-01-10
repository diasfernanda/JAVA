package POOClasses;

public class Pessoa {
	/*Crie uma Classe Pessoa contendo os atributos encapsulados, com seus respectivos seletores
	  (getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
	  op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 
	 */
	
	private String nomeDaPessoa;
	private int telefone;
	private String endereco;
	
	public Pessoa(String nomeDaPessoa,int telefone,String endereco)
	{
		this.nomeDaPessoa = nomeDaPessoa;
		this.telefone = telefone;
		this.endereco = endereco;
		}
	
	public void imprimirInfoEndereco()
	{
	System.out.println("O endere�o de: "+nomeDaPessoa+" �: "+endereco);

	}
	
	public void imprimirInfoTelefone()
	{
	System.out.println("O telefone de: "+nomeDaPessoa+" �: "+telefone);

	}

	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}

	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}