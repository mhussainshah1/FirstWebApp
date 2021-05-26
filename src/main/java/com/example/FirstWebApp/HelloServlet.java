package com.example.FirstWebApp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")

/**
 *     <pre>
 *     (1) init() - called once.
 *     (2) service() - whenever request made it create thread for each request. All thread talking to one class.
 *           doGet()
 *           doPut()
 *           doPost()
 *           doDelete()
 *
 *     (3) destroy() - called once.
 *
 *     Note:
 *     Servlet is not thread safe. do not declare global variable inside servlet.
 *
 *     </pre>
 */

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}