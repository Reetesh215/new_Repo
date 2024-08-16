package com.jtc.Reflection5;

public class Employee {
   private int eid;
   private String eName;
   private String email;
   private long phone;
   private boolean permanent;
   private Address empAdd;
   
   public Employee(int eid,String email,long phone,Address empAdd) {
	   this.eid=eid;
	   this.email=email;
	   this.phone=phone;
	   this.empAdd=empAdd;
   }
   
   public Employee(int eid,String eName,String email,long phone
		   ,boolean permanent,Address empAdd) {
	   this.eid=eid;
	   this.eName=eName;
	   this.email=email;
	   this.phone=phone;
	   this.permanent=permanent;
	   this.empAdd=empAdd;
   }

@Override
public String toString() {
	return "Employee [eid=" + eid + ", eName=" + eName + ", email=" + email + ", phone=" + phone + ", permanent="
			+ permanent + ", empAdd=" + empAdd + "]";
}
   
  }
