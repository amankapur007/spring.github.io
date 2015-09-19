
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ritu
 */
public class loginController implements Controller {
    
    public loginController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }
    
   
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
       String username=hsr.getParameter("username");
       String password=hsr.getParameter("password");
       if(check(username,password).equals("true"))
       {
           Map m=new HashMap();
           m.put("username",username);
           m.put("password",password);
           ModelAndView mav=new ModelAndView("Dashboard",m);
           return mav;
       }
                 ModelAndView mav=new ModelAndView("Login"); 
    return mav;
    }
    public String check(String username,String password)
    {
        if(username.equals("aman") && password.equals("123"))
        {
            return "true";
        }
        return "false";
    }
}
