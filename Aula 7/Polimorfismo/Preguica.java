package Polimorfismo;

public class Preguica extends Animal {
	private String atividade;
	
	public Preguica(String nomeDoAnimal,int idadeDoAnimal,String somDoAnimal,String atividade) {
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
		return "O som da preguiça é o "+super.getSomDoAnimal()+"\n";
	}
	
}
