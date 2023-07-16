package Day16_Design_Pattern.CreationalDesign.Factory;

import Day16_Design_Pattern.CreationalDesign.Factory.Components.Button;
import Day16_Design_Pattern.CreationalDesign.Factory.Components.Menu;

public interface UIFactory {

    // UI Factory will contain all the factory method as we are following abstract factory design pattern

    Button CreateButton(); // Factory methods as on the runtime we would be needing of return different object types

    Menu CreateMenu(); // Factory methods

}
