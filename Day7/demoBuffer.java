import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
 
class demoBuffer
{
   public static void main(String asd[]) throws Exception
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter file name");
	   String filename=sc.nextLine();
	   FileOutputStream fout=new FileOutputStream(filename);
	   System.out.println("Enter content to add");
           String str=sc.nextLine();
	   byte bystr[]=str.getBytes();
	   fout.write(bystr);
	   fout.close(); 
	   BufferedInputStream bin=new BufferedInputStream(new FileInputStream("sample1.txt"));
           int i=0;
	    while((i=bin.read())!=-1)
		System.out.print((char)i);
	}
}
 