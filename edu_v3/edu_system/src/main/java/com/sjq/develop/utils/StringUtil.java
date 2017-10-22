package com.sjq.develop.utils;

/**
 * 
 * 字段串工具类
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日上午9:54:12
 * @version 1.0
 */
public class StringUtil {

	/**
	 * 字段名转换成JAVA对象名称
	 * 例如user_name ==> userName
	 * @param name 被转换对象
	 * @return     转换后JAVA对象名称
	 */
	public static String toUpperCaseName(String name){
		
		if(name==null || name.length()==0 || name.equals("")){
			return "";
		}
		
		String lowerName = "";
    	String[] n = name.split("_");
    	for(int i=0;i<n.length;i++){
    		lowerName+=n[i].substring(0,1).toUpperCase()+n[i].substring(1,n[i].length());
    	}
    	
    	return lowerName;
	}
	
	/**
	 * 字段名转换成JAVA对象名称
	 * 例如user_name ==> UserName
	 * @param name 被转换对象
	 * @return     转换后JAVA对象名称
	 */
	public static String toLowerCaseName(String name){
		
		if(name==null || name.length()==0 || name.equals("")){
			return "";
		}
    	
    	String upperName = "";
    	String[] n = name.split("_");
    	for(int i=0;i<n.length;i++){
    		if(i!=0){
    			upperName+=n[i].substring(0,1).toUpperCase()+n[i].substring(1,n[i].length());
    		}else{
    			upperName+=n[i];
    		}
    	}
    	
    	return upperName;
	}
	
	/**
	 * 字段类型转换成JDBC类型
	 * @param type  被转换类型 
	 * @return      转换后JDBCTYPE名称
	 */
	public static String toCaseJdbcType(String type){
		
		String caseType = "";
		
		if(type.equals("bigint")){
			caseType="BIGINT";
		}else if(type.equals("text")){
			caseType="VARCHAR";
		}else if(type.equals("decimal")){
			caseType="DECIMAL";
		}else if(type.equals("enum")){
			caseType="CHAR";
		}else if(type.equals("varchar")){
			caseType="VARCHAR";
		}else if(type.equals("datetime")){
			caseType="TIMESTAMP";
		}else{
			caseType="Cannot convert!";   //无法转换
		}
    	
    	return caseType;
	}
	
	
	/**
	 * 字段类型转换成Bean对象类型
	 * @param type  被转换类型 
	 * @return      转换后beanType名称
	 */
	public static String toCaseBeanType(String type){
		
		String caseType = "";
		
		if(type.equals("bigint")){
			caseType="Long";
		}else if(type.equals("text")){
			caseType="String";
		}else if(type.equals("decimal")){
			caseType="BigDecimal";
		}else if(type.equals("enum")){
			caseType="String";
		}else if(type.equals("varchar")){
			caseType="String";
		}else if(type.equals("datetime")){
			caseType="Date";
		}else{
			caseType="Cannot convert!";   //无法转换
		}
    	
    	return caseType;
	}
	
	
}
