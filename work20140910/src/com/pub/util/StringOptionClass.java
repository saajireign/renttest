package com.pub.util;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StringOptionClass {
	private SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm");
	private static StringOptionClass stringOptionClass=null;
	private StringOptionClass()
	{
		
	}
	public static StringOptionClass newInstance()
	{
		if(stringOptionClass==null)
		{
			stringOptionClass=new StringOptionClass();
		}
		return stringOptionClass;
	}
	public SimpleDateFormat getDateFormat()
	{
		return matter;
	}
	public String[] splitSlices(String slice,String style){
		System.out.println("slice="+slice);
		String[] slices=slice.split(style);
		for(int i=0;i<slices.length;i++)
		{
			if(!slices[i].trim().isEmpty())
			{
				slices[i]=slices[i].substring(0,slices[i].length()-1);
			}
			
		}
		
		return slices;
	}
	public Map<String,String> splitCommaAndEqual(String mps)
	{
		Map<String,String> style=new HashMap<String,String>(); 
		String [] originalequal=mps.split(",");
		for(int i=0;i<originalequal.length;i++)
		{
			String[] key_value=originalequal[i].trim().split("=");
			style.put(key_value[0],key_value[1]);
		}
		return style;
	}
	public Boolean isMarked(String op) {
		if (op.trim().length() == 1) {
			Character c = op.charAt(0);
			switch (c) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '(':
			case ')':
				return true;
			default:
				return false;
			}
		}
		return false;
	}
	public Boolean isNumber(String num)
	{
		return num.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}
	public String integerToString(Integer totrans)
	{
		if(totrans==null)
			return null;
		else
			return totrans+"";
	}
	public String isoToGb2312(String totranslate)
	{
		byte[] b;
		try {
				b = totranslate.getBytes("ISO-8859-1");
				totranslate=new String(b,"gb2312");
				System.out.println(totranslate);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totranslate;
	}
	public String getYearFromDateTime(String datetime){
		SimpleDateFormat yearmater=new SimpleDateFormat("yyyy");
		try {
			return yearmater.format(matter.parse(datetime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String getYearMonthFromDateTime(String datetime){
		SimpleDateFormat yearmonth=new SimpleDateFormat("yyyy-mm");
		try {
			return yearmonth.format(matter.parse(datetime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String getMonthFromDateTime(String datetime){
		String year_month=getYearMonthFromDateTime(datetime);
		String[] ym=datetime.split("\\-");
		System.out.println(datetime+":"+year_month+":  "+ym[0]+","+ym[1]);
		return ym[1];
	}
	public String mapToFormatString(Map<String,Object> map){
		  StringBuffer sql=null;
		   if(map!=null)
		   {
			  sql= new StringBuffer();
			   Set entries=map.entrySet();
			   if(entries!=null)
			   {
				   Iterator it=entries.iterator();
				   while(it.hasNext())
				   {
					   Map.Entry<String,Object> entry=(Entry<String, Object>) it.next();
					   if(entry.getKey()!=null)
					   {
						   if(entry.getValue()!=null)
						   { 
							   sql.append(entry.getKey()+"="+entry.getValue().toString().trim()+",");
					 
						   }
				   
					   }
				   }
			   }
		   }
		   return sql.toString().replace('-','#');
	}
	public String transfercolontocomma(String originalstyle){
		if(originalstyle==null){
			return "(0)";
		}
		StringBuffer currentstyle=new StringBuffer("(");
		String[] colons=originalstyle.split(":");
		for(int i=0;i<colons.length;i++){
			if(colons[i].trim().isEmpty()){
				continue;
			}
			currentstyle.append(colons[i].trim()+",");
		}
		String style=currentstyle.toString().trim();
		currentstyle=new StringBuffer(style.substring(0,style.length()-1));
		currentstyle.append(")");
		System.out.println(currentstyle);
		return currentstyle.toString();
	}
}
