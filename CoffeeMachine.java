/**
 * 
 */
/**
 * @author dejan.laboski
 *
 */
package coffeemachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Item {

	public String name();

	public double price();

}

class Espreso implements Item {

	@Override
	public String name() {
		return "Espreso";
	}

	@Override
	public double price() {
		return 5.0;
	}

}

class Capuchino implements Item {

	@Override
	public String name() {
		return "Capuchino";
	}

	@Override
	public double price() {
		return 7.0;
	}

}

class Milk implements Item {

	@Override
	public String name() {
		return "Milk";
	}

	public double price() {
		return 4.0;
	}

}

class Tea implements Item {

	@Override
	public String name() {
		return "Tea";
	}

	@Override
	public double price() {
		return 5.0;
	}

}

final class CoffeeMachine {

	Scanner scanner = new Scanner(System.in);
	{
		System.out.println("Enter coins");
	}
	public static double coin;
	static double morecoin;

	private CoffeeMachine() {
		do {
			morecoin = scanner.nextDouble();
			coin += morecoin;
			if (coin >= 4)
				System.out.println("make order");
			else {

				System.out.println("enter more coins");

			}
		} while (coin < 4);

	}

	private static CoffeeMachine instance;

	public static CoffeeMachine getInstance() {
		if (instance == null) {
			instance = new CoffeeMachine();
			return instance;
		} else {
			return null;
		}
	}

	List<Item> order = new ArrayList<Item>();


	public void makeOrder() {
		Scanner choose = new Scanner(System.in);
		System.out.println("how many drinks");
		int c = choose.nextInt();
		if(c*4>coin)System.out.println("Not enougn money for " + c + " drinks");
		else{
		for (int i = 0; i < c; i++) {
			if (i == 0)
				System.out.println("Choose drink: Milk:10(4.0$)  Tea:11(5.0$)    Espreso:12(5.0$)  Capuchino:13(7.0$)");
			else if (i == c - 1)
				System.out.println(
						"Choose the last drink: Milk:10(4.0$)  Tea:11(5.0$)    Espreso:12(5.0$)  Capuchino:13(7.0$)");
			else
				System.out.println(
						"Choose the Next drink: Milk:10(4.0$)  Tea:11(5.0$)    Espreso:12(5.0$)  Capuchino:13(7.0$)");

			int a = choose.nextInt();
			switch (a) {
			case 10:
				if (coin > new Milk().price()) { // 3 instances 
					coin -= new Milk().price();
					order.add(new Milk());
					showItems();

				}

				else
					System.out.println("No coins for "+ new Milk().name());
				System.out.println("you have left " + coin + "$ \n" ); 

				break;
			case 11:
				if (coin > new Tea().price()) {
					coin-=new Tea().price();
					order.add(new Tea());
					showItems();


				}

				else
					System.out.println("No coins for " + new Tea().name());
				System.out.println("you have left " + coin + "$ \n" ); 


				break;
			case 12:
				if (coin > new Espreso().price()) {
					coin -= new Espreso().price();
					order.add(new Espreso());
					showItems();
				} else
					System.out.println("No coins for "+ new Espreso().name());
				System.out.println("you have left " + coin +"$ \n"); 


				break;
			case 13:
				if (coin > new Capuchino().price()) {
					coin -= new Capuchino().price();
					order.add(new Capuchino());
					showItems();

				} else
					System.out.println("No coins for "+ new Capuchino().name());
				System.out.println("you have left " + coin +"$ \n"); 


				break;
			default:
				System.out.println("invalid number");
				System.out.println("you have left " + coin + "$ \n" ); 


			}
		}
	}
	}
	public void showItems() {
		
				System.out.println(order.get(order.size() - 1).name());
				System.out.println(order.get(order.size() - 1).price()+"$");

				Scanner sugar = new Scanner(System.in);
				System.out.println("Add sugar: Yes: y    No: n");
				String b = sugar.nextLine();
				switch (b) {
				case "y":
					System.out.println("Sugar added ");
					break;
				case "n":
					System.out.println("No sugar added ");
					break;
				default:
					System.out.println("No sugar choosed ");

				}
			}
		

	}



class Test {

	public static void main(String[] args) {

		CoffeeMachine a = CoffeeMachine.getInstance();
		double d = CoffeeMachine.coin;
		a.makeOrder();
		System.out.println("Money paid: " + d + "$");
		System.out.println("Total cost: " + (d - CoffeeMachine.coin + "$"));
		System.out.println("Rest: " + CoffeeMachine.coin + "$");
	}
}
