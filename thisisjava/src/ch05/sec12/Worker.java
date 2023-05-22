package ch05.sec12;

public class Worker {
	private String name;
	private int career;
	private Job job;
	
	public Worker(String name, int career, Job job) {
		this.name = name;
		this.career = career;
		this.job = job;
	}
	
	public void printInfo() {
		System.out.println("이름: "+name+" | 커리어: "+career+"(년) | 직업: "+job);
	}
	

}
