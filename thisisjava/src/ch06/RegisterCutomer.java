package ch06;

public class RegisterCutomer {

	public static void main(String[] args) {
		Customer cus1 = new Customer("아이디1","비밀번호1","이름1","번호1","주소1");
		System.out.println(cus1.id);
		System.out.println(cus1.password);
		System.out.println(cus1.name);
		System.out.println(cus1.tel);
		System.out.println(cus1.addr);

	}

}
