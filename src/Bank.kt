class Bank {
    lateinit var  bankName:String
    var customerList=ArrayList<Customer>()
   var accountList=ArrayList<Account>()



    fun createAccount()
    {
        var customer=Customer()
        customer.name="CUSTOMER ABC"
        customer.id=23;
        customer.phone="999999"
        customer.address="NEW YORK 233"

        var account=Account()

        account.id=123;
        account.accountType="SAVING"
        account.createdOn="10 Aug 2022"
        account.customer=customer;
        account.balance=200.0;

        customerList.add(customer)
        accountList.add(account)

    }

    fun withdrawMoney(accountId:Int,withdrawAmount:Double)
    {
        var accounttemp:Account?=null;
        for(account in accountList)
        {
            if(account.id==accountId)
            {
             accounttemp=  account;
             break;
            }

        }

        if(accounttemp==null)
        {
            print("Account Does not exist!!")
        }else{


          if(withdrawAmount>accounttemp.balance)
          {
              print("Insufficient Balance")

              return;
          }

            accounttemp.balance=accounttemp.balance-withdrawAmount;
            print("Hii ${accounttemp.customer.name} , you have withdrawan $withdrawAmount from your account")

        }





    }

}