import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport{
	   private String empno;
	   private String name;
	   private int age;
	   private String email;
	   private String password;
	   private String rpassword;
	   
	   public String execute() 
	   {
	       return SUCCESS;
	   }
	   public String getEmpno() {
	       return empno;
	   }
	   public void setEmpno(String empno) {
	       this.empno = empno;
	   }
	   public String getName() {
	       return name;
	   }
	   public void setName(String name) {
	       this.name = name;
	   }
	   public int getAge() {
	       return age;
	   }
	   public void setAge(int age) {
	       this.age = age;
	   }
	   public String getEmail() {
	       return email;
	   }
	   public void setEmail(String email) {
	       this.email = email;
	   }
	   public String getPassword() {
	       return password;
	   }
	   public void setPassword(String password) {
	       this.password = password;
	   }
	   public String getRpassword() {
	       return rpassword;
	   }
	   public void setRpassword(String rpassword) {
	       this.rpassword = rpassword;
	   }	   
	   
	}