package Day16_Design_Pattern.BehaviourDesign.Observer;

public class InventoryService implements OnOrderPlacedSubscriber {
    InventoryService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory");
    }
}