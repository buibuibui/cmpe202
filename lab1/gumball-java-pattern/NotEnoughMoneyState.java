

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
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
		System.out.println("You inserted a nickel");
		gumballMachine.addValue(5);
		if (gumballMachine.getValueCounter() >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
		} else {
			gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
		}
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
		System.out.println("You inserted a dime");
		gumballMachine.addValue(10);
		if (gumballMachine.getValueCounter() >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
		} else {
			gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
		}
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
		System.out.println("You turned, but nothing happened");
	 }
 
	public void dispense() {
		System.out.println("You need to pay more");
	} 
 
	public String toString() {
		return "waiting for coins";
	}
}
