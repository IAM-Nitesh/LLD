package Day16_Design_Pattern.StructuralDesign.Decorator;

public class StrawberryScoop implements IceCream {
    private IceCream iceCream;

    public StrawberryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Strawberry Scoop";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }
}
