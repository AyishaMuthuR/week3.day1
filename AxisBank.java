package week3.day1;

public class AxisBank extends BankInfo{
    public void deposit() {
    	System.out.println("Axis Bank deposit limit is 10000");
    }
	public static void main(String[] args) {
		
		AxisBank bnk=new AxisBank();
		bnk.saving();
		bnk.fixed();
		bnk.deposit();

	}

}
