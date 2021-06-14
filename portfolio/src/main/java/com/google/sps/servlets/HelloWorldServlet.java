package com.google.sps.servlets;

import java.util.ArrayList;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import com.google.gson.Gson;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String json = convertToJson();

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

  private String convertToJson() {
    String json = "{";
    json += "\"song\": ";
    json += "Save Your Tears";
    json += ", ";
    json += "\"movie\": ";
    json += "Cruella";
    json += ", ";
    json += "\"series\": ";
    json += "Game of Thrones";
    json += ", ";
    json += "\"sport\": ";
    json += "Soccer";
    json += ", ";
    json += "\"game\": ";
    json += "Detroit: Become Human";
    json += "}";
    return json;
  }
}
