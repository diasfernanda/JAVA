package POOClasses;

public class Administrador extends Pessoa{
	
	private int ajudaDeCusto;

	
	public Administrador(String nomeDaPessoa, int telefone, String endereco,int ajudaDeCusto) {
		super(nomeDaPessoa, telefone, endereco);
		this.ajudaDeCusto=ajudaDeCusto;
	}


	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}


	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
		

	

}

