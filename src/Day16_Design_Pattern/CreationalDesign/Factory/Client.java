package Day16_Design_Pattern.CreationalDesign.Factory;

import Day16_Design_Pattern.CreationalDesign.Factory.Components.Button;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.Menu;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = new Flutter();
        UIFactory Uifactory = flutter.CreateFactory(SupportedPlatform.IOS);
        Button b = Uifactory.CreateButton();
        b.Showbutton();
        Menu m = Uifactory.CreateMenu();
        m.showMenu();

    }


}

