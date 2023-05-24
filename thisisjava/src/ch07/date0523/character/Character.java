package ch07.date0523.character;

public class Character {
	private String name;
	private String job;
	
	public Character() {}
	public Character(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public void printInfo() {
		System.out.println("이름: "+name+" | 캐릭터: "+job);
	}
	
	
	public void attack() {
		System.out.println("공격");
	}
	
	
	//Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
