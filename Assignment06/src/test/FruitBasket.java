package test;
import com.app.fruits.*;
import java.util.*;
public class FruitBasket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Fruit> list = new ArrayList<>();
		
		
		int choice;
		while((choice = menu(input))!= 0) {
			switch(choice) {
			case 1:
				 Mango mango = new Mango("Yellow",50,"Mango", true);
				 mango.freshOrNot(input);
				 list.add(mango);
				break;
				
			case 2:
				Orange orange = new Orange("Saffron",30,"Orange", true);
				orange.freshOrNot(input);
				list.add(orange);
				break;
				
			case 3:
				Apple apple = new Apple("Red",45,"Apple", true);
				 apple.freshOrNot(input);
				 list.add(apple);
				 break;
				
			case 4:
				for(Fruit i : list) {
					System.out.println(i.getName());
				}
				break;
			
			case 5:
				for(Fruit i: list) {
					i.display();
				}
				break;
			case 6:
				for(Fruit i: list) {
					if(!i.isFresh()) {
						i.display();
					}
				}
				break;
			case 7:
				System.out.println("Enter the fruit index you want to mark as stale");
				int index = input.nextInt();
				  list.get(index-1).freshOrNot(input);
				  break;
			case 8:
				for(Fruit i: list) {
					i.setFresh(false);
				}
				break;
			}
		}
		
	}

	
	
	static public int menu(Scanner input) {
		System.out.println("press 0. To exit");
		System.out.println("press 1. To Add Mango");
		System.out.println("press 2. To add Orange");
		System.out.println("press 3. To add Apple");
		System.out.println("press 4. To display all fruits in the basket");
		System.out.println("press 5. to display info of all fruit");
		System.out.println("press 6. to display all stale fruits in the basket");
		System.out.println("press 7. to mark a fruit as stale");
		System.out.println("press 8. to mark all fruits as stale");
		int choice = input.nextInt();
		return choice;
	}
}
