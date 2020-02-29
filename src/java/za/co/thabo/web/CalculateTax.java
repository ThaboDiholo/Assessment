/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thabo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.thabo.business.TaxCalculations2017;
import za.co.thabo.business.TaxCalculations2018;

/**
 *
 * @author Thabo Diholo
 */
public class CalculateTax extends HttpServlet {

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
        //=========================Declaring variable and Objects==============================
        double medAid = 0, rebate, calcRebate2017 = 0, calcRebate2018, annaulySalary, annually = 0;

        TaxCalculations2017 objCalculations = new TaxCalculations2017();
        TaxCalculations2018 objCal = new TaxCalculations2018();
        //==========================End=======================================

        //Values from index.html
        String strYear = request.getParameter("typeEarning");
        int year = Integer.parseInt(request.getParameter("year"));
        int age = Integer.parseInt(request.getParameter("age"));
        double totEarns = Double.parseDouble(request.getParameter("totEarns"));
        String strTypeEarning = request.getParameter("typeEarning");
        int medicalAid = Integer.parseInt(request.getParameter("MedAidMember"));
        
        //end
        
            
        if (strTypeEarning.equalsIgnoreCase("Annually")) {
            annaulySalary = totEarns;
        } else {
            annaulySalary = totEarns * 12;
        }

        if (year == 2017) {
            if (age < 65 && annaulySalary < 75000) {
                medAid = objCalculations.calMedAid2017(medicalAid, strTypeEarning);
                rebate = objCalculations.calcRebate2017(age);
            } else if (age >= 65 && age < 75 && annaulySalary < 116150) {
                medAid = objCalculations.calMedAid2017(medicalAid, strTypeEarning);
                rebate = objCalculations.calcRebate2017(age);

            } else if (age >= 65 && annaulySalary < 129850) {
                medAid = objCalculations.calMedAid2017(medicalAid, strTypeEarning);
                rebate = objCalculations.calcRebate2017(age);
            } else {
                medAid = objCalculations.calMedAid2017(medicalAid, strTypeEarning);
                rebate = objCalculations.calcRebate2017(age);
                calcRebate2017 = objCalculations.CalculationPAYE2017(rebate, annaulySalary);
                annually = Math.round((calcRebate2017 * 12) * 100) / 100D;
            }
        } else if (year == 2018) {
            if (age < 65 && annaulySalary < 75000) {
                medAid = objCal.calMedAid2018(medicalAid, strTypeEarning);
                rebate = objCal.calcRebate2018(age);
            } else if (age >= 65 && age < 75 && annaulySalary < 116150) {
                medAid = objCal.calMedAid2018(medicalAid, strTypeEarning);
                rebate = objCal.calcRebate2018(age);

            } else if (age >= 65 && annaulySalary < 129850) {
                medAid = objCal.calMedAid2018(medicalAid, strTypeEarning);
                rebate = objCal.calcRebate2018(age);
            } else {
                medAid = objCal.calMedAid2018(medicalAid, strTypeEarning);
                rebate = objCal.calcRebate2018(age);
                calcRebate2017 = objCal.CalculationPAYE2018(rebate, annaulySalary);
                annually = Math.round((calcRebate2017 * 12) * 100) / 100D;
            }
        }

        //Passing values to a jsp page 
        request.setAttribute("medAid", medAid);
        request.setAttribute("totEarns", totEarns);
        request.setAttribute("totEarns", totEarns);
        request.setAttribute("calcRebate2017", calcRebate2017);
        request.setAttribute("annually", annually);
        request.getRequestDispatcher("Display.jsp").forward(request, response);
    }

}
