public class ChildC extends Parent {


    String whoIam= "Child C";

    public ChildC(String whoIam) {
        this.whoIam = whoIam;
    }

    public ChildC() {
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
        return "";
    }
}


