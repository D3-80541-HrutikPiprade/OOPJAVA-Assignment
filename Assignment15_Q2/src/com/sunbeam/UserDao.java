package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UserDao implements AutoCloseable {
	private Connection con ;
	private PreparedStatement  stmtInsert;
	private PreparedStatement stmtDisplayAll;
	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtDelete;
	private PreparedStatement stmtDisplayById;
	
	public UserDao() throws Exception {
		con = DbUtil.getConnection();
		
		String sql ="Insert into users values(Default,?,?,?,?,?,?,?)";
		stmtInsert = con.prepareStatement(sql);
		
		String sql2 ="select * from users";
		stmtDisplayAll = con.prepareStatement(sql2);
		
		String sql3 ="update users set first_name = ?, last_name=?, email=?, password=?, dob= ?, status = ?, role = ? Where id =?";
		stmtUpdate = con.prepareStatement(sql3);
		
		String sql4= "delete from users where id = ?";
		stmtDelete = con.prepareStatement(sql4);
		
		String sql5 = "select * from users where id=?";
		stmtDisplayById = con.prepareStatement(sql5);

	}

	@Override
	public void close() throws Exception {
		if(stmtDisplayById!=null)
			stmtDisplayById.close();
		if(stmtDelete!=null)
			stmtDelete.close();
		if(stmtUpdate!=null)
			stmtUpdate.close();
		if(stmtDisplayAll!=null)
			stmtDisplayAll.close();
		if(stmtInsert!=null)
			stmtInsert.close();
		if(con!=null)
			con.close();
	}
	
	
	public int insert(User u) throws SQLException {
		stmtInsert.setString(1, u.getFirst_name());
		stmtInsert.setString(2,u.getLast_name());
		stmtInsert.setString(3, u.getEmail());
		stmtInsert.setString(4, u.getPassword());
		
		java.sql.Date sDate = new java.sql.Date(u.getDob().getTime());
		stmtInsert.setDate(5, sDate);
		
		stmtInsert.setInt(6,u.getStatus());
		stmtInsert.setString(7, u.getRole());
		
		int count = stmtInsert.executeUpdate();
		return count;
	}
	
	public List<User> displayAll() throws Exception{
		List<User> list = new ArrayList<User>();
		try(ResultSet rs = stmtDisplayAll.executeQuery()){
			while(rs.next())
			{
				int id = rs.getInt("id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");

				java.sql.Date sDate = rs.getDate("dob");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
				String dob = sdf.format(sDate);
				java.util.Date uDate = sdf.parse(dob);
				
				int status = rs.getInt("status");
				String role = rs.getString("role");
				
				User u = new User(id,first_name,last_name,email,password,uDate,status,role);
				list.add(u);
			}
		}
		return list;
	}
	
	public int update(User u) throws Exception{
		stmtUpdate.setString(1, u.getFirst_name());
		stmtUpdate.setString(2,u.getLast_name());
		stmtUpdate.setString(3, u.getEmail());
		stmtUpdate.setString(4, u.getPassword());
		
		java.sql.Date sDate = new java.sql.Date(u.getDob().getTime());
		stmtUpdate.setDate(5, sDate);
		
		stmtUpdate.setInt(6,u.getStatus());
		stmtUpdate.setString(7, u.getRole());
		stmtUpdate.setInt(8, u.getId());
		int count = stmtUpdate.executeUpdate();
		return count;
	}
	
	public int delete(int id) throws Exception{
		stmtDelete.setInt(1, id);
		int count = stmtDelete.executeUpdate();
		return count;
	}
	
	public User find(int id) throws Exception{
		stmtDisplayById.setInt(1, id);
		try(ResultSet rs =stmtDisplayById.executeQuery() ){
			if(rs.next())
			{
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");

				java.sql.Date sDate = rs.getDate("dob");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
				String dob = sdf.format(sDate);
				java.util.Date uDate = sdf.parse(dob);
				
				int status = rs.getInt("status");
				String role = rs.getString("role");
				
				User u = new User(id,first_name,last_name,email,password,uDate,status,role);
				return u;
			}
		}
		return null;
	}
	
	
}
