public class Counter {
	private String code;
	private Integer value;
	private Contact contact;

	public Counter()
	{
	}
	public void setCode(String code)
	{
		this.code=code;
	}
	public void setValue(Integer value)
	{
		this.value=value;
	}
	public void setContact(Contact contact)
	{
			this.contact=contact;
	}
	public String getCode()
	{
		return code;
	}
	public Integer getValue()
	{
		return value;
	}
	public Contact getContact(){
		return this.contact;
	}
}
