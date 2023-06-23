package Day2_constructors;

public class Student {

    String name;

    int age;

    double psp;

    String batchname;

    Student(String stName, int age, double psp, String stbatchname)
    {
        name = stName;
        this.age = age;
        this.psp = psp;
        batchname = stbatchname;
    };

    public Student(){}; // default constructor with public access modifier

    public Student (String name, int age) // parameterised constructor
    {
        this.age = age;
        this.name = name;
    };

    public Student (Student st) // copy constructor doing shallow copy
    {
        this.age = st.age;
        this.name = st.name;
        this.psp = st.psp;
        this.batchname = st.batchname;
    }
}
