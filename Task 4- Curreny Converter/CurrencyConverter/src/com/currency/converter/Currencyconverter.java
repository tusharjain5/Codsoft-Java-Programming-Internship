package com.currency.converter;

import java.util.Scanner;

public class Currencyconverter {

	
	 private static final double LKR_TO_USD = 0.0057;
	 private static final double LKR_TO_EUR = 0.0049; 
	 private static final double LKR_TO_GBP = 0.0041; 
	 private static final double LKR_TO_INR = 0.456; 
	 private static final double LKR_TO_LKR = 1.0;

	 
     private static final double USD_TO_USD = 1.0;
     private static final double USD_TO_EUR = 0.85;
     private static final double USD_TO_GBP = 0.73;
     private static final double USD_TO_INR = 73.52; 
     private static final double USD_TO_LKR = 202.43; 


    private static final double EUR_TO_USD = 1.18; 
    private static final double EUR_TO_EUR = 1.0;
    private static final double EUR_TO_GBP = 0.85; 
    private static final double EUR_TO_INR = 88.68; 
    private static final double EUR_TO_LKR = 245.36; 
    
    private static final double GBP_TO_USD = 1.38; 
    private static final double GBP_TO_EUR = 1.18;
    private static final double GBP_TO_GBP = 1.0;
    private static final double GBP_TO_INR = 103.12; 
    private static final double GBP_TO_LKR = 285.83; 
    
    private static final double INR_TO_USD = 0.014; 
    private static final double INR_TO_EUR = 0.012; 
    private static final double INR_TO_GBP = 0.0097; 
    private static final double INR_TO_INR = 1.0;
    private static final double INR_TO_LKR = 2.19;
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Select Base Currency (USD, EUR, GBP, INR, LKR):");
        String basecurrency = sc.nextLine().toUpperCase();
        System.out.println("Select Target Currency (USD, EUR, GBP, INR, LKR):");
        String targetcurrency = sc.nextLine().toUpperCase();

       
        System.out.println("Enter the amount to convert:");
        double amount = sc.nextDouble();

        
        double convertedAmount = convertCurrency(amount, basecurrency, targetcurrency);

        System.out.println(amount + " " + basecurrency + " is equivalent to " + convertedAmount + " " + targetcurrency);
    }


    private static double convertCurrency(double amount, String basecurrency, String targetcurrency) {

        double exchangerate;
        switch (basecurrency) {
            case "USD":
                exchangerate = getExchangeRateForUSD(targetcurrency);
                break;
            case "EUR":
                exchangerate = getExchangeRateForEUR(targetcurrency);
                break;
            case "GBP":
                exchangerate = getExchangeRateForGBP(targetcurrency);
                break;
            case "INR":
                exchangerate = getExchangeRateForINR(targetcurrency);
                break;
            case "LKR":
                exchangerate = getExchangeRateForLKR(targetcurrency);
                break;
            default:
                throw new IllegalArgumentException("Invalid Base Currency: " + basecurrency);
        }

        
        return amount * exchangerate;
    }

    // Method to get exchange rate for USD base currency
    private static double getExchangeRateForUSD(String targetcurrency) {
        switch (targetcurrency) {
            case "USD":
                return USD_TO_USD;
            case "EUR":
                return USD_TO_EUR;
            case "GBP":
                return USD_TO_GBP;
            case "INR":
                return  USD_TO_INR;
            case "LKR":
                return  USD_TO_LKR;
            default:
                throw new IllegalArgumentException("Invalid target currency: " + targetcurrency);
        }
    }


    private static double getExchangeRateForEUR(String targetcurrency) {
    	 switch (targetcurrency) {
         case "USD":
             return EUR_TO_USD;
         case "EUR":
             return EUR_TO_EUR;
         case "GBP":
             return EUR_TO_GBP;
         case "INR":
             return  EUR_TO_INR;
         case "LKR":
             return EUR_TO_LKR;
         default:
             throw new IllegalArgumentException("Invalid target currency: " + targetcurrency);
     }
    }

    private static double getExchangeRateForGBP(String targetcurrency) {
    	 switch (targetcurrency) {
         case "USD":
             return GBP_TO_USD;
         case "EUR":
             return GBP_TO_EUR;
         case "GBP":
             return GBP_TO_GBP;
         case "INR":
             return  GBP_TO_INR;
         case "LKR":
             return GBP_TO_LKR;
         default:
             throw new IllegalArgumentException("Invalid target currency: " + targetcurrency);
     }
    }

    private static double getExchangeRateForINR(String targetcurrency) {
    	 switch (targetcurrency) {
         case "USD":
             return INR_TO_USD;
         case "EUR":
             return INR_TO_EUR;
         case "GBP":
             return INR_TO_GBP;
         case "INR":
             return INR_TO_INR;
         case "LKR":
             return INR_TO_LKR;
         default:
             throw new IllegalArgumentException("Invalid target currency: " + targetcurrency);
    }
    }

    private static double getExchangeRateForLKR(String targetcurrency) {
    	switch (targetcurrency) {
        case "USD":
            return LKR_TO_USD;
        case "EUR":
            return LKR_TO_EUR;
        case "GBP":
            return LKR_TO_GBP;
        case "INR":
            return LKR_TO_INR;
        case "LKR":
            return LKR_TO_LKR;
        default:
            throw new IllegalArgumentException("Invalid target currency: " + targetcurrency);
    }
    }

    
}