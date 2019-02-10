
public class GumballMachine
{

    int num_gumballs;
    int value_counter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.value_counter = 0;
    }

    public void insertQuarter()
    {
        this.value_counter += 25;
    }
    
    public void turnCrank()
    {
        if ( this.value_counter >= 25 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.value_counter -= 25;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
