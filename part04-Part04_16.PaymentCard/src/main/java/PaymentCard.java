/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
public class PaymentCard {
 
    private double balance;
 
    public PaymentCard(double balance) {
        this.balance = balance;
    }
 
    public void eatAffordably() {
        if (this.balance - 2.60 >= 0.0) {
            this.balance -= 2.60;
        }
    }
 
    public void eatHeartily() {
        if (this.balance - 4.60 >= 0.0) {
            this.balance -= 4.60;
        }
    }
 
    public void addMoney(double money) {
        if (money > 0) {
            if (balance + money > 150) {
                balance = 150;
            } else {
                balance += money;
            }
        }
 
    }
 
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
 