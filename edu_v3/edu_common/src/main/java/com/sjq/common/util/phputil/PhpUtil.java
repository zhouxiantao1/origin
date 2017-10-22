package com.sjq.common.util.phputil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import com.sjq.common.util.phputil.dto.QuestionContentDto;
import com.sjq.common.util.phputil.dto.QuestionOptionsDto;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * PHP序列化对象解析工具类
 * @author ZeJie.Zheng
 * @since 2017年7月12日
 * @version 1.0
 */
public class PhpUtil<T extends Object> {

    /**
     * php序列化字符串转List对象
     * @param phpSerializerStr
     * @return
     * @throws IllegalAccessException
     */
    public List<T> parseArrayObject(String phpSerializerStr) throws IllegalAccessException, UnsupportedEncodingException {
        ArrayList list = (ArrayList) PHPSerializer.unserialize(phpSerializerStr.getBytes("utf-8"));
        List<T> result = new ArrayList<>(list.size());
        for (Object obj : list) {
            Map map = (Map)obj;
            String json = JSON.toJSONString(map);
            T t = JSON.parseObject(json, new TypeReference<T>() {});
            result.add(t);
        }
        return result;
    }
    /**
     * 解析试题内容php序列化字符串
     * @param phpSerializerStr
     * @return
     * @throws IllegalAccessException
     */
    public static QuestionContentDto parsePhpToQuestionContent(String phpSerializerStr) throws UnsupportedEncodingException, IllegalAccessException {
       
    	Map<String,Object> map =  (Map<String, Object>) PHPSerializer.unserialize(phpSerializerStr.getBytes("utf-8"));
       
        String json = JSON.toJSONString(map);
        QuestionContentDto result = JSON.parseObject(json, QuestionContentDto.class);
        
        return result;
        
    }

    
    /**
     * 解析试题选项内容php序列化字符串
     * @param phpSerializerStr
     * @return
     * @throws IllegalAccessException
     */
    public static List<QuestionOptionsDto> parsePhpToQuestionOptions(String phpSerializerStr) throws UnsupportedEncodingException, IllegalAccessException {
        ArrayList list = (ArrayList) PHPSerializer.unserialize(phpSerializerStr.getBytes("utf-8"));
        List<QuestionOptionsDto> result = new ArrayList<>(list.size());

        for (Object obj : list) {
            Map map = (Map)obj;
            String json = JSON.toJSONString(map);
            QuestionOptionsDto t = JSON.parseObject(json, QuestionOptionsDto.class);
            result.add(t);
        }
        return result;
    }
    
    
    public static String parseQuestionOptionsToPhp(List<QuestionOptionsDto> qods) throws UnsupportedEncodingException{
    	
    	String json = JSON.toJSONString(qods);
        List<Map> map = JSON.parseArray(json, Map.class);
        byte[] bytes =PHPSerializer.serialize(map,"utf-8");
        return new String(bytes,"utf-8");
        
    }
    
    public static String parseQuestionContentToPhp(QuestionContentDto qc) throws UnsupportedEncodingException{
    	
    	String json = JSON.toJSONString(qc);
        Map map = JSON.parseObject(json, Map.class);
        byte[] bytes =PHPSerializer.serialize(map,"utf-8");
        return new String(bytes,"utf-8");
        
    }

    /**
     * php序列化字符串转对象
     * @param phpSerializerStr
     * @return
     * @throws IllegalAccessException
     */
    public T parseObject(String phpSerializerStr) throws IllegalAccessException, UnsupportedEncodingException {
        Map map = (Map) PHPSerializer.unserialize(phpSerializerStr.getBytes("utf-8"));
        String json = JSON.toJSONString(map);
        T obj = JSON.parseObject(json, new TypeReference<T>() {});
        return obj;
    }

    /**
     * 对象转php序列化字符串
     * @param obj
     * @return
     */
    public String toPhpSerializerStr(T obj) throws UnsupportedEncodingException {
        String json = JSON.toJSONString(obj);
        Map map = JSON.parseObject(json, Map.class);
        byte[] bytes =PHPSerializer.serialize(map,"utf-8");
        return new String(bytes,"utf-8");
    }

    /**
     * 对象转php序列化字符串
     * @param list
     * @return
     */
    public String toPhpSerializerStr(List<T> list) throws UnsupportedEncodingException {
        List<Map> result = new ArrayList<>();
        for (T t : list) {
            String json = JSON.toJSONString(t);
            Map map = JSON.parseObject(json, Map.class);
            result.add(map);
        }
        byte[] bytes =PHPSerializer.serialize(result,"utf-8");
        return new String(bytes,"utf-8");
    }
    
    
    public static void main(String[] args) throws UnsupportedEncodingException, IllegalAccessException{
    	
    	String json = "a:4:{i:0;a:2:{s:7:\"content\";s:110:\"123\";s:9:\"is_answer\";i:0;}i:1;a:2:{s:7:\"content\";s:110:\"234\";s:9:\"is_answer\";i:1;}i:2;a:2:{s:7:\"content\";s:110:\"456\";s:9:\"is_answer\";i:0;}i:3;a:2:{s:7:\"content\";s:110:\"123213\";s:9:\"is_answer\";i:0;}}";
    	
    	List<QuestionOptionsDto> qods = PhpUtil.parsePhpToQuestionOptions(json);
    	
    }


}
