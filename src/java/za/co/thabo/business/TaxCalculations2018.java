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
public class TaxCalculations2018 {

    public double calMedAid2018(int medicalAid, String typeEarnings) {
        double medAmount = 0;

        if (typeEarnings.equalsIgnoreCase("Monthly")) {
            if (medicalAid == 0) {
                medAmount = 0;
            } else if (medicalAid == 1) {
                medAmount = 303;
            } else if (medicalAid == 2) {
                medAmount = 303 * 2;
            }else {
                int numDepandent = medicalAid - 2;
                medAmount = (303 * 2) + (numDepandent * 204);
            }
        } else if (typeEarnings.equalsIgnoreCase("Annually")) {
            if (medicalAid == 0) {
                medAmount = 0;
            } else if (medicalAid == 1) {
                medAmount = 303 * 12;
            } else if (medicalAid == 2) {
                medAmount = (303 * 2) * 12;
            }else {
                int numDepandent = medicalAid - 2;
                medAmount = ((303 * 2) + (numDepandent * 204)) * 12;
            }
        }
        return Math.round(medAmount * 100) / 100D;
    }

    public double calcRebate2018(int age) {
        double totRebate = 0;

        double primary = 13500;
        double secondary = 7479;
        double tertiary = 2493;

        if (age < 65) {
            totRebate = primary;
        } else if (age >= 65 && age < 75) {
            totRebate = secondary + primary;
        } else if (age >= 75) {
            totRebate = primary + secondary + tertiary;
        }

        return Math.round(totRebate * 100) / 100D;
    }

    public double CalculationPAYE2018(double rebate, double totEarns) {
        double a, b, c, d, e = 0;

        if (totEarns >= 0 && totEarns <= 189880) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 100;

        } else if (totEarns >= 189881 && totEarns <= 296540) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 15;

        } else if (totEarns >= 296541 && totEarns <= 410460) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;

        } else if (totEarns >= 410461 && totEarns <= 555600) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;

        } else if (totEarns >= 555601 && totEarns <= 708310) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;
        } else if (totEarns >= 708311 && totEarns <= 1500000) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;
        } else if (totEarns >= 1500001) {
            a = totEarns - 293600;
            b = a * 0.31;
            c = b + 61296;
            d = c - rebate;
            e = d / 12;
        }

        return Math.round(e * 100) / 100D;
    }

}
