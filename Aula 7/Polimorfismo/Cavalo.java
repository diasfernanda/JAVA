package Polimorfismo;

public class Cavalo extends Animal{
	private String atividade;
	
	public Cavalo(String nomeDoAnimal,int idadeDoAnimal,String somDoAnimal,String atividade) {
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
		return "O cavalo "+super.getSomDoAnimal()+"\n";
	}
}
