
public class GumballMachine_mk2 extends GumballMachine
{
    
    public GumballMachine_mk2( int size )
    {
        // call super constructor
        super(size);
    }

    public void turnCrank()
    {
        if ( this.num_gumballs > 0 )
        {
            if ( this.value_counter >= 50 ) {
                this.num_gumballs--;
                this.value_counter -= 50;
                System.out.println("Thanks for the coins. Gumball ejected!");
            } else {
                System.out.println("Gumballs cost 50 cents. Try again once you've put in enough money.");
            }
        }
        else
        {
            System.out.println( "We're out of gumballs. Sorry." ) ;
        }
    }
}
