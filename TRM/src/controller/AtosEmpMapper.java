package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AtosEmpMapper<T> implements RowMapper<AtosEmpData> {

	@Override
	public AtosEmpData mapRow(ResultSet result, int arg1) throws SQLException {

		AtosEmpData objEmp = new AtosEmpData();
		objEmp.setEMPLOYEE_ID(result.getInt(1));
		 objEmp.setEMP_NAME(result.getString(2));
		 objEmp.setEMPLOYEE_DESIGNATION(result.getString(3));
		 objEmp.setEMPLOYEE_VERTICAL(result.getString(4));
		 objEmp.setEMPLOYEE_EMAILID(result.getString(5));
		 objEmp.setEMPLOYEE_LOCATION(result.getString(6));
		 objEmp.setMANAGER_ID(result.getInt(7));
		 objEmp.setPASSWORD(result.getString(8));
		return  objEmp;
	}

}
