public class Main {

    public static void main(String[] args){

        Parent p = new Parent();
        Parent ChildA = new ChildA();
        Parent ChildB = new ChildB();
        Parent ChildC = new ChildC();

        String [] arreglo = new String[4];

        arreglo[0]=p.whoIam();
        arreglo[1]=ChildA.whoIam();
        arreglo[2]=ChildB.whoIam();
        arreglo[3]=ChildC.whoIam();


        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);

    }

    /*public void testWhoIAm(){
        System.out.println("Parent "+;
        System.out.println("Child A "+ChildA.);
        System.out.println("Child B "+ ChildB.whoIam());
        System.out.println("Child C"+ChildC.whoIam());
    }*/

}

}
