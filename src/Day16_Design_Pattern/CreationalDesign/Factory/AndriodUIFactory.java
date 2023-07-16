package Day16_Design_Pattern.CreationalDesign.Factory;

import Day16_Design_Pattern.CreationalDesign.Factory.Components.AndriodButton;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.AndriodMenu;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.Button;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.Menu;

public class AndriodUIFactory implements UIFactory{
    @Override
    public Button CreateButton() {
        return new AndriodButton();
    }

    @Override
    public Menu CreateMenu() {
        return new AndriodMenu();
    }
}
