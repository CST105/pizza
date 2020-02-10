package pizza;

public class Store {

	public static int sBox = 5;
	public static int mBox = 5;
	public static int lBox = 5;
	private static int maxNumPizzas = 5;
	private static int curNumPizzas = 0;
	private static Pizza [] pies = new Pizza[maxNumPizzas];
	
	public static void makePizzas() {
		
		for (int x = 0; x < maxNumPizzas; x++) {
			Pizza p = new Pizza();
			p.size = getSize();
			p.numToppings = getToppingCount();
			p.bakeTemp = getBakeTemp();
			p.price = getPrice();
			p.crustType = getCrust();
			p.throwIt();
			p.customize(getSauce());
			p.bake();
			p.updatePrice();
			p.slice(getCustomerInfo());
			p.boxPizza();
			pies[x] = p;
		}
		viewPizzas();
	}
	
	public static void viewPizzas() {
		
		for (Pizza p : pies) {
			System.out.println(p);
		}		
	}
	
	public static int getSize() {
		System.out.println("What is the pizza size in inches?");
		int out = Pizza.sc.nextInt();
		Pizza.sc.nextLine();
		return out;	
	}
	
	public static int getToppingCount() {
		System.out.println("How many toppings on your pizza?");
		int out = Pizza.sc.nextInt();
		Pizza.sc.nextLine();
		return out;	
	}
	
	public static int getBakeTemp() {
		System.out.println("How hot should the oven be?");
		int out = Pizza.sc.nextInt();
		Pizza.sc.nextLine();
		return out;	
	}
	
	public static double getPrice() {
		System.out.println("How much for the pizza?");
		double out = Pizza.sc.nextDouble();
		Pizza.sc.nextLine();
		return out;	
	}
	
	public static String getCrust() {
		System.out.println("What type of crust for your pizza?");
		return Pizza.sc.nextLine();	
	}
	
	public static int getCustomerInfo() {
		System.out.println("How many slices do you want?");
		int out = Pizza.sc.nextInt();
		Pizza.sc.nextLine();
		return out;	
	}

	public static String getSauce() {
		System.out.println("What kind of sauce do you want?");
		return Pizza.sc.nextLine();
	}

	public static void updateBoxInventory(char size) {
		if (size == 's') {
			sBox--;
			if (sBox < 2) {
				System.out.println("Ordering more small boxes");
				sBox = 5;
			}
			showInventory();
		}
		else if (size == 'm') {
			mBox--;
			if (mBox < 2) {
				System.out.println("Ordering more medium boxes");
				mBox = 5;
			}
			showInventory();
		}
		else {
			lBox--;
			if (lBox < 2) {
				System.out.println("Ordering more large boxes");
				lBox = 5;
			}
			showInventory();

		}
	}
	
	public static void showInventory() {
		System.out.println(" BOX INVENTORY");
		System.out.println("========================");	
		System.out.println("Small boxes = \t" + sBox);
		System.out.println("Medium boxes = \t" + mBox);
		System.out.println("Large boxes = \t" + lBox);
		System.out.println(" ");
	}

}
