package com.pub.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SqlStringOption {

	private static SqlStringOption sqlStringOption=null;
	private SqlStringOption()
	{
		
	}
	public static SqlStringOption newInstance()
	{
		if(sqlStringOption==null)
		{
			sqlStringOption=new SqlStringOption();
		}
		return sqlStringOption;
	}
	 public StringBuffer getExecuteSql(String sql1,Map<String,Object> map)
	   {
		 StringBuffer sql=null;
		   sql=new StringBuffer(sql1);
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
}
