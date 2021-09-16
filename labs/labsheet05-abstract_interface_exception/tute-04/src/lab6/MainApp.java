package lab6;

public class MainApp {
    public static void main(String args[]){

        //tablet objects
        Tablet t1 = new Tablet("T1","TabletOne", 5000,10,"Samsung","A7","30PX");
        Tablet t2 = new Tablet("T2","TableTwo", 7000,5,"Apple","X11","50PX");

        //vegetable objects
        Vegetables v1 = new Vegetables("V1","Carrot", 20, 500,true,200);
        Vegetables v2 = new Vegetables("V2","Beans", 25, 600,false,300);

        IPrint array[] = new IPrint[4];
        array[0] = t1;
        array[1] = t2;
        array[2] = v1;
        array[3] = v2;

        for (int i = 0; i < 4; i++){
            array[i].printDetails();
            System.out.println("====================");
        }


    }
}
