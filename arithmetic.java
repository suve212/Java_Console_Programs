import java.io.*;
class arithmetic
{
public static void main (String[] args)
{
try{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("ARTHIMETIC OPERATIONS");
 System.out.println("-----------------------");
 System.out.println("Enter the first no:");
 String s1 = br.readLine();
 int a = Integer.parseInt(s1);
 System.out.println("Enter the second no:");
 String s2=br.readLine();
 int b = Integer.parseInt(s2);
 System.out.println("RESULT");
 int x = a+b;
 System.out.println("ADD:" + x);
 int y = a-b;
 System.out.println("SUB:" + y);
 int z=a*b;
 System.out.println("MUL:"+z);
 int u=a/b;
 System.out.println("DIV:"+u);
 int g=a%b;
 System.out.println("MOD:"+g);
 }
catch(Exception e)
{
System.out.println("error:"+e.getMessage());
}
 }
}
