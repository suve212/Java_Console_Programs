import java.io.*;
class student
{
public static void main (String[] args)
{
try
 {
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("TAKSHASHILA UNIVERSITY");
 System.out.println("-----------------------");
 System.out.println("Student Mark List");
 System.out.println("Enter the Enroll no:");
 String s1 = br.readLine();
 int a = Integer.parseInt(s1);
 System.out.println("Enter the Student name:");
 String s2=br.readLine();
 System.out.println("Enter the JAVA mark:");
 String s3 = br.readLine();
 int x = Integer.parseInt(s3);
 System.out.println("Enter the SE mark:");
 String s4 = br.readLine();
 int y = Integer.parseInt(s4);
 System.out.println("Enter the CN mark:");
 String s5= br.readLine();
 int z = Integer.parseInt(s5);
 System.out.println("RESULT");
 System.out.println("--------");
 int t = x+y+z;
 System.out.println("TOTAL:" + t);
 int v = t/3;
 System.out.println("AVERAGE:" + v);
}
catch(Exception e)
{
System.out.println("error:"+e.getMessage());
}
 }
}
