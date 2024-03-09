package web.headers.Controller;

import jakarta.servlet.RequestDispatcher;
import web.headers.Model.HeadersBean;
import java.io.*;
import java.util.Collections;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name="to", value= {"/index.html"})
public class ServletRequestHeaders extends HttpServlet {

    public void init() {}
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<String> headerNames = Collections.list(request.getHeaderNames());
        List<String> headerValues = new java.util.ArrayList<>(Collections.emptyList());


        for (String name: headerNames) {
            headerValues.add(request.getHeader(name));
        }

        HeadersBean headersBean = new HeadersBean();

        headersBean.setHeaderNames(headerNames);
        headersBean.setHeaderValues(headerValues);

        request.setAttribute("headers", headersBean);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/showHeaders.jsp");

        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}