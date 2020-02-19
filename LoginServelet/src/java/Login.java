/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author saura
 */
public class Login extends HttpServlet {

  
@Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException  
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        String st1=req.getParameter("uid");
        String st2=req.getParameter("pid");
        
        if(st1.equals("kunal")||st2.equals("kunal"))
        {
            out.print("<h3> WELCOME </h3>");
        }
        else
        {
             RequestDispatcher rr = req.getRequestDispatcher("index.html");
             rr.forward(req,resp);
        }

    }
    
    

}
