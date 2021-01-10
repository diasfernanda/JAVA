package Polimorfismo;

public class Animal {
	private String nomeDoAnimal;
	private int idadeDoAnimal;
	private String somDoAnimal;
	
	public Animal(String nomeDoAnimal,int idadeDoAnimal,String somDoAnimal)
	{
		this.nomeDoAnimal = nomeDoAnimal;
		this.idadeDoAnimal = idadeDoAnimal;
		this.somDoAnimal = somDoAnimal;
		}
	
	public String getNomeDoAnimal() {
		return nomeDoAnimal;
	}
	public void setNomeDoAnimal(final String nomeDoAnimal) {
		this.nomeDoAnimal = nomeDoAnimal;
	}
	public int getIdadeDoAnimal() {
		return idadeDoAnimal;
	}
	public void setIdadeDoAnimal(final int idadeDoAnimal) {
		this.idadeDoAnimal = idadeDoAnimal;
	}
	public String getSomDoAnimal() {
		return somDoAnimal;
	}
	public void setSomDoAnimal(final String somDoAnimal) {
		this.somDoAnimal = somDoAnimal;
	}

	
	
	
	}
