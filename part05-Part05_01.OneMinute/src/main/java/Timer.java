/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Set
 */
public class Timer {
 
    private ClockHand hundredthsOfSeconds = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);
 
    public void advance() {
        this.hundredthsOfSeconds.advance();
        if (this.hundredthsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
 
    public String toString() {
        return seconds.toString() + ":" + hundredthsOfSeconds.toString();
    }
 
}
 