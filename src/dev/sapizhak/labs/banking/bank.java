import java.io.*;
public class bank
{
    public static void main(String[] args)
    {
        Account acct1 = new Account("Ted Murphy", 73254, 130.0);
        Account acct2 = new Account("Anita Gomez", 69713, 40.0);//Ted Murphy transfers $40 to Anita Gomez and let's assume fee is $1.
        acct1.transfer(acct2, 40, 1);
    }
}