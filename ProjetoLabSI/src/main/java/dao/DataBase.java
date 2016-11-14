package dao;

import java.sql.Connection;

public class DataBase 
{	
	private static DataBase instance = new DataBase();
	
	private Connection con;
	
	private DataBase()
	{
		
	}
	
	public static DataBase getInstance()
	{
		return instance;
	}
	
	public Connection getConnection()
	{
		return con;
	}
	
	public void connect() throws Exception
	{
		if(con != null)
			return;
		try
		{
			Class.forName("com.postgresql.jdbc.Driver");
		}catch(ClassNotFoundException e)
		{	
			throw new Exception("Driver not found");
		}
		
		String url = String.format("jdbc:postgresql://localhost:%/paterns", 5432);
	}
}
