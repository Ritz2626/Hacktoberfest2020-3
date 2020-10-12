 import java.io.*;
public class frequency
 {
     public static void main(String[]args)throws IOException
     {
         InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(isr);
         System.out.println("Input a word");
         String a=br.readLine();
         String b=a.toUpperCase();
         int l=a.length();
         int count;
         for(char x='A';x<='Z';x++)
         {
             count=0;
             for(int j=0;j<l;j++)
             {
                 char c=b.charAt(j);
                 if(c==x)
                 {
                     count++;
                    }
                }
                
                if(count!=0)
                {
                    System.out.println("No. of occurence of"+x+"is"+count);
                }
            }
        }
    }
