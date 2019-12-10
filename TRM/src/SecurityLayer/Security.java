package SecurityLayer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import controller.AtosEmpData;
import controller.AtosEmpMapper;

public class Security {
	
	JdbcTemplate temp;
	
	public Security()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("ok");
		temp = (JdbcTemplate)context.getBean("jtemp");
	}
	public List<AtosEmpData> getAllTrainingRequest(){
		
		List<AtosEmpData> tr = temp.query("select * from TrainingRequest",new AtosEmpMapper());
		return tr;
	}
	/*public List<AtosEmpData> getAllTrainingRequest()
	{
		List<AtosEmpData> tr=temp.query("select * from EmployeeTable",new AtosEmpData());
		return tr;
	}
	
	public int deleteEmployeeTable(int request_id)
	{
		int ret = temp.update("delete from trainingrequest where request_id=?)", 
				new Object[] {request_id});
		return ret;
	}
	public int editTrainingRequestSave(AtosEmpData obj)
	{
		int ret = temp.update("update trainingrequest set request_technology=?,request_date=?,"
				+ "approx_participants=?,training_location=?,training_type=?)", 
				new Object[] {});
		return ret;
	}
	
	
	
	//public int saveNewTrainingRequest(String pm_name,String vertical,String tech,String date,int appar,String location,String type)
	//{
	//System.out.println("PM: "+ pm_name);
	//System.out.println("Vertical: "+ vertical);
	//System.out.println("Technology: "+ tech);
	//System.out.println("Date: "+ date);
	//System.out.println("part no: "+ appar);
	//System.out.println("Location: "+ location);
	//System.out.println("type: "+ type);
	
	int ret = temp.update("insert into TrainingRequest values(reqidgen.nextval,?,?,?,?,?,?,?)", 
			new Object[] {pm_name,tech,date,vertical,appar,location,type});
	return ret;
	
	}
	*/
	public boolean isUserValid(String username, String userpassword)
	{
		
		List list=temp.queryForList("select * from Employee where email= ? and password= ?",
				new Object[] {username,userpassword});
		System.out.println(list.size());
		
		if(list.size()==1)
				return true;
		else
				return false;
	}

}

