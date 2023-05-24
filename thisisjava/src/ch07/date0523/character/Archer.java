package ch07.date0523.character;

public class Archer extends Character {

	public Archer(String name) {
		setName(name);
		setJob("Archer");
	}

	@Override
	public void attack() {
		System.out.print("["+getName()+" / "+getJob()+"] 원거리 ");
		super.attack();
	}

	
}


