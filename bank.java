import java.util.*;
class acc_details{
	String c_name, acc_type;
	int acc_no, balance ,t_balance, deposit = 0, withdrawl = 0;
	acc_details(String name, int ano, String type, int bal){
		c_name = name;
		acc_no = ano;
		acc_type = type;
		balance = bal;
	}
	void d_money(int money){
		deposit = money;
		t_balance = balance + deposit;

	}
	void w_money(int money){
		withdrawl = money;
		t_balance = balance - withdrawl;
	}
	void display(){
		System.out.println("\nUser : "+"\nAccount Holder Name : "+c_name+"\nAccount Number : "+acc_no
						+"\nAccount Type : "+acc_type+"\nInitial Balance : "+balance
						+"\nDeposit : "+deposit+"\nWithdrawl : "+withdrawl+"\nCurrent Balance : "+t_balance);
	}
}

class bank{
	public static void main(String args[]){
		acc_details acc1 = new acc_details("Amit Das", 10022121, "C", 25526);
		acc_details acc2 = new acc_details("Santanu Ghosh", 10022312, "C", 70356);
		acc1.d_money(5500);
		acc2.w_money(1250);
		acc1.display();
		acc2.display();
	}
}
