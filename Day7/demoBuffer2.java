import java.util.Scanner;
import java.io.*;
class demoBuffer2
{
   public static void main(String asd[]) throws Exception
	{
   	   File f=new File("sample2.txt");
	   DataOutputStream dout=new DataOutputStream(new FileOutputStream(f));
	   dout.writeInt(12);
	   dout.writeBoolean(true);
	   dout.writeDouble(23.43);
	   dout.close();
 
	   DataInputStream din=new DataInputStream(new FileInputStream(f));
   	   System.out.println(din.readInt());	   
	   System.out.println(din.readBoolean());	   
           System.out.println(din.readDouble());  
	}
}