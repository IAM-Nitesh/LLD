package Day16_Design_Pattern.CreationalDesign.PrototypeAndRegistry2;

public class Client {

    public static void fillRegistry(StudentRegistry registry){

        // Created a prototype object for parent
        Student student = new Student();
        student.setBatchName("sep_22");
        student.setAvgBatchPsp(80);

        // Created a prototype object for child
        IntelligentStudent iS = new IntelligentStudent();
        iS.setBatchName("nov_22");
        iS.setAvgBatchPsp(90);

        // registering the prototype object in registry
        registry.register("Student",student);
        registry.register("IntelligentStudent",iS);

    }

    public static void main(String[] args) {

        // One object of singleton class registry is to be created
        StudentRegistry registry = StudentRegistry.getRegisteryInstance();
        fillRegistry(registry);

        // cloning from prototype and giving values to simple attributes
        Student s1 = registry.get("Student").clone();
        s1.setAge(19);
        s1.setName("nitesh");
        s1.setRoll_no(01);
        s1.setGender("M");

        Student s2 = registry.get("IntelligentStudent").clone();
        s2.setAge(19);
        s2.setName("nitesh kumar");
        s2.setRoll_no(01);
        s2.setGender("M");

        System.out.println("DEBUG");


    }

}


/*

    Agenda : Create a clone of an object having few same attributes and rest are unique to an object

    Parent class -> Student
    1) Create a student class with all attributes as private, having getter and setter

    Interface -> Prototype
    2) Create an interface with an abstract method clone for every class to implement

    Parent class -> Student
    3) make the class of whose object we want to create a copy to implement this interface
    4) add implementation to the clone method of the student class by
        a) create a copy object (stcopy) of class student
        b) copy the common attribute of this object to the stcopy object by using setter method of common attribute
        c) make clone method return the copy object

    Registry class -> Register ( Make as singleton so that no two objects can be created)
    5) Create a Hashmap<String,ClassObject>
    6) Create a setter method for writing into hashmap like Register<Key,Value> return void
    7) Create a getter method for reading the key like get<String key> -> return class object

    Client Class-> Client
    8) Create a prototype object in the registry at the application laoding time by :
         a) Create a static FillRegistry method : public static void FillRegistry (Register register)
         b) create a prototype object of student
            Student student = new Student();
         c) set the common attributes of the prototype
            student.setBatchName("sep_22");
            student.setAvgBatchPsp(80);
         d) save the prototype object to the registry by using the appropriate key
            registry.register("Student",student);

    9) inside public static void main()->
       a) create an object of the registry
          StudentRegistry registry = StudentRegistry.getRegisteryInstance();

       b) call the above fillregistry method with register object
        fillRegistry(registry);

      c) Proceed with normal object creation of the parent/child class and call on the registry method to copy
      from the prototype

              Student s1 = registry.get("Student").clone();
      d) continue with the setting up of simple and unique attributes
        s1.setAge(19);
        s1.setName("nitesh");
        s1.setRoll_no(01);
        s1.setGender("M");

 */