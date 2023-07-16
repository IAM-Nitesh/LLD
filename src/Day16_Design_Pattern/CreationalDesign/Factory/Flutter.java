package Day16_Design_Pattern.CreationalDesign.Factory;

public class Flutter {


    /*

    Flutter is our main class which contains :
    1) simple methods
    2) one factory method

    */

    void refreshUI(){
        System.out.println("Refreshing");
    }

    void setTheme(){
        System.out.println("Setting the theme");
    }

    UIFactory CreateFactory(SupportedPlatform Platform){

        /*
        Below code is prone to errors as someone can enter invalid values in .equals -> instead use enum

        if (Platform.equals("Andriod")){
            return new AndriodUIFactory();
        }
        else{
            return new IOSUiFactory();
        }

         */

//        if (Platform.equals(SupportedPlatform.ANDROID)){
//            return new AndriodUIFactory();
//        }
//        else{
//            return new IOSUiFactory();
//        }
    };
}
