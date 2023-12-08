package com.sh.together;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dlachdla2")
public class Dlachdla2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().print("hello😊😊");
<<<<<<< HEAD
        resp.getWriter().print("hello");
=======
        resp.getWriter().print("🎄🎄");
>>>>>>> e090820ff9876639374c4939387c5cffd99df272
    }
}
