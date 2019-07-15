package cashregister;

public class FakePurchase extends Purchase{
    String message="";
    public FakePurchase() {}

    public void setMessage(String message) {
        this.message = message;
    }

    public String asString() {
        return message;
    }
}
