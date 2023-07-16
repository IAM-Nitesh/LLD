package Day16_Design_Pattern.BehaviourDesign.Observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber {

    InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice");
    }
}
