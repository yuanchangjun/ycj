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
import java.sql.ResultSet;

public class ViewListServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)
        throws IOException, ServletException{           
        req.getRequestDispatcher("/jsp/allList.jsp").forward(req, resp);
    }

    public void doPost( HttpServletRequest req, HttpServletResponse resp)
        throws IOException, ServletException{
        String uri = "jdbc:mysql://localhost/test?user=root&password=";
        String sql = "select * from adimin";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(uri);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                resp.getWriter().println("admin-id:" + rs.getString("admin-id"));
                resp.getWriter().println("account:" + rs.getString("account"));
                resp.getWriter().println("password:" + rs.getString("password"));
                resp.getWriter().println("name:" + rs.getString("name"));
                resp.getWriter().println("group:" + rs.getString("group"));
            }
        }catch(Exception e){
                
        }finally{
                try{
                    rs.close();
                }catch(Exception e){
                    
                }

                try{
                    stmt.close();
                }catch(Exception e){
                    
                }

                try{
                    conn.close();
                }catch(Exception e){
                    
                }

        }
    }
}


