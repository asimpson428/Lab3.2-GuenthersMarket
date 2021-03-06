import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Market {
	
	private static Scanner scnr;
	private static Map<String, Double> items = new TreeMap<>();
	private static List<String> orderNames = new ArrayList<>();
	private static List<String> orderPrices = new ArrayList<>();

	public static void main(String[] args) {
		
		scnr = new Scanner(System.in);
		fillItemsMap();
		printMenu();
		
		System.out.print("What item would you like to order? ");
		String itemName = scnr.nextLine();
		Double itemPrice = items.get(itemName);
		System.out.println("Adding " + itemName + " to cart at $" + itemPrice);
		
		
		
		scnr.close();
		
		
	}
	
	private static void fillItemsMap() {
		items.put("apple", .99);
		items.put("oranges", .89);
		items.put("kiwi", 3.99);
		items.put("banana", .59);
		items.put("grapes", 1.99);
		items.put("bread", 1.89);
		items.put("lettuce", .99);
		items.put("onion", 1.49);
		
	}
	
	private static void printMenu() {
		System.out.println("Item\tPrice");
		
		for (Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey() + "\t" +entry.getValue());
		}
	}

}
