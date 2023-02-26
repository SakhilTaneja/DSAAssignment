package Newbie.Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static void Joshephus(ArrayList<Integer> n, int m, int index)
    {
        if (n.size() == 1) {
            System.out.println(n.get(0));
            return;
        }
        index = ((index + m) % n.size());
        n.remove(index);
        Joshephus(n, m, index);
    }

    public static void main(String[] args) {
        ArrayList<Integer> n= new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of persons");
        int num= s.nextInt();
        for(int i=1;i<=num;i++)
        {
            n.add(i);
        }
        System.out.println("Enter indexes");
        int m=s.nextInt();
        Joshephus(n,num,1);
    }
}
