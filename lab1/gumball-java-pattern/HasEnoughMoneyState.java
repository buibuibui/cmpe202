

import java.util.Random;

public class HasEnoughMoneyState implements State {
	GumballMachine gumballMachine;
 
	public HasEnoughMoneyState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another Quarter");
	}
 
	public void ejectQuarter() {
		if (gumballMachine.getValueCounter() >= 25) {
			gumballMachine.subtractValue(25);
			System.out.println("A quarter is returned to you");
            if (gumballMachine.getValueCounter() == 0) {
                gumballMachine.setState(gumballMachine.getNoMoneyState());
            } else {
                gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
            }
		} else {
			System.out.println("Not enough money to return");
		}
	}

	public void insertNickel() {
		System.out.println("You can't insert another Nickel");
	}
 
	public void ejectNickel() {
        if (gumballMachine.getValueCounter() >= 5) {
            gumballMachine.subtractValue(5);
            System.out.println("A nickel is returned to you");
            if (gumballMachine.getValueCounter() == 0) {
                gumballMachine.setState(gumballMachine.getNoMoneyState());
            } else {
                gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
            }
        } else {
            System.out.println("Not enough money to return");
        }
	}

	public void insertDime() {
		System.out.println("You can't insert another Dime");
	}
 
	public void ejectDime() {
        if (gumballMachine.getValueCounter() >= 10) {
            gumballMachine.subtractValue(10);
            System.out.println("A dime is returned to you");
            if (gumballMachine.getValueCounter() == 0) {
                gumballMachine.setState(gumballMachine.getNoMoneyState());
            } else {
                gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
            }
        } else {
            System.out.println("Not enough money to return");
        }
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
