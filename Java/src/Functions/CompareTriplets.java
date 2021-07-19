import java.util.*;

public class CompareTriplets 
{
    public static List<Integer> A = new ArrayList<Integer>();
    public static List<Integer> B = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        A.add(4);
        A.add(6);
        A.add(4);
        System.out.println(A.get(0) + " " + A.get(1) + " " + A.get(2));

        B.add(9);
        B.add(7);
        B.add(7);
        System.out.println(B.get(0) + " " + B.get(1) + " " + B.get(2));

        System.out.println(compareTriplets(A,B));
    }

    public static List<Integer> compareTriplets(List<Integer> A, List<Integer> B)
    {
        List<Integer> Points = new ArrayList<Integer>();
        Points.add(0);
        Points.add(0);
        int loopSize;
        
        if(A.size() >= B.size())
        {
            loopSize = A.size();
        }
        else
        {
            loopSize = B.size();
        }

        for(int i = 0; i < loopSize; i++)
        {
            if(A.get(i) > B.get(i))
            {
                Points.set(0, Points.get(0) + 1);
            }
            else if(A.get(i) < B.get(i))
            {
                Points.set(1, Points.get(1) + 1);
            }
        }

        return Points;
    }
}
