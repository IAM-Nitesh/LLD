package Day16_Design_Pattern.CreationalDesign.Singleton.third_syncronised;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection(){}

    public synchronized static DataBaseConnection getInstance() {
        if (dataBaseConnection == null){
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }
}

// This would work fine for singleton and
// will work in multithreaded Environment but
// ISSUES:-
// performance would be slow as all the initial thread has to wait to get inside getinstance
// and thread would enter in sequential manner
