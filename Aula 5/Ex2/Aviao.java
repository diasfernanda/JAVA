package POO;

public class Aviao {
	private String tamanhoDoAviao;
	private String quantidadeDePassageiros;
	private String pesoMaximo;
	
	public Aviao(String tamanho,String passageiros,String peso)
	{
		tamanhoDoAviao=tamanho;
		quantidadeDePassageiros=passageiros;
		pesoMaximo=peso;
	}
	
	public String getDadosdoAviao()
	{
		String dadosDoAviao = "Tamanho do Avião: "+tamanhoDoAviao+"\nQuantidade de passageiros permitidos: "
		+ ""+quantidadeDePassageiros+"\nPeso máximo permitido: "+pesoMaximo;
		return dadosDoAviao;
	}
}
