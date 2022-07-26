package Phase1_Project;

import java.util.*;

public class Email_Validation {
		public static void main(String[] args) {
		        
		    ArrayList<String> emailID = new ArrayList<String>();
		        
	      emailID.add("abcdefgh@dfg.com");
	      emailID.add("wedfgg234@hg.com");
	      emailID.add("oiuyfvn98.wer@gfd.com");
	      emailID.add("qwerdv.sd@wsd.com");
          emailID.add("edchjqwxcf.3ddf@kk.com");
          emailID.add("wdfwefivj@kml.com");
          emailID.add("wdfgtfds.23scvfdx@asd.com");
		        
	   // new code
          String searchEmail = null;
          System.out.println("Enter your email ID to search:");
	         
          try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter email Id : ");
			searchEmail = input.nextLine(); 
		} 
          if(emailID.contains(searchEmail)){
	        System.out.println("email ID " + searchEmail + " found");
	      }
          else{
               System.out.println( "email ID " + searchEmail + " not found");
	  	    }
	}

}
