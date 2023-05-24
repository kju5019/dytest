package ch07.date0523.character;

public class Wizard extends Character {

	public Wizard(String name) {
		setName(name);
		setJob("Wizard");
	}
	
	@Override
	public void attack() {
		System.out.print("["+getName()+" / "+getJob()+"] 마법 ");
		super.attack();
	}
}
