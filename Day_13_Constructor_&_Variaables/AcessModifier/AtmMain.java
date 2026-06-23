package com.practise;

class ATM {

    private int pin = 1234;			//private

    void showPin() {
        System.out.println(pin);
    }
}

public class AtmMain {

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.showPin();

        // atm.pin  Error
    }
}


/*
OUTPUT

  12034
*/
