package com.bodejidi;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class ViewListServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)
        throws IOException,ServletException{
           
        String uri = "jdbc:mysql://localhost/test?user=root&password=";
        String sql = "insert into adimin values (1,'ycj','123','xingfu','财务部')";
        Connection conn = null;
        Statement stmt = null;
       try{ 
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(uri);          
           stmt = conn.createStatement();           
           stmt.execute(sql);     
       }catch(Exception e){
        System.out.println(e);        
       }finally{
            try{
                stmt.close();
            }catch(Exception e){
                
            }
            try{conn.close(); 
            }catch(Exception e){

            }     
        }
    }
}

