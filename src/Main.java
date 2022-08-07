import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        median();
    }
    //9
    public static void median()
    {
        int a=0,b=0;
        int[]firstArray={5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[]secondArray={42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        a=firstArray[firstArray.length/2];
        b=secondArray[secondArray.length/2];
        System.out.println("the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is "+a);
        System.out.println("the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is "+b);
    }
    //8
    public static void evenNumber()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("how many integers? ");
        int n= sc.nextInt();
        int evenMax=0;
        int evenSum=0;
        for (int i=0;i<n;i++)
        {
            System.out.print("Number "+i+": ");
            int number=sc.nextInt();
            if(number%2==0)
            {
                evenSum+=number;
            }
            if(number%2==0)
            {
                if (evenMax<number)
                {
                    evenMax=number;
                }
            }
        }
        System.out.println("EvenMax: "+evenMax);
        System.out.println("EvenSum: "+evenSum);
    }
    //7
    public static void smartAndLargest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n= sc.nextInt();
        System.out.print("Number 1: ");
        int firstnum= sc.nextInt();
        int minNum=firstnum;
        int maxNum=firstnum;
        for (int i=2;i<=n;i++)
        {
            System.out.print("Number "+i+": ");
            int number= sc.nextInt();
            if(number<minNum) {
                minNum=number;
            } else if(number>maxNum)
            {
                maxNum=number;
            }
        }
        System.out.println("Smart number: "+minNum);
        System.out.println("largest number: "+maxNum);
    }
    // 5
    public static void reverseNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number: ");
        int number= sc.nextInt();
        int number2=number;
        int reverseNumber=0;
        while (number!=0)
        {
            int n=number%10;
            reverseNumber=reverseNumber*10+n;
            number/=10;
        }
        System.out.println("Reverse number of "+number2+" is "+reverseNumber);
    }
    //4
    public static void sumOfNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number: ");
        int number= sc.nextInt();
        int sum=0;
        while (number!=0)
        {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
    //3.1,3.2
    public static void  primeNumber()
    {
        Scanner sc= new Scanner(System.in);
        int i,m=0,j=0;
        System.out.print("Input number: ");
        int n= sc.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    j=1;
                    break;
                }
            }
            if(j==0)
            {
                System.out.println(n+" is prime number");
                System.out.print("prime submultiples of "+n+" : ");
                for (int a=1;a<10;a++)
                {
                    int k=a*n;
                    System.out.print(k+" ");
                }
            }
        }
        System.out.println();
    }

    //3.3
    public static void  primeNumber3()
    {
        int ct=0,n=0,i=1,j=1;
        System.out.print("the first 100 prime number: ");
        while(n<100)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.printf(i+" ");
                n++;
            }
            i++;
        }
    }
    //2
    public static void printArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input begin number: ");
        int a= sc.nextInt();
        System.out.print("Input finish number: ");
        int b= sc.nextInt();
        System.out.println();
        for(int i = a; i <= b; i++)
        {
            for(int j = i; j <= b; j++)
            {
                System.out.print(j);
            }
            for(int k = 0; k < i - a; k++)
            {
                System.out.print(a + k);
            }
            System.out.println();
        }
    }
    //1
    public static void number()
    {
        for (int j=0;j<5;j++) {
            for (int i = 9; i >= 0; i--) {
                System.out.print(i);
                System.out.print(i);
                System.out.print(i);
                System.out.print(i);
                System.out.print(i);
            }
            System.out.println();
        }
    }
}