public class ChildB extends Parent{

    String whoIam= "Child B";

    public ChildB(String whoIam) {
        this.whoIam = whoIam;
    }

    public ChildB() {
        this.whoIam = whoIam;
    }

    @Override
    public String getWhoIam() {
        return whoIam;
    }

    @Override
    public void setWhoIam(String whoIam) {
        this.whoIam = whoIam;
    }

    public String  whoIam(){
        return "I am "+ whoIam;
    }

}
