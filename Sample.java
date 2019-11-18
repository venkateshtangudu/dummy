

import java.io.*;
import java.util.Base64;

public class Sample {

   public static void main(String[] args) {
     
      int offset=0;
      int size=512*1024;
      try {
         
         
         File f=new File("30.zip");
         InputStream is = new FileInputStream(f);
         OutputStream os = new FileOutputStream("31.zip");
         //ByteArrayOutputStream buffer = new ByteArrayOutputStream();
         byte B[]=new byte[(int)f.length()];
        
         is.read(B);
         //String s = new String(B, "UTF-8");
         String s= new String(Base64.getEncoder().encode(B));
         
         //os.write(B);
         //System.out.print(s.length());
         System.out.print(s.getBytes().length);


         

      } catch (Exception ex) {
        

         ex.printStackTrace();
System.out.print("bvjhvjkjk");
      }
      
   }
}





/*while ((nRead = is.read(B, offset, size)) != -1 && offset != (int)f.length()) {
          offset=offset+size;
          System.out.print("offset: " + offset +"size :" +size +"\n");
          if((int)f.length()-offset < size){
               size=(int)f.length()-offset;
               System.out.print(size);
           }
                   
}*/





/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class Main
{
	public static void main(String[] args) {
		Date today = new Date("23-10-19 22:08:234 PST");
     
        //displaying this date on IST timezone
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);
     
        //dispalying date on PST timezone
        df.setTimeZone(TimeZone.getTimeZone("PST"));
        String PST = df.format(today);
        System.out.println("Date in PST Timezone : " + PST);
		
	}
}





No Title 
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Base64;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		byte[] decodedBytes = Base64.getDecoder().decode("TwBQAEUATgAgAEoATwBJAE4AVAAgAFMAVABPAEMASwAgAEMATwBNAFAAQQBOAFkAIABLAEgAQQBSAEsATwBWACAAUwBDAEkARQBOAEMARQAgAFIARQBTAEUAQQBSAEMASAAgAEEATgBEACAARABFAFMASQBHAE4AIABJAE4AUwBUAEkAVABVAFQARQAgAEUATgBFAFIARwBPAFAAUgBPAEUASwBUACAAfAAgAFIAVQBTAFMASQBBAC0ATAA0AA=");
		System.out.println(decodedBytes.toString().length());
	}
} 