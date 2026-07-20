package getter_setter_com;

public class Bank
{
    public static void main(String[] args)
    {
        BankAccount bankacc = new BankAccount();

        bankacc.setaccnum(354531);
        bankacc.setsecretpin(8567);

//        bankacc.setbal(-5000); // Invalid
//        bankacc.showBalance(8566);
        
        
//        bankacc.setbal(4200.56); // valid
//        bankacc.showBalance(8567); 

        bankacc.showBalance(8554);
        bankacc.setbal(78942.99);
        
    }
}