package com.stock.account.management;

import java.util.ArrayList;
import java.util.Scanner;

public class Stocks {

    //taking static scanner
    static Scanner scanner = new Scanner(System.in);

    //initializing array list
    static ArrayList<StockPortfolio> portfolioArrayList = new ArrayList<StockPortfolio>();

    public static void main(String[] args) {
        System.out.println("WELCOME TO STOCK ACCOUNT MANAGEMENT");
        Stocks object = new Stocks();
        object.addNumberOfStocks();
        object.displayTotalValueOfEachStock();
    }

    //adding stocks method
    public void addStocks() {
        System.out.println("Enter the Stock Name ");
        String stockName = scanner.next();

        System.out.println("Enter the Number Of Shares ");
        int numberOfShares = scanner.nextInt();

        System.out.println("Enter Share Price ");
        int priceOfShare = scanner.nextInt();

        int valueOfStock = numberOfShares * priceOfShare;     //calcultaing value of stock

        //storing in array
        StockPortfolio addStock = new StockPortfolio(stockName, numberOfShares, priceOfShare, valueOfStock);
        portfolioArrayList.add(addStock);

        System.out.println("Stock is added sucessfully ");
    }

    //method to add n number of stocks from user
    public void addNumberOfStocks() {
        System.out.println("Enter the number of stocks to be created");
        int userChoice = scanner.nextInt();

        for (int i = 0; i < userChoice; i++) {
            addStocks();    //calling add stock to perform creating n number
        }
    }

    //method to print total value of stock
    public void printTotalValueOfStock() {
        int totalValueOfStock = 0;

        for (StockPortfolio stockPortfolio : portfolioArrayList) {
            totalValueOfStock += stockPortfolio.getValueOfStock();
        }
        System.out.println("total value of stocks :- " + totalValueOfStock);
    }

    //printing total value of each stock
    public void displayTotalValueOfEachStock() {
        for (StockPortfolio stockPortfolio : portfolioArrayList) {
            System.out.println(stockPortfolio.toString());
        }
        printTotalValueOfStock();
    }
}
