import java.util.Scanner;

class CpfNumbers
{    
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String cpf;

        System.out.println("Insira os 9 primeiros números do CPF");

        cpf = sc.nextLine();

        System.out.println("CPF: "+cpf+"-"+getNumbers(cpf)[0]+getNumbers(cpf)[1]);
        sc.close();
    }

    
    private static int[] getInput(String Nums)
    {    
        int[] arr = new int[Nums.length()];

        for(int i=0; i < arr.length; i++)
        {
            arr[i] = Nums.charAt(i) - '0';
        }

        return arr;
    }
    
    private static int[] getNumbers(String Nums)
    {
        int[] n = getInput(Nums);
        int[] n2 = new int[9];
        int j = 11;

        //First Number
        for(int i = 0; i < n2.length; i++)
        {
            j--;
            n2[i] = n[i] * j;
        }

        int k = 0;

        for(int i = 0; i < n2.length; i++)
        {
            k += n2[i];
        }

        int n3[] = new int[2];

        if((k % 11) == 0 || (k % 11) == 1)
        {
            n3[0] = 0;
        }
        else
        {
            n3[0] = (11 - k % 11);
        }


        //Second Number
        k = 0;
        j = 11;
        int n5[] = new int[10];

        for(int i = 0; i < n5.length - 1; i++)
        {
            n5[i] = n[i] * j;
            j--;
        }

        n5[n5.length - 1] = n3[0] * 2;

        for(int i = 0; i < n5.length; i++)
        {
            k += n5[i];
        }

        if((k % 11) == 0 || (k % 11) == 1)
        {
            n3[1] = 0;
        }
        else
        {
            n3[1] = (11 - k % 11);
        }
        
        return n3;
    }
}