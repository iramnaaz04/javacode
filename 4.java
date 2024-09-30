Assignment 4
Set A
Q1.
import java.util.*;

class Patient {
String name;
int age;
int oxylevel;
int HRCTreport;

Patient(String name, int age, int oxylevel, int HRCTreport) {
this.name=name;
this.age=age;
this.oxylevel=oxylevel;
this.HRCTreport=HRCTreport;
}
}

public class SetA1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("How many patients do you want to insert?");
int n=sc.nextInt();
Patient[] patients=new Patient[n];

for(int i=0;i<n;i++) {
System.out.println("Enter name:");
String name=sc.next();
System.out.println("Enter Age:");
int age=sc.nextInt();
System.out.println("Enter Oxygen level:");
int oxylevel=sc.nextInt();
System.out.println("Enter HRCT Report:");
int HRCTreport=sc.nextInt();
patients[i] = new Patient(name,age,oxylevel,HRCTreport);
}
for(int i=0;i<n;i++) {
try {
if (patients[i].oxylevel<95 && patients[i].HRCTreport>10) {
throw new Exception();
}
else
{
System.out.println("\nName:"+patients[i].name);
System.out.println("Age:"+patients[i].age);
System.out.println("Oxygen Level:"+patients[i].oxylevel);
System.out.println("HRCT Report:"+patients[i].HRCTreport);
System.out.println();
}
}
catch (Exception e) {
System.out.println("\nPatient is Covid Positive(+) and Needs to be Hospitalized");
}
}
}
}
O/P:
How many patients do you want to insert?
2
Enter name:
John
Enter Age:
45
Enter Oxygen level:
199
Enter HRCT Report:
5
Enter name:
Maria
Enter Age:
39
Enter Oxygen level:
198
Enter HRCT Report:
6

Name: John
Age: 45
Oxygen Level: 199
HRCT Report: 5


Name: Maria
Age: 39
Oxygen Level: 198
HRCT Report: 6

Q2.
import java.io.*;
import java.util.*;
class SetA2
{
public static void main(String args[]) throws IOException
{
FileReader f=new FileReader("sample.txt");
Scanner sc =new Scanner(f);
String word;
StringBuilder SB=new StringBuilder();
while(sc.hasNext())
{
word=sc.next();
word=word.toUpperCase();
SB.append(word + "");
}
System.out.println("Original String:");
System.out.println(SB);
System.out.println("String in Reverse Order:");
System.out.println(SB.reverse());
f.close();
}
}
CREATE  A NEW FILE NAMED AS SAMPLE.TXT & WRITE SOMTHING IN IT
O/P:
Original String:
HELLOTASKINJII
String in Reverse Order:
IIJNIKSATOLLEH

Q3.
import java.io.*;
import java.util.*;
public class SetA3
{
public static void main(String[] args) throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter source file name:\n");
String file1=sc.next();
System.out.print("Enter destination file name:\n");
String file2=sc.next();
FileReader fin=new FileReader(file1);
FileWriter fout=new FileWriter(file2, true);
int c;
while ((c=fin.read()) != -1)
{
fout.write(c);
}
fout.write("\nend of file");
System.out.println("Copy finish....");
fin.close();
fout.close();
}
}
CREATE ONE MORE FILE AS SAMPLE2.TXT
O/P:
Enter source file name:
sample.txt
Enter destination file name:
sample2.txt
Copy finish.…

SET B

Q1.
import java.io.*;
import java.util.*;

public class SetB1
{
public static void main(String args[]) throws IOException
{
String bname,line;
String [] words;
boolean flag=false;
Scanner sc=new Scanner(System.in);

File f=new File("book.dat");
FileReader fin=new FileReader(f);
BufferedReader br=new BufferedReader(fin);

System.out.println("Enter Book Name:");
bname=sc.nextLine();

while((line=br.readLine())!=null) {
words=line.split(",");
if (words[1].equalsIgnoreCase(bname))
{
System.out.println("Book found...");
flag=true;
}
}
if (flag==false)
{
System.out.println("Book Not found...");
}
}
}
CREATE A FILE book.dat WITH BOOK NAMES
O/P:
Enter Book Name:
Atomic Habbits
Book found…

Q2.
import java.util.*;

class EmailId {
String username, password;

EmailId() {
username="TYBCS";
password="root123";
}
EmailId(String user, String pass) {
this.username=user;
this.password=pass;
}
}

public class SetB2 {
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a user:");
String user=scanner.nextLine();
Scanner scanner1=new Scanner(System.in);
System.out.print("Enter a pass:");
String pass=scanner1.nextLine();

EmailId defaultEmail=new EmailId();
EmailId inputEmail=new EmailId(user,pass);

try{
if(!defaultEmail.username.equals(inputEmail.username)) {
throw new InvalidUsernameException(user);
}

if (!defaultEmail.password.equals(inputEmail.password)) {
throw new InvalidPasswordException(pass);
}
System.out.println("Valid Email id");
}

catch (InvalidUsernameException e) {
System.out.println(e);
}
catch (InvalidPasswordException e) {
System.out.println(e);
}
}
}

class InvalidUsernameException extends Exception {
InvalidUsernameException(String username) {
System.out.println("Invalid username:"+username);
}
}

class InvalidPasswordException extends Exception {
InvalidPasswordException(String password) {
System.out.println("Invalid password:"+password);
}
}
O/P:
Enter a user:TYBCS
Enter a pass:root123
Valid Email id

Enter a user:TYBCS
Enter a pass:abc@786
Invalid password:abc@786
InvalidPasswordException
