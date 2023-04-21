package org.lima.apps.bankingATM;

import lombok.Data;

@Data
public class Card {
    private String userName;
    private int pin;
    private String country;
    private double securityId;


}
