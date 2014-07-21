package com.bodejidi;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

public class ViewListServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)
        throws IOException,ServletException{
            resp.getWriter().println("test Servlet!");

    }


}
