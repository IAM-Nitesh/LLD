package Day16_Design_Pattern.CreationalDesign.PrototypeAndRegistry2;

public class IntelligentStudent extends Student {

    private int IQ;

    public Student clone(){
        Student iSCopy = new IntelligentStudent();
        iSCopy.setBatchName(this.getBatchName());
        iSCopy.setAvgBatchPsp(this.getAvgBatchPsp());
        return iSCopy;
    }

    public int getIQ(){
        return this.IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
}
