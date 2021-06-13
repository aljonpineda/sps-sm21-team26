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

    ArrayList<String> messages = new ArrayList<String>();

    messages.add("Fast and Furious 7");
    messages.add("Castlevania");
    messages.add("Moana");
    messages.add("You");
    messages.add("The Conjuring");
    messages.add("Highlander");
    

    String json = convertToJsonUsingGson(messages);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

  private String convertToJsonUsingGson(ArrayList messg) {
    Gson gson = new Gson();
    String json = gson.toJson(messg);
    return json;
  }
}
