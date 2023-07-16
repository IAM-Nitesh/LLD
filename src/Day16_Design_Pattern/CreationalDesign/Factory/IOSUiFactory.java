package Day16_Design_Pattern.CreationalDesign.Factory;

import Day16_Design_Pattern.CreationalDesign.Factory.Components.Button;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.IOSButton;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.IOSMenu;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.Menu;

public class IOSUiFactory implements UIFactory{
    @Override
    public Button CreateButton() {
        return new IOSButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IOSMenu();
    }
}
