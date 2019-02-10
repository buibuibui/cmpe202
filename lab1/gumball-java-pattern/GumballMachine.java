

public class GumballMachine {
 
	State soldOutState;
	State noMoneyState;
	State notEnoughMoneyState;
	State hasEnoughMoneyState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int value_counter = 0;
	final int cost;
 
	public GumballMachine(int numberGumballs, int gumballCost) {
		soldOutState = new SoldOutState(this);
		noMoneyState = new NoMoneyState(this);
		notEnoughMoneyState = new NotEnoughMoneyState(this);
		hasEnoughMoneyState = new HasEnoughMoneyState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		this.cost = gumballCost;
 		if (numberGumballs > 0) {
			state = noMoneyState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void insertNickel() {
		state.insertNickel();
	}
 
	public void ejectNickel() {
		state.ejectNickel();
	}

	public void insertDime() {
		state.insertDime();
	}
 
	public void ejectDime() {
		state.ejectDime();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}

	int getValueCounter() {
		return value_counter;
	}

	void addValue(int value) {
		this.value_counter += value;
	}

	void subtractValue(int value) {
		this.value_counter -= value;
	}

	int getCost() {
		return cost;
	}
 
	void refill(int count) {
		this.count = count;
		state = noMoneyState;
	}

    public State getState() {
        return state;
	}
	
	public State getNoMoneyState() {
		return noMoneyState;
	}

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughMoneyState() {
        return notEnoughMoneyState;
    }

    public State getHasEnoughMoneyState() {
        return hasEnoughMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
