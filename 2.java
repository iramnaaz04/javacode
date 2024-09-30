
ASSIGNMENT 2
SET A
Q1.
class employee
{
   private static int id;
   private static String name,dept;
   private static float salary;

private static int count=0;
employee()
{
id=0;
salary=0;
}
employee(int id,String name,String dept,float salary)
{
 this.id=id;
 this.name=name;
 this.dept=dept;
 this.salary=salary;
count++;
}
public static void display()
{
 System.out.println("Employee ID="+id);
 System.out.println("Name="+name);
 System.out.println("Department="+dept);
 System.out.println("Salary="+salary);
}
public static void displayCount()
{
 System.out.println("\nCount of objects created:"+count);
}
}
class SetA1
{
public static void main(String args[])
{
employee e1=new employee(101,"Jason","Computer Science",35000);
e1.display();
employee e2=new employee(102,"Sam","English",28000);
e2.display();
employee.displayCount();
}
}

OUTPUT
Employee ID=101
Name=Jason
Department=Computer Science
Salary=35000.0
Employee ID=102
Name=Sam
Department=English
Salary=28000.0
Count of objects created:2

Q.2. Define Student class(roll_no,name,percentage)*/
import java.util.*;  
class student
{
   int roll_no;
   String name;
   float perc;
student(int r,String nm,float p)
{
 roll_no=r;
 name=nm;
 perc=p;
}
static void sortstudents(student[] s,int n)
{
 int i,j;
 student temp;
 for(i=0;i<n;i++)
{
   for(j=i+1;j<n;j++)
  {
     if(s[i].perc>s[j].perc)
      {
          temp=s[i];
          s[i]=s[j];
          s[j]=temp;
      }
   }
}
for(i=0;i<n;i++)
{
 System.out.println(s[i].roll_no+"\t"+s[i].name+"\t"+s[i].perc);
}
}
}
class SetA2
{
public static void main(String args[])
{
int r,i;
String nm;
float p;
Scanner sc=new Scanner (System.in);

System.out.println("How many Students ?");
int n=sc.nextInt();
student[] s= new student[n];
for(i=0;i<n;i++)
{
  System.out.println("Enter Roll Number:");
  r=sc.nextInt();
  System.out.println("Enter  Name:");
  nm=sc.next();
  System.out.println("Enter Percentage:");
  p=sc.nextFloat();
  s[i]= new student(r,nm,p);
}

System.out.println("Sorted Student Data on the Basis of Percentage:");
System.out.println("Roll No\tName\tPercentage");
student.sortstudents(s,n);
}
}
OUPUT
How many Students ?
3
Enter Roll Number:
21
Enter  Name:
nayla
Enter  Percentage:
87.9
Enter Roll Number:
22
Enter  Name:
aiman
Enter Percentage:
87.6
Enter Roll Number:
23
Enter  Name:
sawleha
Enter  Percentage:
78.9
Sorted Student Data on the Basis of Percentage:
Roll No	Name	Percentage
23	sawleha	78.9
22	aiman	          87.6
21	nayla	          87.9

Q3 Write a java program to accept 5 number using command line arguments sort and display them

public class A2SetA3
{
 public static void main(String args[])
 {
  int[]num=new int[5];
  for (int i=0;i<5;i++)
  {
   num[i]=Integer.parseInt(args[i]);
  }
 
for(int i=0;i<5;i++)
{
 for(int j=i+1;j<5;j++)
 {
  if (num[i]>num[j]);
  {
   int temp=num[i];
   num[i]=num[j];
   num[j]=temp;
  }
 }
}

System.out.println("Number after sorting:");
for (int i=0;i<5;i++)
{
 System.out.print(num[i]+"\t");
}
}
}

OUTPUT

java A2SetA3 10 9 8 7 6
Number after sorting:
6	7	8	9	10	

Q4
import java.util.*;
public class A2A4
{
public static void main(String args[])
{
String fname,lname,mname;
Scanner sc=new Scanner(System.in);
System.out.println("Enter name as fristname middlename lastname:");
fname=sc.next();
mname=sc.next();
lname=sc.next();
String mname_new=mname.substring(0,1).toUpperCase()+mname.substring(1);
System.out.println("Your name is:");
System.out.print(lname+" "+fname+" "+mname_new);
}
}
OUTPUT
Enter name as firstname middlename lastname:
sarah suhel momin
Your name is:
momin sarah Suhel



SET B
Q1
SY---SYMarks.java
package SY;
 import java.io.*;
public class SYMarks
{
public int ct,mt,et;
public void get() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Total Marks out of 100 in SY for Computer,Maths and Electronics respectively");
ct=Integer.parseInt(br.readLine());
mt=Integer.parseInt(br.readLine());
et=Integer.parseInt(br.readLine());
}
}
TY---TYMarks.java
package TY;
 import java.io.*;
public class TYMarks
{
public int tht,prt;
public void get() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Total Marks out of 400 in TY for Thoery");
tht=Integer.parseInt(br.readLine());
System.out.println("Enter Total Marks out of 150 in TY for Practical");
prt=Integer.parseInt(br.readLine());
}
}
SetB1.java
import TY.*;
import SY.*;
import java.io.*;

class Students
{
int rno;
String name,grade;
public float gt,tyt,syt;
public float per;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

public void get() throws IOException
{
System.out.println("Enter Roll Number:");
rno=Integer.parseInt(br.readLine());

System.out.println("Enter name:");
name=br.readLine();
}
}

public class SetB1
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("How many studens?:");
int n=Integer.parseInt(br.readLine());

SYMarks sy[]=new SYMarks[n];
TYMarks ty[]=new TYMarks[n];
Students s[]=new Students[n];

for(int i=0;i<n;i++)
{
s[i]=new Students();
sy[i]=new SYMarks();
ty[i]=new TYMarks();

s[i].get();
sy[i].get();
ty[i].get();

s[i].syt=sy[i].ct+sy[i].mt+sy[i].et;
s[i].tyt=ty[i].tht+ty[i].prt;

s[i].gt=s[i].syt+s[i].tyt;
s[i].per=(s[i].gt/850)*100;
if(s[i].per>=70)
 s[i].grade="A";
else if(s[i].per>=60)
 s[i].grade="B";
else if(s[i].per>=50)
 s[i].grade="C";
else if(s[i].per>=40)
 s[i].grade="Pass";
else
  s[i].grade="Fail";
}
System.out.println("Roll no\tName\tSYTotal\tTYTotal\tGrandTotal\tPercentage\tGrade");
for(int i=0;i<n;i++)
System.out.println(s[i].rno+"\t"+s[i].name+"\t"+s[i].syt+"\t"+s[i].tyt+"\t"+s[i].gt+"\t\t"+s[i].per+"\t"+s[i].grade);
}
}
OUPUT
How many studens?:
2
Enter Roll Number:
1
Enter name:
sarah
Enter Total Marks out of 100 in SY for Computer,Maths and Electronics respectively
99
99
99
Enter Total Marks out of 400 in TY for Thoery
399
Enter Total Marks out of 150 in TY for Practical
149
Enter Roll Number:
2
Enter name:
tehzeeb
Enter Total Marks out of 100 in SY for Computer,Maths and Electronics respectively
50
50
50
Enter Total Marks out of 400 in TY for Thoery
200
Enter Total Marks out of 150 in TY for Practical
75
RollnoName	SYTotal	TYTotal	GrandTotal	Percentage	Grade
1         sarah	297.0	 	 548.0		845.0 		99.41176	A
2       tehzeeb  150.0		275.0		425.0		50.0		C
