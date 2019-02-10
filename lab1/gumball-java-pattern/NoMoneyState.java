

public class NoMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.addValue(25);
		if (gumballMachine.getValueCounter() >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
		} else {
			gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
		}
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted anything yet");
	}

	public void insertNickel() {
		System.out.println("You inserted a nickel");
		gumballMachine.addValue(5);
		if (gumballMachine.getValueCounter() >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
		} else {
			gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
		}
	}
 
	public void ejectNickel() {
		System.out.println("You haven't inserted anything yet");
	}

	public void insertDime() {
		System.out.println("You inserted a dime");
		gumballMachine.addValue(10);
		if (gumballMachine.getValueCounter() >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
		} else {
			gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
		}
	}
 
	public void ejectDime() {
		System.out.println("You haven't inserted anything yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but nothing happened");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coins";
	}
}
