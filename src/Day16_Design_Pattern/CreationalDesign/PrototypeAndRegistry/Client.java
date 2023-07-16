package Day16_Design_Pattern.CreationalDesign.PrototypeAndRegistry;

public class Client {

    public static void fillRegistry(StudentRegistry registry){

        Student sep22 = new Student();
        sep22.setBatchName("sep22");
        sep22.setAvgBatchPsp(80);
        registry.register("sep_22",sep22);
    }

    public static void main(String[] args) {

        StudentRegistry registry = StudentRegistry.getRegisteryInstance();
        fillRegistry(registry);

        Student s1 = registry.get("sep_22").clone();
        s1.setAge(19);
        s1.setName("nitesh");
        s1.setRoll_no(01);
        s1.setGender("M");




        System.out.println(s1.getAvgBatchPsp());
        System.out.println(s1.getBatchName());


    }

}
