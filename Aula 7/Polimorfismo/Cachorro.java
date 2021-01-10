package Polimorfismo;

public class Cachorro extends Animal {
	private String atividade;
	
	public Cachorro(String nomeDoAnimal,int idadeDoAnimal,String somDoAnimal,String atividade) {
		super(nomeDoAnimal, idadeDoAnimal, somDoAnimal);
		this.atividade=atividade;
	
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
	public String getSomDoAnimal()
	{
		return "O cachorro "+super.getSomDoAnimal()+"\n";
	}
}
