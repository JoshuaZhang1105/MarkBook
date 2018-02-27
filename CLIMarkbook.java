import java.util.Scanner;
import java.util.*;
public class CLIMarkbook
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sList = new ArrayList<String>();
        ArrayList<Integer> mList = new ArrayList<Integer>();

        String fName, lName, addName, moveName;
        int sNum,gYear;
        double mark1, mark2;

        System.out.print( "What is your first name? " );
        fName = sc.nextLine();
        System.out.print( "What is your last name? " );
        lName = sc.nextLine();
        System.out.print( "What is your student number? " );
        sNum = sc.nextInt();
        System.out.print( "What is your graduated year? ");
        gYear = sc.nextInt();
        System.out.print("What is your first mark? ");
        mark1 = sc.nextDouble();
        System.out.print("What is your second mark? ");
        mark2 = sc.nextDouble();
        System.out.print("What student name do you want to add: ");
        addName = sc.next();
        System.out.print("What student name do you want to remove:  ");
        moveName = sc.next();
        for(int i = 0; i < sList.size(); i ++)
        {

            if(moveName.equals(moveName))
            {
                sList.remove(i);
                System.out.println(sList);

            }
            //eriSystem.out.print(sList);

        }
        for(String names: sList)
        {
            System.out.println(names);
        }

        double aveMark = (mark1+mark2)/2.0;
        System.out.print( aveMark );
    }


    public double average(double mark1,double mark2)
    {
        double aveMark = (mark1+mark2)/2.0;
        System.out.print( aveMark );
        return aveMark;
    }

    public boolean passwordChecker (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if(password.length() >= 9)
            {
                if(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }



}
