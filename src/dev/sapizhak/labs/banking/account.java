public void transfer(Account acct,double amount,double fee)
        {
        if(amount<0){
        System.out.println();
        System.out.println("Transfer amount is invalid!");
        }
        else
        if(balance<amount) // If their are insufficent funds in the account
        {
        System.out.println();
        System.out.println("Error: Insufficient Funds.");
        }
        else
        {
        double remBalance=withdraw(amount,fee); //*withdraw money from sender's bank account and return remaining balance in his/her account.*/
        double updatedBalance=acct.deposit(amount-fee); /*deposit money to the reciever's bank account and return his/her updated balance.*/
        System.out.println();
        System.out.println("Updated balance--");
        System.out.println("Account: "+acctNumber+", Updated balance: "+remBalance);
        System.out.println("Account: "+acct.acctNumber+", Updated balance: "+updatedBalance);
        }
        }