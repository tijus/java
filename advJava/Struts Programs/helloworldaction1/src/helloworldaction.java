import com.opensymphony.xwork2.ActionSupport;
public class helloworldaction {
	private String name;

	   public String execute() throws Exception {
	      if ("webuser".equals(name))
	      {
	         return success;
	      }else{
	         return error;
	      }
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
