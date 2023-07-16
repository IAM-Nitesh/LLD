package Day16_Design_Pattern.CreationalDesign.Factory;

public  class UIFactoryHelper {

    if (Platform.equals(SupportedPlatform.ANDROID)){
        return new AndriodUIFactory();
    }
        else{
        return new IOSUiFactory();
    }


}
