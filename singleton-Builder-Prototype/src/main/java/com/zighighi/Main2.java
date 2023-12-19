package com.zighighi;

import com.zighighi.model.AccountStatus;
import com.zighighi.model.AccountType;
import com.zighighi.model.BankAccount;
import com.zighighi.model.Customer;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        BankAccount account = new BankAccount();
        account.setAccountId(1L);
        account.setCurrency("USD");
        account.setType(AccountType.CURRENT_ACCOUNT);
        account.setStatus(AccountStatus.ACTIVATED);
        account.setBalance(20000);
        account.setCustomer(new Customer(1L,"ZIGHIGHI"));

        BankAccount account2 = new BankAccount();
        account2.setAccountId(account.getAccountId());
        account2.setCurrency(account.getCurrency());
        account2.setType(account.getType());
        account2.setStatus(account.getStatus());
        account2.setBalance(account.getBalance());
        BankAccount account3 = account.clone();
        System.out.println(account);
        System.out.println(account3);
        System.out.println("*****************************************************");
        account3.getCustomer().setName("ZAKARIA");
        System.out.println(account);
        System.out.println(account3);


    }
}
