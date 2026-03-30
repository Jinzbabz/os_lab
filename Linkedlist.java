import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element " + (i+1) + ":");
            list.add(sc.nextInt());
        }
        System.out.println("Orginal List: " + list);
        list.clear();
        System.out.println("List after removing all elememts: " +list);
        sc.close();
    }
}

