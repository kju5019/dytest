package ch16.date0619.job;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Variable =====");
		System.out.println("\n----- implements Interface -----");
		Designer designer = new Designer();
		designer.work();
		
		Programmer programmer = new Programmer();
		programmer.work();

		System.out.println("\n----- Anonymous -----");
		
		Job d = new Job() {
			@Override
			public void work() {
				System.out.println("디자이너");
			}
		};
		
		Job p = new Job() {
			@Override
			public void work() {
				System.out.println("프로그래머");
			}
		};
		
		d.work();
		p.work();
		
		System.out.println("\n----- Lamda -----");
		Job d1 = () ->{
			System.out.println("디자이너");
		};
		
		Job p1 = () -> {
			System.out.println("프로그래머");
		};
		
		d1.work();
		p1.work();
		

		System.out.println("\n===== Method =====");
		System.out.println("\n----- implements Interface -----");
		
		Biz b = new Biz();
		b.biz(designer);
		b.biz(programmer);


		System.out.println("\n----- Anonymous -----");
		b.biz(d);
		b.biz(p);
		
		b.biz(new Job() {
			@Override
			public void work() {
				System.out.println("가수");
			}
		});
		
		System.out.println("\n----- Lamda -----");
		b.biz(() -> {
			System.out.println("유튜버");
		});
		
		b.biz(() -> System.out.println("PD"));


	}

}
