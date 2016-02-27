package com.pub.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnector {
	private SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm");
	public String dataBase="java:/MSSQLDS";
	public String user="sa";
	public String passwd="33533025";
	private PreparedStatement ps=null;
	private StringBuffer sql=null;
	private Connection conn = null;
	public DBConnector() throws NamingException, SQLException
	{
		init();
	}
	public DBConnector(String driverName,String conname)
	{
		try {
			Class.forName(driverName);
			conn = (Connection) DriverManager.getConnection(conname,user,passwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   public void init() throws NamingException, SQLException
	{
		InitialContext ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup(dataBase);
		conn = ds.getConnection(user,passwd);
	}
   public PreparedStatement getPreparedStatment(String sql1) throws SQLException
   {
	   this.sql=new StringBuffer(sql1);
	  ps=conn.prepareStatement(sql1.toString());
	   return ps;
   }
   public void setInt(int index,Integer value) throws SQLException
   {
	   ps.setInt(index,value);
   }
   public void setDouble(int index,Double value) throws SQLException
   {
	   ps.setDouble(index,value);
   }
   public void setString(int index,String value) throws SQLException
   {
	   ps.setString(index,value);
   }
   public void setDate(int index,String value) throws SQLException, ParseException
   {
	   if(value!=null)
	   ps.setTimestamp(index,new Timestamp(matter.parse(value).getTime()));
	   else
		   ps.setTimestamp(index,null);
   }
   public ResultSet executeQuery() throws SQLException
   {
	  return ps.executeQuery();
   }
   public int executeUpdate() throws SQLException
   {
	   return ps.executeUpdate();
   }
   public ResultSet executeQuery(String sql1) throws SQLException
   {
	  ps=getPreparedStatment(sql1);
	   return executeQuery();
   }
   public ResultSet executeQuery(StringBuffer sql1,String[] findCases,String findCond[]) throws SQLException
   {
	   this.sql=sql1;
	   if(findCases!=null&&findCond!=null)
		  {
			  sql.append(" where "+"'0' "+"is not null ");
			  for(int i=0;i<findCases.length;i++)
			  {
				  if((i<=findCases.length-1)&&findCases[i]!=null&&findCond[i]!=null)
					{
						sql.append(" and ");
					}
				  if(findCases[i]==null||findCases[i].isEmpty()||findCond[i]==null||findCond[i].isEmpty())
				  {
					  continue;
				  }
				
				  sql.append(" "+findCases[i]+"="+findCond[i]+" ");
				
				  if(i==findCases.length-1)
				  {
					  break;
				  }
				 
//				  if ((findCases[i + 1] != null && !findCases[i + 1].isEmpty())
//							&& (findCond[i + 1] != null && !findCond[i + 1]
//									.isEmpty())) {
//						sql.append(" and ");
//					}
				 
			  }
		  }
	  System.out.println(sql);
	   return executeQuery(sql.toString());
   }
   public StringBuffer getExecuteSql(StringBuffer sql1,String[] findCases,String findCond[]){
	   if(findCases!=null&&findCond!=null)
		  {
			  sql1.append(" where "+"'0' "+"is not null ");
			  for(int i=0;i<findCases.length;i++)
			  {
				  if((i<=findCases.length-1)&&findCases[i]!=null&&findCond[i]!=null)
					{
						sql1.append(" and ");
					}
				  if(findCases[i]==null||findCases[i].isEmpty()||findCond[i]==null||findCond[i].isEmpty())
				  {
					  continue;
				  }
				
				  sql1.append(" "+findCases[i]+"="+findCond[i]+" ");
				
				  if(i==findCases.length-1)
				  {
					  break;
				  }
				 
			  }
		  }
	   return sql1;
   }
   public int update(String table_name,String[] setCases,String setCond[],String[] findCases,String [] findCond) throws SQLException
   {
	  sql=new StringBuffer();
	  sql.append("update "+table_name);
	  if(setCases!=null&&setCond!=null)
	  {
		  sql.append(" set ");
		  for(int i=0;i<setCases.length;i++)
		  {
			 
			  if(setCases[i]==null||setCases[i].isEmpty()||setCond[i]==null||setCond[i].isEmpty())
			  {
				  continue;
			  }
			  sql.append(" "+setCases[i]+"="+setCond[i]+", ");
		  }
	  }
	  else return -1;
	 sql=new StringBuffer(sql.substring(0,sql.lastIndexOf(",")));
	  if(findCases!=null&&findCond!=null)
	  {
		  sql.append(" where '0' is not null ");
		  
		  for(int i=0;i<findCases.length;i++)
		  {
			  if((i<=findCases.length-1)&&findCases[i]!=null&&!findCases[i].isEmpty()&&(findCond[i]!=null&&!findCond[i].isEmpty()))
			  {
				  sql.append(" and ");
			  }
			  if(findCases[i]==null||findCases[i].isEmpty()||findCond[i]==null||findCond[i].isEmpty())
			  {
				  continue;
			  }
			  sql.append(" "+findCases[i]+"="+findCond[i]+" ");
			  if(i==findCases.length-1)
			  {
				  break;
			  }
		  }
	  }
	  else return -1;
	  System.out.println(sql);
	  return executeUpdate(sql.toString());
   }
   public int executeUpdate(String sql) throws SQLException
   {
	   getPreparedStatment(sql);
	   return executeUpdate();
   }
   public void setSql(String sql)
   {
	   this.sql=new StringBuffer(sql);
   }
   public void closeAll() throws SQLException
   {
	   if((conn!=null)&&(!conn.isClosed()))
		{
					conn.close();
		}
//	   if(ps!=null&&!ps.isClosed()){
//		   ps.close();
//	   }
   }
   public int insert(String table_name,Map<String,Object> map) throws SQLException
   {
	   StringBuffer sqlOfValue=new StringBuffer();
	   sql=new StringBuffer();
	   if(map!=null)
	   {
		   Set entries=map.entrySet();
		   if(entries!=null)
		   {
			   sql.append("insert into "+table_name+"(");
			   sqlOfValue.append(") values(");
			   Iterator it=entries.iterator();
			   while(it.hasNext())
			   {
				   Map.Entry<String,Object> entry=(Entry<String, Object>) it.next();
				   if(entry.getKey()!=null)
				   {
					   if(entry.getValue()!=null)
					   { 
						   sql.append(entry.getKey()+",");
						   sqlOfValue.append("'"+String.valueOf(entry.getValue())+"',");
				 
					   }
			   
				   }
			   }
			   sql=new StringBuffer(sql.substring(0,sql.lastIndexOf(",")));
			   sqlOfValue=new StringBuffer(sqlOfValue.substring(0,sqlOfValue.lastIndexOf(",")));
			   sql.append(sqlOfValue);
			   sql.append(")");
		   }
		   else{
			   return -1;
		   }
	   }
	   else{
		   return -1;
	   }
	   System.out.println(sql);
	 return executeUpdate(sql.toString());
   }
   public StringBuffer getExecuteSql(String sql1,Map<String,Object> map)
   {
	   this.sql=new StringBuffer(sql1);
	   if(map!=null)
	   {
		   sql.append("where '0' is not null ");
		   Set entries=map.entrySet();
		   if(entries!=null)
		   {
			   Iterator it=entries.iterator();
			   while(it.hasNext())
			   {
				   Map.Entry<String,Object> entry=(Entry<String, Object>) it.next();
				   if(entry.getKey()!=null)
				   {
					   if(entry.getValue()!=null){
					   sql.append(" and "+entry.getKey()+"=");
					   sql.append("'"+String.valueOf(entry.getValue())+"' ");
				   
					   }
				   }
			   }
		   }
		 }
	   return sql;
   }
}
