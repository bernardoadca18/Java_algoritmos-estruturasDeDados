package Functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataStructures 
{
    public static void main(String[] args) 
    {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        
        List<Integer> arrList1 = new ArrayList<Integer>();
        List<Integer> arrList2 = new ArrayList<Integer>();
        List<Integer> arrList3 = new ArrayList<Integer>();
        List<Integer> arrList4 = new ArrayList<Integer>();
        List<Integer> arrList5 = new ArrayList<Integer>();
        List<Integer> arrList6 = new ArrayList<Integer>();

        arrList1.add(-9);
        arrList1.add(-9);
        arrList1.add(-9);
        arrList1.add(1);
        arrList1.add(1);
        arrList1.add(1);

        arrList2.add(0);
        arrList2.add(-9);
        arrList2.add(0);
        arrList2.add(4);
        arrList2.add(3);
        arrList2.add(2);

        arrList3.add(-9);
        arrList3.add(-9);
        arrList3.add(-9);
        arrList3.add(1);
        arrList3.add(2);
        arrList3.add(3);

        arrList4.add(0);
        arrList4.add(0);
        arrList4.add(8);
        arrList4.add(6);
        arrList4.add(6);
        arrList4.add(0);

        arrList5.add(0);
        arrList5.add(0);
        arrList5.add(0);
        arrList5.add(-2);
        arrList5.add(0);
        arrList5.add(0);

        arrList6.add(0);
        arrList6.add(0);
        arrList6.add(1);
        arrList6.add(2);
        arrList6.add(4);
        arrList6.add(0);

        arr.add(arrList1);
        arr.add(arrList2);
        arr.add(arrList3);
        arr.add(arrList4);
        arr.add(arrList5);
        arr.add(arrList6);

        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(List<List<Integer>> arr)
    {
        List<Integer> sums = new ArrayList<Integer>();

        for (int i = 1; i < arr.size() - 1; i++) 
        {
            for (int j = 1; j < arr.size() - 1; j++) 
            {
                sums.add(arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j) + arr.get(i - 1).get(j + 1) + arr.get(i).get(j) + arr.get(i + 1).get(j - 1) + arr.get(i + 1).get(j)+ arr.get(i + 1).get(j + 1));
            }
        }

        return Collections.max(sums);
    }

    public List<Integer> reverseArray(List<Integer> a) 
    {
        List<Integer> reverseArray = new ArrayList<Integer>();

        for(int i = a.size() - 1; i >= 0; i--)
        {
            reverseArray.add(a.get(i));
        }

        return reverseArray;
    }
}
