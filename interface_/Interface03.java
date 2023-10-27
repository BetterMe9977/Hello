package com.hspedu.interface_;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    //Non-static method 't(com.hspedu.interface_.DBInterface)'
    // cannot be referenced from a static context
    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
