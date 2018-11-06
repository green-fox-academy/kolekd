package com.greenfox.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    String name;
    long balance;
    String animalType;
    boolean isKing;
    boolean isGood;

    DecimalFormat numberFormat = new DecimalFormat("#.00 Zebra");

    public BankAccount (String name, long balance, String animalType, boolean isKing, boolean isGood){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGood = isGood;
    }

    public boolean getIsKing(){
        return this.isKing;
    }

    public boolean getIsGood(){
        return this.isGood;
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
