ASSIGNMENT 1

Q1.Write a program to calculate perimeter and area of rectangle.
 public class SetA1
{
public static void main(String args[])
{
int length=Integer.parseInt(args[0]);
int breadth=Integer.parseInt(args[1]);
float area=length*breadth;
int perimeter=2*(length+breadth);
System.out.println("\n Area of a rectangle= "+area);
System.out.println("Perimeter of a rectangle= "+perimeter);
}
}

Output:
20 15
 Area of a rectangle= 300.0
Perimeter of a rectangle= 70

Q2Write a program to find factorial of given number.
public class SetA2
{
public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
int fact=1;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of number "+num+" is: "+fact);
}
}

Output:
5
Factorial of number 5 is: 120



Q3.Write a program to accept the array element and display in reverse order
import java.util.Scanner;
public class SetA3{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);

//Accepting number of element//
 System.out.println("Enter number of elements: ");
 int n=sc.nextInt();
 int[] nums=new int[n];

//Accepting Array element//
System.out.println("Enter elements: ");
for(int i=0;i<n;i++)
{
nums[i]=sc.nextInt();
}

//Printing arrays element in reverse order//
System.out.println("Array elements in reverse order : ");
for(int i = n-1;i>=0;i--)
{
 System.out.println(nums[i]);
}
sc.close();
}
}

Output:
Enter number of elements:
5
Enter elements:
1
2
3
4
5
Array elements in reverse order :
5
4
3
2   
1


Q4.Write a program to accept the array element and display sum of array elements
import java.util.Scanner;
public class SetA4{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);

//Accepting number of element//
 System.out.println("Enter number of elements: ");
 int n=sc.nextInt();
 int[] nums=new int[n];

//Accepting Array element//
System.out.println("Enter elements: ");
for(int i=0;i<n;i++)
{
nums[i]=sc.nextInt();
}

//calculating sum of array elements
int sum=0;
for (int i=0;i < n;i++)
{
sum=sum+nums[i];
}
System.out.println("Sums of array elements: "+sum);
 sc.close();
}
}

Output:
Enter number of elements:
3
Enter elements:
1
2
3
Sums of array elements: 6









SET B:
Q1.
import java.util.Date;
import java.text.SimpleDateFormat;
class SetB1
{
public static void main(String[] args)
{
Date d=new Date(); //Creates a new date object initialized with the current date and time.

SimpleDateFormat d1=new SimpleDateFormat("dd/MM/yyyy");
System.out.println("Current Date is : "+d1.format(d));

SimpleDateFormat d2=new SimpleDateFormat("MM-dd-yyyy");
System.out.println("Current Date is : "+d2.format(d));

SimpleDateFormat d3=new SimpleDateFormat("EEEE MMMM dd yyyy");
System.out.println("Current Date is : "+d3.format(d));

System.out.println("Current Date is : "+d);

SimpleDateFormat d4=new SimpleDateFormat("MM/dd/yy HH:mm:ss a Z");
System.out.println("Current Date is : "+d4.format(d));

SimpleDateFormat d5=new SimpleDateFormat("HH:mm:ss");
System.out.println("Current Time is : "+d5.format(d));

SimpleDateFormat d6=new SimpleDateFormat("w");
System.out.println("Current week of year : "+d6.format(d));

SimpleDateFormat d7=new SimpleDateFormat("W");
System.out.println("Current week of month : "+d7.format(d));

SimpleDateFormat d8=new SimpleDateFormat("D");
System.out.println("Current day of the year : "+d8.format(d));
}
}
Output:
Current Date is : 02/08/2024
Current Date is : 08-02-2024
Current Date is : Friday August 02 2024
Current Date is : Fri Aug 02 15:55:48 IST 2024
Current Date is : 08/02/24 15:55:48 PM +0530
Current Time is : 15:55:48
Current week of year : 31
Current week of month : 1
Current day of the year : 215

Q2.
class MyNumber
{
  private int n;

/**
* declaring default constructor
**/
MyNumber()
{
n=0;
}

/** Constructor to initialize number to value
* @param num is integer used to set class variable n*
**/

MyNumber(int num)
{
 this.n=num;
}

/**
* Method to check number negative or not
*/

public void isNegative()
{
 if(n<0)
  System.out.println("Number is Negative");
 else
  System.out.println("Number is not Negative");
}

/**
*Method to check number positive or not
*
**/

