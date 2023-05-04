package ch05.practice;

class Sum{
	int sum = 0;
	
	int sumFunction(int x) {
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		return sum;
	}
	
}