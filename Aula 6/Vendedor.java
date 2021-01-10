package POOClasses;

public class Vendedor extends Pessoa{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nomeDaPessoa,int telefone, String endereco,double valorVendas,double comissao) {
		super(nomeDaPessoa,telefone,endereco);
		this.valorVendas=valorVendas;
		this.comissao=comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
