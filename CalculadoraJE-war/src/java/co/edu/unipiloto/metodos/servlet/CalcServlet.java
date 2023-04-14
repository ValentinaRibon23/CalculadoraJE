/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.servlet;

import co.edu.unipiloto.metodos.session.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Valentina Contreras
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");

        int val1;
        val1 = Integer.parseInt(request.getParameter("val1"));

        int val2;
        val2 = Integer.parseInt(request.getParameter("val2"));

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");
            out.println("</head>");
            out.println("<body>");

            if ("Sumar".equalsIgnoreCase(action)) {
                out.println("<h1>la suma es: " + calcBean.suma(val1, val2) + "</h1>");
            } else if ("Restar".equalsIgnoreCase(action)) {
                out.println("<h1>la resta es: " + calcBean.resta(val1, val2) + "</h1>");
            } else if ("Multiplicar".equalsIgnoreCase(action)) {
                out.println("<h1>la multiplicacion es: " + calcBean.multiplicacion(val1, val2) + "</h1>");
            }else if ("Dividir".equalsIgnoreCase(action)) {
                out.println("<h1>la division es: " + calcBean.division(val1, val2) + "</h1>");
            }else if ("Modulo".equalsIgnoreCase(action)) {
                out.println("<h1>El modulo es: " + calcBean.Modulo(val1, val2) + "</h1>");
            }else if ("ElevarAlCuadrado".equalsIgnoreCase(action)) {
                out.println("<h1> el "+ val1 +" Elevado al cuadrado da: "+ calcBean.Elevaralcuadrado(val1) + "</h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
