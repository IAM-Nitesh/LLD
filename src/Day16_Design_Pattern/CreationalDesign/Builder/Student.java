package Day16_Design_Pattern.CreationalDesign.Builder;

public class Student {

    private String Name;

    private int age;

    private double psp;

    private String universityName;

    private int batch;

    private long id;

    private int gradYear;

    private String phoneNumber;

    private Student(){ }    // no one should be able to call student constructor

    public static Builder getBuilder (){
        // Class builder has to be made static as method is static n creating an object of the builder class
        return new Builder();
    }

    // Builder is now an inner class
     static class Builder {

        private String Name;
        private int age;

        private double psp;

        private String universityName;

        private int batch;

        private long id;

        private int gradYear;

        private String phoneNumber;

        public String getName() {
            return Name;
        }

        public Builder setName(String name) {
            this.Name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getBatch() {
            return batch;
        }

        public Builder setBatch(int batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        private Builder(){}

        public Student build(){
            // validation start
            if (this.getBatch()>2022){
                throw new IllegalArgumentException("Invalid Grad year");
            }
            // validation ends

            Student st = new Student();
            st.Name = this.getName();
            st.age = this.getAge();
            st.batch = this.getBatch();
            st.phoneNumber = this.getPhoneNumber();
            st.psp = this.getPsp();
            st.id = this.getId();
            st.gradYear = this.getGradYear();
            st.universityName = this.getUniversityName();

            return st; // returns a student object
        }
    }

}
