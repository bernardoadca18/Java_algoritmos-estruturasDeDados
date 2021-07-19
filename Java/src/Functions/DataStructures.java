package Functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DataStructures 
{
    public static void main(String[] args) 
    {
        /*
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        
        List<Integer> arrList1 = new ArrayList<Integer>();
        List<Integer> arrList2 = new ArrayList<Integer>();
        List<Integer> arrList3 = new ArrayList<Integer>();
        List<Integer> arrList4 = new ArrayList<Integer>();
        List<Integer> arrList5 = new ArrayList<Integer>();
        List<Integer> arrList6 = new ArrayList<Integer>();

        arr.add(arrList1);
        arr.add(arrList2);
        arr.add(arrList3);
        arr.add(arrList4);
        arr.add(arrList5);
        arr.add(arrList6);
        */

        List<String> strings = new ArrayList<String>();
        List<String> queries = new ArrayList<String>();

        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        System.out.println(matchingStrings(strings, queries));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries)
    {
        List<Integer> amount = new ArrayList<Integer>(queries.size());

        for (int i = 0; i < queries.size(); i++) 
        {
            amount.add(0);
        }

        for (int i = 0; i < strings.size(); i++) 
        {
            for (int j = 0; j < queries.size(); j++) 
            {
                if(strings.get(i).equals(queries.get(j)))
                {
                    int temp = amount.get(j);
                    temp += 1;
                    amount.set(j, temp);
                }
            }
        }

        return amount;
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

    public static List<Integer> reverseArray(List<Integer> a) 
    {
        List<Integer> reverseArray = new ArrayList<Integer>();

        for(int i = a.size() - 1; i >= 0; i--)
        {
            reverseArray.add(a.get(i));
        }

        return reverseArray;
    }
}
