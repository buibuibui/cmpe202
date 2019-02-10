
public class Main {

	public static void main(String[] args) {
		// Gumball Machine 1
		GumballMachine gumballMachine = new GumballMachine(5, 25);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		// Gumball Machine 2

		GumballMachine gumballMachine_2 = new GumballMachine(5, 50);

		System.out.println(gumballMachine_2);

		gumballMachine_2.insertQuarter();
		gumballMachine_2.turnCrank();
		gumballMachine_2.insertQuarter();
		gumballMachine_2.turnCrank();
		gumballMachine_2.insertQuarter();
		gumballMachine_2.turnCrank();

		System.out.println(gumballMachine_2);

		// Gumball Machine 3

		GumballMachine gumballMachine_3 = new GumballMachine(5, 50);

		System.out.println(gumballMachine_3);

		gumballMachine_3.insertQuarter();
		gumballMachine_3.turnCrank();
		gumballMachine_3.insertQuarter();
		gumballMachine_3.turnCrank();
		gumballMachine_3.insertQuarter();
		gumballMachine_3.turnCrank();
		gumballMachine_3.insertNickel();
		gumballMachine_3.insertDime();
		gumballMachine_3.ejectDime();
		gumballMachine_3.insertDime();
		gumballMachine_3.insertDime();
		gumballMachine_3.turnCrank();

		System.out.println(gumballMachine_3);
	}
}
