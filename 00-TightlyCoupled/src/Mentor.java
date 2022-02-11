public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor ftm, PartTimeMentor ptm){
        this.fullTimeMentor = ftm;
        this.partTimeMentor = ptm;
    }
    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}
