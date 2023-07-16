package Day16_Design_Pattern.CreationalDesign.PrototypeAndRegistry2;

public class Student implements Prototype<Student> {

    private String name;

    private int roll_no ;

    private int age;

    private String gender;

    private int avgBatchPsp;

    private String batchName;

    Student(){}


    @Override
    public Student clone() {
        Student studentcopy = new Student();
        studentcopy.avgBatchPsp = this.avgBatchPsp;
        studentcopy.batchName = this.batchName;
        return studentcopy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(int avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
