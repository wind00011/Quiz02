package x1;

import java.io.*;
public class J2
{
   public static void main(String args[]) throws IOException
   {
      FileWriter fw=new FileWriter("c:\\Users\\CJCU-user\\rand.txt");
      BufferedWriter bfw=new BufferedWriter(fw);

      String str;
      int i,max,min,arr[]=new int[1000];
      long sum=0L;

      for(i=1;i<=1000;i++)
      {
         Double num=new Double(Math.random()*100000);
         str=Integer.toString(num.intValue());
         bfw.write(str);
         bfw.newLine();
      }
      bfw.flush();
      fw.close();

      
   }
}