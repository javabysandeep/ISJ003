package controller;

import model.Lead;
import service.LeadService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/lead")
public class LeadController extends javax.servlet.http.HttpServlet {
    public LeadService leadService = new LeadService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //name, mobile, email, source
        String name = req.getParameter("name");
        int mobile = Integer.parseInt(req.getParameter("mobile"));
        String email = req.getParameter("email");
        String source = req.getParameter("source");
        // read input and send output
        Lead lead = Lead.builder()
                .name(name)
                .mobile(mobile)
                .email(email)
                .source(source)
                .createdAt(LocalDateTime.now())
                .build();
        leadService.addLead(lead);

        PrintWriter writer = resp.getWriter();
        writer.println("Lead added successfully");

    }
}
