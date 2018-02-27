import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        //ArrayList
        ArrayList<String> names = new ArrayList<String>();

        //add name
        int k = 1;
       for (int i=0; i < k; i++ ) {
            System.out.println("Do you want to add a name? 1 = yes, 2 = no");
            int answer = in.nextInt();
            if(answer == 2){
                    k = 0;
            } else {
                System.out.println("Enter name");
                String addName = in.next();
                names.add(addName);
                k++;
            }
        }
            System.out.println("new size: " + names.size());
        // Access and print out the Objects
        for ( int j=0; j<names.size(); j++ )
            System.out.println("Student" + j + ": " + names.get(j) );
    }
}
