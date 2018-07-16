public class Emptemp
{
	protected int empno;
	protected String ename;
	protected int sal;
	protected String job;
	protected int deptno;
	protected int age;

	public Emptemp()
	{
	}
	public Emptemp(int empno,String ename,int sal,String job,int deptno,int age)
	{
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
		this.job=job;
		this.deptno=deptno;
		this.age=age;
	}
	public void setEmpno(int empno)
	{
		this.empno=empno;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public void setJob(String job)
		{
			this.job=job;
	}
	public void setDeptno(int deptno)
		{
			this.deptno=deptno;
	}
	public void setAge(int age)
		{
			this.age=age;
	}

	public int getEmpno()
	{
		return empno;
	}
	public String getEname()
	{
		return ename;
	}
	public int getSal()
	{
		return sal;
	}
	public String getJob()
		{
			return job;
	}
	public int getDeptno()
		{
			return deptno;
	}
	public int getAge()
		{
			return age;
	}
	public String toString()
	{
		return empno+"\t"+ename+"\t"+sal+"\t"+job+"\t"+deptno+"\t"+age;
	}
}