 void isPositive()
{
if(n>0)
System.out.println("Number is Positive");
 else
  System.out.println("Number is not Positive");
}

/**
*Method to check number zero or not
**/

void isZero()
{
if(n==0)
System.out.println("Number is Zero");
 else
  System.out.println("Number is not Zero");
}

/**
*Method to check number even or not
*
**/

void isEven()
{
if(n%2==0)
System.out.println("Number is Even");
 else
  System.out.println("Number is not Even");
}

/**
*Method to check number odd or not
*
**/

void isOdd()
{
if(n%2!=0)
System.out.println("Number is Odd");
 else
  System.out.println("Number is not Odd");
}
}

public class SetB2
{
 public static void main(String args[])
{
 int num=Integer.parseInt(args[0]);
MyNumber m=new MyNumber(num);
m.isNegative();
m.isPositive();
m.isZero();
m.isEven();
m.isOdd();
}
}
Output:
8
Number is not Negative
Number is Positive
Number is not Zero
Number is Even
Number is not Odd

JAVA DOC javadoc -d doc SetB2.java

Q3.Write a program for addition of two matrix.

import java.util.Scanner;

public class SetB3
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner (System.in);
  int rows, cols;
  
  System.out.println("Enter Number of Rows: ");
  rows=sc.nextInt();
  
  System.out.println("Enter Number of Cols: ");
  cols=sc.nextInt();
  
  int[][] mat1=new int[rows][cols];
  int[][] mat2=new int[rows][cols];
  int[][] res=new int[rows][cols];
  
   System.out.println("Enter Elements for Matrix 1: ");
   for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          mat1[i][j]=sc.nextInt();
 }
}
System.out.println("Enter Elements for Matrix 2: ");
   for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          mat2[i][j]=sc.nextInt();
}
}

for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          res[i][j]= mat1[i][j] + mat2[i][j];
}
}
System.out.println("Matrix 1: ");
   for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          System.out.print(mat1[i][j] + " ");
         }
          System.out.println("");
}

System.out.println("Matrix 2: ");
   for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          System.out.print(mat2[i][j] + " ");
         }
          System.out.println("");
}
System.out.println("Addition of matrix 1 and 2: ");
   for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          System.out.print(res[i][j] + " ");
         }
          System.out.println("");
}
}
}
Output:
Enter Number of Rows:
3
Enter Number of Cols:
3  
Enter Elements for Matrix 1:
1 2 3
4 5 6
7 8 9
Enter Elements for Matrix 2:
1 1 1
1 1 1
1 1 1
Matrix 1:
1 2 3
4 5 6
7 8 9
Matrix 2:
1 1 1
1 1 1
1 1 1
Addition of matrix 1 and 2:
2 3 4
5 6 7
8 9 10

Q4.
import java.util.Scanner;

public class SetB4
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner (System.in);
  int rows, cols;
  
  System.out.println("Enter Number of Rows: ");
  rows=sc.nextInt();
  
  System.out.println("Enter Number of Cols: ");
  cols=sc.nextInt();
  
  int[][] mat1=new int[rows][cols];
  int[][] Transpose=new int[rows][cols];

System.out.println("Enter Elements for Matrix : ");
   for(int i=0; i<rows; i++)
   {
       for(int j=0; j<cols; j++)
        {
          mat1[i][j]=sc.nextInt();
 }
}
System.out.println("Matrix : ");
   for(int i=0; i<rows; i++)
   { 
for(int j=0; j<cols; j++)
        {
          System.out.print(mat1[i][j] + " ");
         }
          System.out.println("");
}
System.out.println("Transpose: ");
   for(int i=0; i<cols; i++)
   {
       for(int j=0; j<rows; j++)
        {
          System.out.print(mat1[j][i] + " ");
         }
          System.out.println("");
}
}
}
Output: Enter Number of Rows:
3
Enter Number of Cols:
3
Enter Elements for Matrix :
1 2 3
4 5 6
7 8 9
Matrix :
1 2 3
4 5 6
7 8 9
Transpose:
1 4 7
2 5 8
3 6 9


Example2:
Enter Number of Rows:
2
Enter Number of Cols:
3
Enter Elements for Matrix :
1 2 3
4 5 6
Matrix :
1 2 3
4 5 6
Transpose:
1 4
2 5
3 6
