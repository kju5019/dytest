package ch14.date0526;
public class BankAccount {

	private String accountNo; // 계좌번호
	private int balance; // 잔액

	// Constructor
	public BankAccount(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
// region getter setter

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
//endregion
	
	public synchronized void withDraw(String threadName, int cnt, int money) {

		System.out
				.println(accountNo + " | " + threadName + " | " + cnt + " | Start | 잔액=" + balance + " | 요청=" + money);

		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance = balance - money;
			System.out.println(
					accountNo + " | " + threadName + " | " + cnt + " | End   | 출금=" + money + " | 잔액=" + balance);
		} else {
			System.out.println(accountNo + " | " + threadName + " | " + cnt + " | End   | 잔액부족 미출금 | 잔액=" + balance);
		}

	}
}
