public class ChildA extends Parent{

    String whoIam= "Child A";

    public ChildA(String whoIam) {
        this.whoIam = whoIam;
    }

    public ChildA() {
        this.whoIam = whoIam;
    }


    public String getWhoIam() {
        return whoIam;
    }


    public void setWhoIam(String whoIam) {
        this.whoIam = whoIam;
    }

    public String  whoIam(){
        return "I am "+ whoIam;
    }

}
