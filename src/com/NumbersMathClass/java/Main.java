package com.NumbersMathClass.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// declare variables
        double TipPercent = .175;
        double Tax = .025;
        double ItemCost;
        double ItemCostTotal = 0;
        double TaxValue;
        double TotalWithTaxes;
        double RecTip;
        String Input;
        Scanner sc = new Scanner(System.in);

        //prompt user to input cost of first item
        System.out.println("Enter the cost of the first item on your bill(example 1.25): ");
        Input = sc.nextLine();
        ItemCost = Double.parseDouble(Input);

        //being main while loop to have user enter all items on bill
        while (ItemCost != 0) {
            ItemCostTotal = ItemCostTotal + ItemCost;
            //prompt user to enter next item
            System.out.println("Enter the cost of the next item on your bill(example 1.25), or enter 0 to if there are no more items: ");
            Input = sc.nextLine();
            ItemCost = Double.parseDouble(Input);
            }

        //perform calculations on totals, taxes and recommended tip
        TaxValue = Tax * ItemCostTotal;
        TotalWithTaxes = ItemCostTotal + TaxValue;
        RecTip = TotalWithTaxes * TipPercent;

        System.out.println("Sub Total: " + calculateUsingDecimalFormat(ItemCostTotal));
        System.out.println("Tax(2.5%): " + calculateUsingDecimalFormat(TaxValue));
        System.out.println("Total: " + calculateUsingDecimalFormat(TotalWithTaxes));
        System.out.println("Recommended Tip at 17.5%: " + calculateUsingDecimalFormat(RecTip));
        }

    public static String calculateUsingDecimalFormat(double value){
        String result = "";

        DecimalFormat priceFormatter = new DecimalFormat("$#0.00"); //setting the format
        result = priceFormatter.format(value); //rounded operation

        return result;
    }

    }

