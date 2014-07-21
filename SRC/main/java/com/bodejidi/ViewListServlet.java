package com.bodejidi;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class ViewListServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)
        throws IOException,ServletException{
           
        String uri = "jdbc:mysql://localhost/test?username=root&password=";
       try{ 
           Class.forName("com.mysql.jdbc.Driver");

           Connection connection = DriverManager.getConnection(uri);
                
       }catch(Exception e){

        System.out.println(e);

       }


    }
}
