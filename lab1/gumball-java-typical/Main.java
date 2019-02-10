

public class Main {

    public static void main(String[] args) {
        
        // first gumball machine
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        // second gumball machine
        
        GumballMachine_mk2 gumballMachine_mk2 = new GumballMachine_mk2(5);
        
        System.out.println(gumballMachine_mk2);

        gumballMachine_mk2.insertQuarter();
        gumballMachine_mk2.turnCrank();
        gumballMachine_mk2.insertQuarter();
        gumballMachine_mk2.turnCrank();
        gumballMachine_mk2.insertQuarter();
        gumballMachine_mk2.insertQuarter();
        gumballMachine_mk2.turnCrank();

        System.out.println(gumballMachine_mk2);
        
        // third gumball machine

        GumballMachine_mk3 gumballMachine_mk3 = new GumballMachine_mk3(5);
        
        System.out.println(gumballMachine_mk3);

        gumballMachine_mk3.insertQuarter();
        gumballMachine_mk3.turnCrank();
        gumballMachine_mk3.insertQuarter();
        gumballMachine_mk3.turnCrank();
        gumballMachine_mk3.insertQuarter();
        gumballMachine_mk3.insertQuarter();
        gumballMachine_mk3.turnCrank();

        gumballMachine_mk3.insertNickel();
        gumballMachine_mk3.insertDime();
        gumballMachine_mk3.insertDime();
        gumballMachine_mk3.turnCrank();

        for (int i = 0; i < 25; i++) {
            gumballMachine_mk3.insertPenny();
        }
        gumballMachine_mk3.turnCrank();

        System.out.println(gumballMachine_mk3);
    }
}
