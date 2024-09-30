ASSIGNMENT 3
SET A

Q1.
import java.io.*;
class Continent
{
  String con;
  BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
  void con_input() throws IOException
  {
        System.out.println("Enter Continent Name:");
        con=r.readLine();
  }
}

class Country extends Continent
{
      String cou;
      void cou_input() throws IOException
      {
            System.out.println("Enter Country Name:");
            cou=r.readLine();
      }
}

class State extends Country
{
      String sta;
      void sta_input() throws IOException
      {
            System.out.println("Enter State Name:");
            sta=r.readLine();
      }
}

public class A3SA1 extends State
{
      String place;
      void pla_input() throws IOException
      {
            System.out.println("Enter Place Name:");
            place=r.readLine();
      }
       public static void main( String args[] )throws IOException
       {
              A3SA1 s= new  A3SA1();
	      s.con_input();
              s.cou_input();
              s.sta_input();
	      s.pla_input();
	      System.out.println("\n\nContinent: "+s.con);
	      System.out.println("Country: "+s.cou);
	      System.out.println("State: "+s.sta);
	      System.out.println("Place: "+s.place);
}
}

OUTPUT:
Enter Continent Name:
Asia
Enter Country Name:
India
Enter State Name:
Maharashtra
Enter Place Name:
Pune

Continent:Asia
Country: India
State: Maharashtra
Place: Pune

Q2.
import java.util.*;

abstract class Staff
{
  protected int id;
  protected String name;
  Staff(int n,String nm)
  {
    id=n;
    name=nm;
   }
}

class OfficeStaff extends Staff
{
  String department;
   OfficeStaff(int n,String nm,String d)
  {
    super(n,nm);
    department=d;
   }
   public void display()
   {
     System.out.println("Staff id: "+id);
     System.out.println("Staff name: "+name);
     System.out.println("Department: "+department+"\n");
    }
}
 
class A3SA2
{
  public static void main(String args[])
  {
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter how many staff : ");
     n=sc.nextInt();
     OfficeStaff[] os=new OfficeStaff[n];
     for(i=0;i<n;i++)
     {
       System.out.println("Enter id: ");
       int id=sc.nextInt();
       System.out.println("Enter name: ");
       String nm=sc.next();
       System.out.println("Enter department: ");
       String dept=sc.next();
       os[i]=new OfficeStaff(id,nm,dept);
     }
      System.out.println("***** Staff Details *****");
      for(i=0;i<n;i++)   
       os[i].display();
     }
}

OUTPUT:
Enter how many staff :
3
Enter id:
1
Enter name:
Alsafa       
Enter department:
Cs
Enter id:
2
Enter name:
Madiha
Enter department:
Evs
Enter id:
3
Enter name:
Madina
Enter department:
Urdu      
***** Staff Details *****
Staff id: 1
Staff name: Alsafa
Department: Cs

Staff id: 2
Staff name: Madiha
Department: Evs

Staff id: 3
Staff name: Madina
Department: Urdu

Q3.
interface operation
{
  public abstract void area();
  public abstract void volume();
  final double PI = 3.142;
}

class Cylinder implements operation
{
   int r,h;
   Cylinder(int r, int h)
   {
     this.r=r;
     this.h=h;
    }
    public void area()
    {
      double area=(2*PI*r*h)+(2*PI*r*r);
      System.out.println("\n Area of Cylinder = "+area);
    }

    public void volume()
    {
      double vol=PI*r*r*h;
      System.out.println("Volume of Cylinder = "+vol);
     }
}

class A3SA3
{
  public static void main(String args[])
  {
    Cylinder c=new Cylinder(5,8);
    c.area();
    c.volume();
  }
}

OUTPUT: Area of Cylinder = 408.46
Volume of Cylinder = 628.4

					SET B
Q1.
import java.io.*;
abstract class Order
{
  String id,description;
}

class PurchaseOrder extends Order
{
  String Customername,Vendorname;
  public void accept() throws IOException
  {
   System.out.println("\n Purchase Order ");
   System.out.println("Enter the id,description,names of customers and vendors: ");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   id=br.readLine();
   description=br.readLine();
   Customername=br.readLine();
   Vendorname=br.readLine();
   }

public void display()
{
 System.out.println("id: "+id);
 System.out.println("Description: "+description);
 System.out.println("Customername: "+Customername);
 System.out.println("Vendorname: "+Vendorname);
 System.out.println("---------");
 }
}

class SalesOrder extends Order
{
  String Customername,Vendorname;
  public void accept() throws IOException
  {
   System.out.println("\n Sales Order ");
   System.out.println("Enter the id,description,names of customers and vendors: ");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   id=br.readLine();
   description=br.readLine();
   Customername=br.readLine();
   Vendorname=br.readLine();
   }
public void display()
{
 System.out.println("id: "+id);
 System.out.println("Description: "+description);
 System.out.println("Customername: "+Customername);
 System.out.println("Vendorname: "+Vendorname);
 System.out.println("---------");
 }
}

public class A3SB1
{
  public static void main(String[]args) throws IOException
  {
   int i;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   PurchaseOrder [] l=new PurchaseOrder[3];
   for(i=0;i<3;i++)
   {
     l[i]=new  PurchaseOrder();
     l[i].accept();
}

   SalesOrder [] h=new SalesOrder[3];
   for(i=0;i<3;i++)
   {
     h[i]=new  SalesOrder();
     h[i].accept();
}
  System.out.println("******Details of sales and Purchase order*******");
  for(i=0;i<3;i++)
   l[i].display();
  for(i=0;i<3;i++)
   h[i].display();
}
}

OUTPUT:
Purchase Order
Enter the id,description,names of customers and vendors:
1  
purchases of laptop
aaliya
vijay sales

 Purchase Order
Enter the id,description,names of customers and vendors:
2
purchases of projectors
saniya
SS electronics

 Purchase Order
Enter the id,description,names of customers and vendors:
3
purchases of CPU
zahraa
ajay sales

 Sales Order
Enter the id,description,names of customers and vendors:
1
sales of TV
safa
vijay sales

 Sales Order
Enter the id,description,names of customers and vendors:
2
sales of microwave
sofia
ajay sales

 Sales Order
Enter the id,description,names of customers and vendors:
3
sales of washing machine
zara
LG
******** Details of Sales and Purchase order ********
ID: 1
Description: purchases of laptop
Customer Name: aaliya
Vendor Name: vijay sales
-------------------------------
ID: 2
Description: purchases of projectors
Customer Name: saniya
Vendor Name: SS electronics
-------------------------------
ID: 3
Description: purchases of CPU
Customer Name: zahraa
Vendor Name: ajay sales
-------------------------------
ID: 1
Description: sales of TV
Customer Name: safa
Vendor Name: vijay sales
-------------------------------
ID: 2
Description: sales of microwave
Customer Name: sofia
Vendor Name: ajay sales
-------------------------------
ID: 3
Description: sales of washing machine
Customer Name: zara
Vendor Name: LG
-------------------------------







