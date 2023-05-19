package ch05.date0518;

public class CardRankApp {

	public static void main(String[] args) {
		String[] cardRanks;
		cardRanks = new String[] {"1","2","3","4","5","6","7","8","9","10"
								,"Jack","Queen","King"};

		for(int i=0 ;i< cardRanks.length; i++) {
			System.out.println("cardRanks["+i+"] "+cardRanks[i]);
			
		}
	}

}
