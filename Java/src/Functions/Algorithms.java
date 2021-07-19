package Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms 
{
    public String dayOfProgrammer(int year)
    {
        int day = 13;

        if(!(year%4 == 0) && (year < 1918 || year%100 == 0 || !(year%400 == 0)))
        {
            day--;
        }

        if(year == 1918)
        {
            day = 26;
        }
        
        return day + "." + "09." + year;
    }

    public int migratoryBirds(List<Integer> arr) 
    {
        List<Integer> types = new ArrayList<Integer>();
        int biggestFromArr = Collections.max(arr);

        types.add(0);

        for(int i = 0; i < biggestFromArr; i++)
        {
            types.add(1);
        }
        
        for(int i = 0; i < arr.size(); i++)
        {
            int temp = types.get(arr.get(i));
            temp++;
            types.set(arr.get(i), temp);
        }
        
        int biggest = 0;
        int index = 0;
        
        for(int i = 0; i < types.size(); i++)
        {
            if(types.get(i) > biggest)
            {
                biggest = types.get(i);
                index = i;
            }
        }

        return index;
    }

    public int divisibleSumPairs(int n, int k, List<Integer> ar)
    {
        int pairs = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(j != i)
                {
                    if((ar.get(i) + ar.get(j)) % k == 0)
                    {
                        pairs++;
                    }
                }
                
            }
        }
        return pairs/2;
    }

    public List<Integer> breakingRecords(List<Integer> scores)
    {
        int min = scores.get(0);
        int max = scores.get(0);
        int brokeMin = 0;
        int brokeMax = 0;

        for(int i = 0; i < scores.size(); i++)
        {
            if(scores.get(i) > max)
            {
                max = scores.get(i);
                brokeMax += 1;
            }
            if(scores.get(i) < min)
            {
                min = scores.get(i);
                brokeMin += 1;
            }
        }

        List<Integer> returnValues = new ArrayList<Integer>();
        returnValues.add(brokeMax);
        returnValues.add(brokeMin);

        return returnValues;
    }

    public String kangaroo(int x1, int v1, int x2, int v2)
    {
        String returnType = "NO";
        boolean canReach = v1 > v2;

        if(canReach)
        {
            if((x1 - x2) % (v1 - v2) == 0)
            {
                returnType = "YES";
            } 
            else
            {
                returnType = "NO";
            }
        }

        return returnType;
    }

    public void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges)
    {
        int appleAmount = 0;
        int orangeAmount = 0;

        for(int i = 0; i < apples.size(); i++)
        {
            if((apples.get(i) >= s - a) && (apples.get(i) <= t - a))
            {
                appleAmount++;
            }
            if((oranges.get(i) <= t - b) && (oranges.get(i) >= s - b))
            {
                orangeAmount++;
            }
        }
        System.out.println(appleAmount);
        System.out.println(orangeAmount);
    }

    public List<Integer> gradingStudents(List<Integer> grades)
    {
        for(int i = 0; i < grades.size(); i++)
        {
            if(grades.get(i) > 37)
            {
                if((grades.get(i) + 2) % 5 == 0)
                {
                    int newI = grades.get(i) + 2;
                    grades.remove(grades.get(i));
                    grades.add(i, newI);
                }
                else if((grades.get(i) + 1) % 5 == 0)
                {
                    int newI = grades.get(i) + 1;
                    grades.remove(grades.get(i));
                    grades.add(i, newI);
                }
            }
        }
        return grades;
    }

    public String timeConversion(String s)
    {
        char[] time = s.toCharArray();
        String hours = new String();
        for(int i = 0; i < 2; i++)
        {
            hours += time[i];
        }
        
        if(time[time.length - 2] == 'A')
        {
            if(hours.equals("12"))
            {
                time[0] = '0';
                time[1] = '0';
            }
        }
        else
        {
            if(hours.equals("01"))
            {
                time[0] = '1';
                time[1] = '3';
            }
            else if(hours.equals("02"))
            {
                time[0] = '1';
                time[1] = '4';
            }
            else if(hours.equals("03"))
            {
                time[0] = '1';
                time[1] = '5';
            }
            else if(hours.equals("04"))
            {
                time[0] = '1';
                time[1] = '6';
            }
            else if(hours.equals("05"))
            {
                time[0] = '1';
                time[1] = '7';
            }
            else if(hours.equals("06"))
            {
                time[0] = '1';
                time[1] = '8';
            }
            else if(hours.equals("07"))
            {
                time[0] = '1';
                time[1] = '9';
            }
            else if(hours.equals("08"))
            {
                time[0] = '2';
                time[1] = '0';
            }
            else if(hours.equals("09"))
            {
                time[0] = '2';
                time[1] = '1';
            }
            else if(hours.equals("10"))
            {
                time[0] = '2';
                time[1] = '2';
            }
            else if(hours.equals("11"))
            {
                time[0] = '2';
                time[1] = '3';
            }
        }

        char[] newTime = new char[time.length - 2];
        for(int i = 0; i < time.length - 2; i++)
        {
            newTime[i] = time[i];
        }

        String newString = String.valueOf(newTime);
        return newString;
    }

    public void staircase(int n)
    {
        char space[] = new char[n];
        Arrays.fill(space, ' ');

        for(int i = 1; i <= n; i++)
        {
            space[n - i] = '#';
            System.out.println(space);
        }
    }

    public void findSums(List<Integer> arr)
    {
        int[] sortedArray = new int[arr.size()];
        long maxSum = 0;
        long minSum = 0;
        for(int i = 0; i < sortedArray.length; i++)
        {
            sortedArray[i] = arr.get(i);
        }
        Arrays.sort(sortedArray);
        for(int i = 0; i < sortedArray.length - 1; i++)
        {
            minSum += sortedArray[i];
        }
        for(int i = sortedArray.length - 1; i >= 0; i--)
        {
            maxSum += sortedArray[i];
        }
        System.out.println(minSum + " " + maxSum);
    }

    public int birthdayCakeCandles(List<Integer> candles) 
    {
        int tallestCandlesAmount = 0;
        int[] sortedCandles = new int[candles.size()];

        for(int i = 0; i < sortedCandles.length; i++)
        {
            sortedCandles[i] = candles.get(i);
        }

        Arrays.sort(sortedCandles);

        for(int i = sortedCandles.length - 1; i >= 0; i--)
        {
            if(sortedCandles[i] == sortedCandles[sortedCandles.length - 1])
            {
                tallestCandlesAmount++;
            }
        }
        return tallestCandlesAmount;
    }
}
