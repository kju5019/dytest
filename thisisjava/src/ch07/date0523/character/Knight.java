package ch07.date0523.character;

public class Knight extends Character {

	public Knight(String name) {
		setName(name);
		setJob("Knight");
	}
	
	@Override
	public void attack() {
		System.out.print("["+getName()+" / "+getJob()+"] 근거리 ");
		super.attack();
	}
}
