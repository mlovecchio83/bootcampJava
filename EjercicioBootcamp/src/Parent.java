public class Parent {

    String nombre = "Parent";


    public Parent() {
        nombre = "Parent";
    }

    public String getWhoIam() {
        return nombre;
    }

    public void setWhoIam(String nombre) {
        this.nombre = nombre;
    }

    public String  whoIam(){
        return "I am "+ nombre;
    }

}
