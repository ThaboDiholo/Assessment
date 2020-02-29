/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thabo.business;

/**
 *
 * @author Thabo Diholo
 */
public class TaxCalculations2017 {

    public double calMedAid2017(int medicalAid, String typeEarnings) {
        double medAmount = 0;

        if (typeEarnings.equalsIgnoreCase("Monthly")) {
            if (medicalAid == 0) {
                medAmount = 0;
            } else if (medicalAid == 1) {
                medAmount = 286;
            }else if (medicalAid == 2) {
                medAmount = 286 * 2;
            }else {
                int numDepandent = medicalAid - 2;
                medAmount = (286 * 2) + (numDepandent * 192);
            }
        } else if (typeEarnings.equalsIgnoreCase("Annually")) {
            if (medicalAid == 0) {
                medAmount = 0;
            } else if (medicalAid == 1) {
                medAmount = 286 * 12;
            }else if (medicalAid == 2) {
                medAmount = (286 * 2) * 12;
            }else {
                int numDepandent = medicalAid - 2;
                medAmount = ((286 * 2) + (numDepandent * 192)) * 12;
            }
        }
        return Math.round(medAmount * 100) / 100D;
    }

    public double calcRebate2017(int age) {
        double totRebate = 0;

        double primary = 13500;
        double secondary = 7407;
        double tertiary = 2466;

        if (age < 65) {
            totRebate = primary;
        } else if (age >= 65 && age < 75) {
            totRebate = secondary + primary;
        } else if (age >= 75) {
            totRebate = primary + secondary + tertiary;
        }

        return Math.round(totRebate * 100) / 100D;
    }

    public double CalculationPAYE2017(double rebate, double totEarns) {
        double a, b, c, d, e = 0;

        if (totEarns >= 0 && totEarns <= 188000) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 100;

        } else if (totEarns >= 188001 && totEarns <= 293600) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 15;

        } else if (totEarns >= 293601 && totEarns <= 406400) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;

        } else if (totEarns >= 406401 && totEarns <= 550100) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;

        } else if (totEarns >= 550101 && totEarns <= 701300) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;
        } else if (totEarns >= 701301) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;
        }

        return Math.round(e * 100) / 100D;
    }

}
