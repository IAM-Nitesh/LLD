package Day16_Design_Pattern.CreationalDesign.Singleton.second_eager_loading;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = new DataBaseConnection();;

    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        return dataBaseConnection;
    }
}

// This would work fine for singleton and
// will work in multithreaded Environment but
// ISSUES:-
// 1) in case we have more singleton classes like this then app startup time would increase
// 2) we cannot pass attribute inside the constructor "getInstance" as it is static
// and static method cannot access non-static attributes