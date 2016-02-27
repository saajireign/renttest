package com.pub.util;

import java.io.UnsupportedEncodingException;

import javax.servlet.ServletRequest;

public class ParameterTranslate {

	private static ParameterTranslate pt=null;
	private ParameterTranslate()
	{
		
	}
	public static ParameterTranslate newInstance()
	{
		if(pt==null)
			pt=new ParameterTranslate();
		return pt;
	}
	public Object getParamFromRequest(String key,ServletRequest arg0)
	{
		Object obj=null;
		if(arg0.getParameter(key)!=null)
		{
			obj=((String)arg0.getParameter(key).trim()).isEmpty()?null:arg0.getParameter(key);
			return obj;
		}
		return obj;
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
}
