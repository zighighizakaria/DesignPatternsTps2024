package com.zighighi;

import com.zighighi.model.AccountType;
import com.zighighi.model.BankAccount;
import com.zighighi.repository.AccountRepositoryImpl;
import com.zighighi.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                accountRepository.populateData();
            }).start();
        }
        System.out.println("PRESS");
        System.in.read();
        List<BankAccount> bankAccounts = accountRepository.findAll();
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

    }
}