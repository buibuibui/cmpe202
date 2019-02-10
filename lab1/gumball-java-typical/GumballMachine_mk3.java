
public class GumballMachine_mk3 extends GumballMachine_mk2
{
    
    public GumballMachine_mk3( int size )
    {
        // call super constructor
        super(size);
    }

    public void insertPenny()
    {
        // uhhuh
        this.value_counter++;
    }
    
    public void insertNickel()
    {
        this.value_counter += 5;
    }
    
    public void insertDime()
    {
        this.value_counter += 10;
    }
    
    public void insertHalfDollar()
    {
        this.value_counter += 50;
    }
}
