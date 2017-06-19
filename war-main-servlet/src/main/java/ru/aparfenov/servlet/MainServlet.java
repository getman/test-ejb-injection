package ru.aparfenov.servlet;

import ru.aparfenov.manager.ManagerLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ArtemParfenov on 16.06.2017.
 */
@WebServlet(urlPatterns = "/family_tree")
public class MainServlet extends HttpServlet {

    @EJB
    ManagerLocal elementMngr;

    /**Обрабатывает get запрос от клиента*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        selectData(request, response);
    }

    /**Обрабатывает post запрос от клиента*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processClientRequest(req, resp);
        //перенаправляет клиента на страницу
        resp.sendRedirect("family_tree");

    }

    /**Processes a request received from the browser
     * @param request HttpServletRequest - user browser request
     * @param response HttpServletResponse - user browser response*/
    private void processClientRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
    }

    /***/
    private void selectData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = elementMngr.getName();
        String childName = elementMngr.getAnnotatedChildName();
        request.setAttribute("name", name + "/" + childName);
        request.getServletContext().getRequestDispatcher("/WEB-INF/pages/hello.jsp").forward(request, response);
    }
}
