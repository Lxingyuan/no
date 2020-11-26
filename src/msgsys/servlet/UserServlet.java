package msgsys.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：林星源
 * 日期: 2020/11/26 15:59
 * 描述:
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends BaseServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request,response);
    }
    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
