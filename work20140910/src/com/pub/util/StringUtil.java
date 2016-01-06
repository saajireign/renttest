package com.pub.util;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	public static String newID(Date date,Long size){
		StringBuffer id=new StringBuffer();
		id.append("h_");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String nowDate = format.format(date); 
		nowDate=nowDate.substring(5, 7);
//		Long size=super.count("select count(*) from StationMessage");
		id.append(nowDate);
		NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(4);
        //设置最小整数位数    
        nf.setMinimumIntegerDigits(4);
        id.append(nf.format(size));
        return id.toString();
	}
}
