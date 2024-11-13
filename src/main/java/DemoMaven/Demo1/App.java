package DemoMaven.Demo1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Payment credit1=new creditCardPayments();
        credit1.processPayment();
        Payment credit2=new paypalPayment();
        credit2.processPayment();
        
    }
}
