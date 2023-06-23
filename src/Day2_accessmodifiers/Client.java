package Day2_accessmodifiers;

public class Client {

    public static void main(String[] args) {

        Student st = new Student();
        //st.name = "nitesh ";  // Compile time error
        st.age = 28;
        st.psp = 90;
        st.batchname = "sep_22_intermediate";

    }
}
