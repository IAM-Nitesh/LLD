package Day16_Design_Pattern.CreationalDesign.Builder;

public class Client {

    public static void main(String[] args) {
/*
        V1 Client Code : ->

        Builder builder = new Builder();
        builder.setName("Nitesh");
        builder.setAge(27);
        builder.setBatch(2023);
        builder.setId(1);
        Student s = new Student(builder);

        Cons :
        I. two object ( builder and class ) were created in version one which ran builder code perfectly

        Issues with V1:
        I. Bad readability and objects have to created separately for Builder and Student class
        II. if we have builder class anyone can create object in client like Student s = new Student(null);
        III. Separate Builder and Student Class

     Agenda_1 : To Increased Readability :-

     I. get rid of Builder builder = new builder () -> by making builder's constructor as private.
     II. Create a getBuilder method in builder class to create and return a builder's object for client.
     III. Make getBuilder as static - why static - so that we can create object at the compile time for builder class
          by classname.method_name instead of creating by new keyword

      V2 Code :
        Builder builder = Builder.getBuilder() // Create a static public getBuilder method to call instead of creating new Builder()
        builder.setName("Nitesh");
        builder.setAge(27);
        builder.setBatch(2023);
        builder.setId(1);
        Student s = new Student(builder);

     III. inside Builder class change all return datatype of setters as the Builder Class object and return this from the setter;
     (All the setter needs to return the builder object to achieve readability)
        Builder.getBuilder() -> its returning an object of Builder and
        a) all the setters were previously returning void so in order to implement good readability - we would like setters
            to return an object of builder as well.

       V3 Code :
       Builder builder = Builder.getBuilder()
                                .setName("Nitesh")
                                .setAge(27)
                                .setBatch(2021)
                                .setId(1);
        Student s = new Student(builder);

    Agenda_2 : Getting rid of creation of Student's object separately by writing a build method in builder class to create
    student's object

    IV : Create build method on top of builder object so that it returns student object directly
    V4 Code :
        Student s1 = Builder.getBuilder()
                .setName("Nitesh")
                .setAge(27)
                .setBatch(2021)
                .setId(1).build();

    Agenda_3 : No one should be able to create an object of student without using the builder

     I. No one should be able to call student constructor hence make it private
     II. Delete builder class - rather have it as inner class in Student class itself
     II. Make the inner Builder class of student class as Static as well for getBuilder()
     III. cut-and-paste public static Builder getBuilder from inside builder class to student class
     IV. Remove validations from student constructor to builder method

        Student s1 = Student.getBuilder()
                .setName("Nitesh")
                .setAge(27)
                .setBatch(2021)
                .setId(1).build();
        V. Builder class cannot be private as it is returning outside the class in client
*/

        Student student = Student.getBuilder()
                .setName("Nitesh")
                .setAge(27)
                .setBatch(2021)
                .setId(1).build();

        System.out.println("DEBUG");
    }

}
