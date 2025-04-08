package Association;

public class Account {
         private int accNo;
		 private String accType;
		 private String branch;
		 
		 public Account(int accNo, String accType, String branch) {
		  super();
		  this.accNo = accNo;
		  this.accType = accType;
		  this.branch = branch;
		 }

		    public void dispAccount() {
		     System.out.println(accNo+" "+accType+"  "+branch);
		    }
		 
		}

