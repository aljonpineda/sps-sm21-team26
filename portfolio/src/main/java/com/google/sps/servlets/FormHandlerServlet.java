package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 6734233536872851287L;

    @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String textValue = request.getParameter("text-input");
    String emailValue = request.getParameter("email-input");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + emailValue + "; " + textValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + textValue);
    response.sendRedirect("https://tige-sps-summer21.uc.r.appspot.com/index.html");
  }
}