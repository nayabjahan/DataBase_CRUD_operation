
import com.mysql.cj.jdbc.Driver;
import com.mysql.jdbc.*;

import java.sql.*;
import java.util.*;

public class LoadDriver {
public static void main(String[] args) {
    String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?usesSSl=false";
    String userName = "root";
    String password = "Alamzafir786@";
    Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
    } catch (ClassNotFoundException e) {
        throw new IllegalStateException("cannot find the driver in the class path", e);
                // handle the error
    }
    listDriver();
    try{
        System.out.println("connecting to data base:" +jdbcURL);
        conn = DriverManager.getConnection(jdbcURL,userName,password);
        System.out.println("connection is succesfulll" +conn);
    }catch (SQLException e){
        e.printStackTrace();
    }
}
public static void listDriver(){
    Enumeration<java.sql.Driver> driverlist = DriverManager.getDrivers();
    while (driverlist.hasMoreElements()){
        com.mysql.cj.jdbc.Driver driverClass = (Driver) driverlist.nextElement();
        System.out.println("" +driverClass.getClass().getName());
    }
    }
}

