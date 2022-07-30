package Phase1_Project;

import java.io.*;

public class File_exercise {
	
  void Filewrite() throws FileNotFoundException,IOException {
	  
	  DataInputStream dis=new DataInputStream(System.in);
	  FileOutputStream fos=new FileOutputStream("F:\\Mphasis\\New folder (2)\\ravi.txt",true);
	  BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
	  
	  System.out.println("Enter text (% at the end):"); 
      char ch; 

      while((ch=(char)dis.read())!='%') 
      { 
          bos.write(ch); 
      } 
      //close the file 
      bos.close(); 
  }
  
  void Fileread() throws IOException {
	//attach the file to FileInputStream 
      FileInputStream fin= new FileInputStream("F:\\Mphasis\\New folder (2)\\ravi.txt"); 

    
	  int ch; 
      while((ch=fin.read())!=-1) 
          System.out.print((char)ch); 
        
      //close the file 
      fin.close(); 
  }
  
  
	public static void main(String[] args) throws IOException {  //main method
		File_exercise fe= new File_exercise();
		try {
		fe.Filewrite();
		fe.Fileread();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
