package Day16_Design_Pattern.CreationalDesign.Singleton.first_approach;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;

    }
}

// This would work fine for singleton but
// ISSUES:-
// won't work in multithreaded Environment