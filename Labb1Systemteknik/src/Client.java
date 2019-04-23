import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Client Dice = new Client();

		System.out.println("Dice emulator!\nPick a number for specified dice!");
		System.out.println("1.D6\n2.D8\n3.D12\n4.D20\n0 = quit");	
		int nr = 5;
		
		while (nr != 0) {

			Scanner sc = new Scanner(System.in);
			nr = sc.nextInt();
			
				if (nr == 1);{
					Dice.D6();
				}
				if (nr == 2);{
					Dice.D8();
					}
				if (nr == 3);{
					Dice.D12();
					}
				if (nr == 4);{
					Dice.D20();
					}
				if (nr > 4); {
					System.out.println("Not a valid number");
					}
				if (nr == 0);{
					break;
					}
		}
	}
	private void D6() {
		AbstractFactory AF = new ConcreteFactory1();
		AbstractProductA APA_D6 = AF.CreateProductA();
		APA_D6.productA();
	}
	private void D8() {
		AbstractFactory AF = new ConcreteFactory1();
		AbstractProductB  APB_D8 = AF.CreateProductB();
		APB_D8.productB();
	}
	private void D12() {
		AbstractFactory AF2 = new ConcreteFactory2();
		AbstractProductA APA2_D12 = AF2.CreateProductA();
		APA2_D12.productA();
	}
	private void D20() {
		AbstractFactory AF2 = new ConcreteFactory2();
		AbstractProductB APB2_D20 = AF2.CreateProductB();
		APB2_D20.productB();
	}
}
