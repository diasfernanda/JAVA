package Polimorfismo;

public class testeAnimais {

	public static void main(String[] args) {
		Cavalo cav1 = new Cavalo("Cavalinho",10,"relincha","correr");
		Preguica preg1 = new Preguica("Preguicinha",3,"balido","Subir em árvores");
		Cachorro cach1 = new Cachorro("Doguinho",2,"late","Corre");
		
		Animal[] animais = new Animal[3];
		animais[0]=cav1;
		animais[1]=preg1;
		animais[2]=cach1;
		
		for (Animal zoo:animais)
		{
			System.out.printf(zoo.getSomDoAnimal());
		}
	}
}
