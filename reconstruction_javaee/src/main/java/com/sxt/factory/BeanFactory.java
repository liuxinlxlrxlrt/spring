package com.sxt.factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanFactory {

    /**
     * 根据Class去创建对象
     * 通过Class对象的方法newInstance获取实例化对象（通过反射来创建对象）
     * 前提：类型中必须有默认的构造方法。
     * @param <T>
     * @param clzz
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T>  T getBean(Class<?> clzz){
        T t = null;
        try {
            t = (T)clzz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 根据我们的完全限定名去创建对象
     * 通过Class.forname(“全限定类名”)获取Class对象。
     */
    @SuppressWarnings("unchecked")
    public static <T>  T getBean2(String path){
        T t = null;
        try {
            Class<?> forName= Class.forName(path);
            t = (T)forName.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 解析bean.properties
     *
     */
//    static Map<String,String> mapings=new HashMap<>();
//    static {
//        //获取bean.properties的流
//        InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
//        Properties properties = new Properties();
//        //把流加载到properties里面
//        try {
//            properties.load(is);
//            Set<Map.Entry<Object,Object>> entries=properties.entrySet();
//            for(Map.Entry<Object,Object> entry:entries){
//                mapings.put(entry.getKey().toString(),entry.getValue().toString());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("解析配置文件异常");
//        }
//    }


    /**
     * 根据我们的完全限定名去创建对象
     * @param  key =userDao userService userController
     */
    @SuppressWarnings("unchecked")
    public static <T>  T getBean(String key){
        T t = null;
        try {
            //根据key去maping取出完全限定名
            String path=mapings.get(key);
            Class<?> forName= Class.forName(path);
            t = (T)forName.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    static Map<String,String> mapings=new HashMap<>();
    public static Map<String,Object> ioc=new HashMap<>();
    static {
        //获取bean.properties的流
        InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        Properties properties = new Properties();
        //把流加载到properties里面
        try {
            properties.load(is);
            Set<Map.Entry<Object,Object>> entries=properties.entrySet();
            for(Map.Entry<Object,Object> entry:entries){
                mapings.put(entry.getKey().toString(),entry.getValue().toString());
                //创建所有对象
//                Class<?> forName= Class.forName(entry.getValue().toString());
//                Object obj= forName.newInstance();
               ioc.put(entry.getKey().toString(),getBean3(entry.getKey().toString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("解析配置文件异常");
        }
    }

    @SuppressWarnings("unchecked")
    public static Object getBean3(String key){
        try {
            //根据key去maping取出完全限定名
            String path=mapings.get(key);
            Class<?> forName= Class.forName(path);
            return forName.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
