public class MainProgram {
 
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard MattCard = new PaymentCard(30);
        
        paulCard.eatHeartily();
        MattCard.eatAffordably();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + MattCard);
        paulCard.addMoney(20);
        MattCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + MattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        MattCard.addMoney(50);
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + MattCard);
    }
}
 