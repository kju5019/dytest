package ch05.date0519.part2;

import java.text.DecimalFormat;

public class Cart {
	private Member member;
	private Book[] bookArray;
	private Shirt[] shirtArray;
	
	DecimalFormat df = new DecimalFormat("#,###");

	public Cart(Member member, Book[] bookArray, Shirt[] shirtArray) {
		this.member = member;
		this.bookArray = bookArray;
		this.shirtArray = shirtArray;
	}

	//도서 구매 총액
	public void printBooksExpense() {
		int sum = 0;
		for(int i=0; i<bookArray.length;i++) {
			sum += bookArray[i].getPrice();
		}
		System.out.println("도서 총 금액: "+df.format(sum) + "(원)");
	}

	//도서 구매 정보
	public void printBooksInfo() {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			index++;
			System.out.println("\n"+index+".");
			bookArray[i].printBook();
		}		
	}
	
		
	//분야별 도서 정보
	public void printBookByCategory(String category) {
		int index = 0;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i].getCategory() == category) {
				index++;
				System.out.println("\n" + index + ".");
				bookArray[i].printBook();
			}
		}
		if (index == 0) {
			System.out.println("\nNo data available");
		}

	}

	//셔츠 구매 총액
	public void printShirtsExpense() {
		int sum = 0;
		for(int i=0; i<shirtArray.length;i++) {
			sum += shirtArray[i].getPrice();
		}
		System.out.println("셔츠 총 금액: "+df.format(sum) + "(원)");
		
	}

	//셔츠 구매 정보
	public void printShirtsInfo() {
		int index = 0;
		int sum = 0;
		for(int i=0; i<shirtArray.length; i++) {
			index++;
			sum += shirtArray[i].getPrice();
			System.out.println("\n"+index+".");
			shirtArray[i].printShirt();
		}
		System.out.println("\n* 구매수: "+index+"(벌)");
		System.out.println("* 구매액: "+df.format(sum) + "(원)");
		
	}

	//전체 구매(도서 + 셔츠) 총액
	public void printTotalExpense() {
		int sum = 0;
		for(int i=0; i<bookArray.length;i++) {
			sum += bookArray[i].getPrice();
		}
		for(int i=0; i<shirtArray.length;i++) {
			sum += shirtArray[i].getPrice();
		}
		System.out.println("지불 총 금액: "+df.format(sum) + "(원)");
	}

	//전체 구매(도서 + 셔츠) 정보
	public void printCartInfo() {		
		System.out.println("----- Books Info -----");
		int indexB = 0;
		int sumB = 0;
		for(int i=0; i<bookArray.length; i++) {
			indexB++;
			sumB += bookArray[i].getPrice();
			System.out.println("\n"+indexB+".");
			bookArray[i].printBook();
		}
		System.out.println("\n* 구매수: "+indexB+"(권)");
		System.out.println("* 구매액: "+df.format(sumB) + "(원)");
		
		System.out.println("\n----- Shirt Info -----");
		int indexS = 0;
		int sumS = 0;
		for(int i=0; i<shirtArray.length; i++) {
			indexS++;
			sumS += shirtArray[i].getPrice();
			System.out.println("\n"+indexS+".");
			shirtArray[i].printShirt();
		}
		System.out.println("\n* 구매수: "+indexS+"(벌)");
		System.out.println("* 구매액: "+df.format(sumS) + "(원)");
		
		System.out.println("\n----- Total Info() -----");
		System.out.println("* 구매수: ");
		System.out.println("\t책: "+indexB+"(권)");
		System.out.println("\t셔츠: "+indexS+"(벌)");
		
		System.out.println("* 구매액 총합: "+df.format(sumS+sumB) + "(원)");		
	}

	//사은품 대상 여부. 200,000원 이상 구매시 사은품 증정
	public void printGiftYn() {
		int sumB = 0;
		int sumS = 0;
		for(int i=0; i<bookArray.length; i++) {
			sumB += bookArray[i].getPrice();
		}
		for(int i=0; i<shirtArray.length; i++) {			
			sumS += shirtArray[i].getPrice();
		}
		if(sumB+sumS >= 200000) {
			System.out.println("사은품 여부 : 대상");
		}else {
			System.out.println("사은품 여부 : 미대상");			
		}
		
	}

	//구매
	public void buy(boolean pointUseYn) {
		System.out.println("\n===== [ 영수증 ] =====");
		System.out.println("\n----- 고객 -----");
		member.printInfo();
		
		System.out.println("\n----- 구매내역 -----");
		int sumB = printBooksInfoShort();
		int sumS = printShirtInfoShort();
		
		System.out.println("\n----- 구매금액 -----");
		buyExpense(sumB, sumS);
		
		System.out.println("\n----- 결제금액 -----");
		int sum = sumB + sumS;		
		System.out.println("결제금액: "+ df.format(sum)+"(원)");
		
		System.out.println("\n----- 포인트 -----");
		point(sum);
		
		System.out.println("\n----- 사은품 -----");
		printGiftYn();				
	}
	
	//구매내역(책)
	public int printBooksInfoShort() {
		int indexB = 0;
		int sumB = 0;
		System.out.println("도서");
		for(int i=0; i<bookArray.length;i++) {
			indexB++;
			sumB += bookArray[i].getPrice();
			System.out.println("\t"+indexB+". "+bookArray[i].getTitle()+" "+df.format(bookArray[i].getPrice())+"(원)");
		}
		return sumB;
	}

	//구매내역(셔츠)
	public int printShirtInfoShort() {
		int indexS = 0;
		int sumS = 0;
		System.out.println("셔츠");
		for(int i=0; i<shirtArray.length;i++) {
			indexS++;
			sumS += shirtArray[i].getPrice();
			System.out.println("\t"+indexS+". "+shirtArray[i].getName()+" "+df.format(shirtArray[i].getPrice())+"(원)");
		}
		return sumS;
	}
	
	//구매금액
	public void buyExpense(int sumB, int sumS) {
		System.out.println("도서: "+df.format(sumB)+"(원)");
		System.out.println("셔츠: "+df.format(sumS)+"(원)");
		System.out.println("총액: "+df.format(sumS+sumB)+"(원)");
	}
	
	//포인트
	public void point(int sum) {
	
		int discount = switch(member.getGrade()) {
		case "S" -> 3;
		case "A" -> 2;
		default -> 1;
		};
		int nowPoint = member.getPoint();
		int newPoint = (sum*discount/100);
		int totalPoint = member.getPoint()+(sum*discount/100);
		
		System.out.println("현재 포인트: "+ df.format(nowPoint));
		System.out.println("신규 포인트: "+ df.format(newPoint));
		System.out.println("현재 포인트: "+ df.format(totalPoint));
		
		
	}
		
}
	
	


