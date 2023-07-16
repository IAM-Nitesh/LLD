package Day16_Design_Pattern.CreationalDesign.Singleton.double_check_locking;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = null;

    //Lock lock = new ReentrantLock();
    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {

        if (dataBaseConnection == null){                    // I. CHECK
            //lock;
            synchronized (DataBaseConnection.class){        // II. ACQUIRE LOCK
                if (dataBaseConnection == null) {           // III. CHECK AGAIN
                    dataBaseConnection = new DataBaseConnection();
                }
            // unlock();
            }
        }
        return dataBaseConnection;
    }
}

// This would work fine for singleton and
// will work in multithreaded Environment

// This singleton is used when object creation is a costly operation, and we have some shared resource.
// if we need to restrict only to one object creation of the class having global access to the then we create singleton class

/*
Steps:

1) Make the constructor of the class private.
 The static method of the class will still be able to call the constructor, but not the other objects.

2) Add a private static field to the class for storing the singleton instance.
Implement “lazy initialization”. It should create a new object on its first call and put it into the static field.
The method should always return that instance on all subsequent calls.

3) Declare a public static creation method (getInstance) for getting the singleton instance.

4) Go over the client code and replace all direct calls to the singleton’s constructor with calls to its static creation method.

5) create an if check whether object is already creator or not and implement multithreaded safe using double check locking mechanism.
 */