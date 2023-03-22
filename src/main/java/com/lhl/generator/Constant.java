package com.lhl.generator;

public class Constant {
    public static String dataBase="";
    public static String location="127.0.0.1";
    public static String port="3306";
    public static String userName="root";
    public static String password="root";
    public static String table=""; //生成的表名，多个用逗号隔开
    public static String entityName="";
    public static String moduleName=""; //模块名
    public static String organization="";//父包名（组织）



    public static String driverName="com.mysql.cj.jdbc.Driver";

    //包名配置
    public static String controller="web.controller";
    public static String service="service";
    public static String entity="model.entity";
    public static String vo="model.vo";
    public static String query="model.query";
    public static String mapper="dao";

    public static String projectPath = System.getProperty("user.dir");
    public static String author = System.getProperty("user.name");
//    public static String outPutDir = projectPath + "/src/main/java/";
    public static String outPutDir = projectPath + "/\u751f\u6210\u7684\u4ee3\u7801/";


}
