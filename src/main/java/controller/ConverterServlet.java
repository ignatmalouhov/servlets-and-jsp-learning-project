package controller;

import exception.InputValidatorException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static service.Cm2inchConverter.convertCM;
import static service.Inch2cmConverter.convertINCH;
import static service.InputValidator.validate;

@WebServlet(name = "ConverterServlet", urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String amount = request.getParameter("amount");
        String unit = request.getParameter("unit");

        try {
            validate(amount, unit);
        } catch (InputValidatorException exception) {
            String error = "Можно переводить только цифры";
            request.setAttribute("errorMessage", error);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/view/converter.jsp");
            dispatcher.forward(request, response);
        }

        String result = "";

        switch (unit) {
            case "CM" -> result = convertCM(amount);
            case "INCH" -> result = convertINCH(amount);
        }

        request.setAttribute("result", result);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/converter.jsp");
        dispatcher.forward(request, response);

    }
}
