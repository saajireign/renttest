package com.pub.util;


/**
 * ����ʽת������V1.0
 * @author Gaorui
 *����ַ�->�ַ��������ת�������Ż������У�Operator�д���������
 *objcts��Ŵ���Ĺ�ʽ�е�ѡ��
 *
 */
public class CalculatorDecipline {
	public static final int SIZE=40;
	private int j=0;
	StringBuffer calculator=null;
	StringBuffer objcts[]=new StringBuffer[SIZE];
	char operator[]=new char[SIZE];
	public CalculatorDecipline(StringBuffer calculator)
	{
		if(calculator!=null)
		{
			this.calculator=calculator;
			init();
		}
		
	}
	/**
	 * ��ʼ�����ഫ����ַ�
	 * 
	 */
	public void init()
	{	for(int i=0;i<calculator.length();i++)
		{
			char c = calculator.charAt(i);
			if(c=='+'||c=='-'||c=='*'||c=='/'||c=='('||c==')')
			{
					objcts[j++]=new StringBuffer(calculator.substring(0,i));
					StringBuffer calculatortemp=new StringBuffer(calculator.substring((i+1)));
					calculator=calculatortemp;
					operator[j++]=c;
					init();
					if(calculator.lastIndexOf("+")!=-1||calculator.lastIndexOf("-")!=-1||calculator.lastIndexOf("*")!=-1||calculator.lastIndexOf("/")!=-1||calculator.lastIndexOf("(")!=-1||calculator.lastIndexOf(")")!=-1)
					{
						break;
						
					}
			}
			
				
		}
		objcts[j]=calculator;
	}
	/**
	 * �����ַ�����㵥Ԫ
	 * 
	 * @return-stringbuffer������ַ���������
	 */
	public StringBuffer[] getObject()
	{
		if(objcts!=null)
		return objcts;
		return null;
	}
	/**
	 * 
	 * �����ַ��������
	 * @return
	 */
	public char[] getOperator()
	{
		if(operator!=null)
		return operator;
		return null;
	}
	/**
	 * 
	 * �����ַ��������ʽ
	 * @return
	 */
	public String getCalculator()
	{
		StringBuffer result=new StringBuffer();
		for(int j=0;j<SIZE;j++)
		{
			if(objcts[j]!=null)
				result.append(objcts[j]);
			result.append(operator[j]);
		}
		return result.toString();
	}
	public StringBuffer[] getEntity()
	{
		
		StringBuffer[] entity=new StringBuffer[objcts.length];
		int k=0;
		for(int j=0;j<objcts.length;j++)
		{
//			System.out.println(String.valueOf(operator[j]).trim().equals(""));
			if(objcts[j]!=null&&!objcts[j].toString().isEmpty())
				{
				entity[k]=objcts[j];
				System.out.println("entity["+(k)+"]="+entity[k]);
				k++;
				}
			else if(!String.valueOf(operator[j]).trim().isEmpty())
			{
				entity[k]=new StringBuffer(operator[j]+"");
//				System.out.println("operator["+j+"]="+operator[j]);
				System.out.println("entity["+(k)+"]="+entity[k]);
				k++;
			}
			else{
			}
			
		}
		return entity;
	}
}
