import java.lang.reflect.Array;

public class Arrays {
    public static void main(String args[]){
    {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int i, x;

        String name = "david";
        String lastName = "taddese";
        String address = "address";

        StringBuilder demo1 = new StringBuilder("my data consists of - ");


        // concatentating and printing string together
        System.out.println(demo1.append(name + " " +  lastName +  " " + address));

        // iterating over an array
        for (i = 0; i < ar.length; i++) {

            // accessing each element of array
            x = ar[i];
            System.out.print(x + " ");
        }



    }
}
}
