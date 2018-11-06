package com.greenfox.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    String name;
    long balance;
    String animalType;
    boolean isKing;

    DecimalFormat numberFormat = new DecimalFormat("#.00 Zebra");

    public BankAccount (String name, long balance, String animalType, boolean isKing){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public boolean getIsKing(){
        return this.isKing;
    }

    public String getName(){
        return this.name;
    }

    public String getBalance(){
        return numberFormat.format(this.balance);
    }

    public String getAnimalType(){
        return this.animalType;
    }

}
