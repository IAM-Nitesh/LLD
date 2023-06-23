package Day2_accessmodifiers;

public class StudentChild extends Student{

    public static void main(String[] args) {

        StudentChild st = new StudentChild();

        // st.name = "Nitesh"; -> Private not accessible from child class

        st.age = 28;

        st.psp = 90.0;

        st.batchname = "Sep-22-Intermediate";
    }

}
