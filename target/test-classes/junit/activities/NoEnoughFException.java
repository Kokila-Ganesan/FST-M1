package activityPrograms;

public class NotEnoughFException extends RuntimeException {

    public NotEnoughFException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }

}