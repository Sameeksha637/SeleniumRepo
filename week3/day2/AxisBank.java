package week3.day2;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("Deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank a = new AxisBank();
		BankInfo b = new BankInfo();
		b.deposit();
		a.deposit();
	}

}
