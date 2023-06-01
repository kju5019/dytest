package scanner.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	List<Person> personList = new ArrayList<>();

		
	//1. 전체 출력
	public void printPersonList() {
		for(int i=0; i<personList.size(); i++) {
			System.out.print(i+1+".");
			personList.get(i).printInfo();
		}		
	}

	
	//2. 등록
	public void addPerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id = sc.nextLine();
		System.out.print("이름를 입력하세요 =>");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 =>");
		String a = sc.nextLine();
		int age = Integer.parseInt(a);
		System.out.print("성별를 입력하세요(값: F,M) =>");
		String sex = sc.nextLine();
		
		System.out.println();
		
		for(int i=0; i<personList.size(); i++) {
			if( id.equals( personList.get(i).getId() ) ) {
				System.out.println("인원을 추가할 수 없습니다. 동일한 ID가 존재합니다.");
				return;
			}					
		}
		personList.add(new Person(id,name,age,sex));		
	}


	//3.수정
	public void updatePerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id = sc.nextLine();
		System.out.print("수정 이름를 입력하세요 =>");
		String name = sc.nextLine();
		System.out.print("수정 나이를 입력하세요 =>");
		String a = sc.nextLine();
		int age = Integer.parseInt(a);
		System.out.print("수정 성별를 입력하세요(값: F,M) =>");
		String sex = sc.nextLine();
		
		for(int i=0; i<personList.size(); i++) {
			if( id.equals( personList.get(i).getId() ) ) {
				personList.get(i).setName(name);
				personList.get(i).setAge(age);
				personList.get(i).setSex(sex);
				return;
			}					
		}		
	}


	//4. 삭제
	public void deletePerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id = sc.nextLine();
		
		for(int i=0; i<personList.size(); i++) {
			if( id.equals( personList.get(i).getId() ) ) {
				personList.remove(i);
				System.out.println("삭제 완료");
				return;
			}					
		}
	}


	//5. 조회(성별)
	public void selectPersonBySex(Scanner sc) {
		System.out.print("성별를 입력하세요(값: F,M) =>");
		String sex = sc.nextLine();
		for(int i=0; i<personList.size(); i++) {
			if(personList.get(i).getSex().equals(sex)) {
				personList.get(i).printInfo();
			}					
		}
		
	}	


	//6. 조회(나이 구간)
	public void selectPersonByAge(Scanner sc) {
		System.out.print("시작 나이를 입력하세요 =>");
		String a1 = sc.nextLine();
		int minAge = Integer.parseInt(a1);
		System.out.print("종료나이를 입력하세요 =>");
		String a2 = sc.nextLine();
		int maxAge = Integer.parseInt(a2);
		
		for(int i=0; i<personList.size(); i++) {
			if(personList.get(i).getAge()>= minAge && personList.get(i).getAge()<=maxAge) {
				personList.get(i).printInfo();
			}
		}		
	}
	

}
