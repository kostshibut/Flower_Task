package by.bsuir.flowerShop.main;

import by.bsuir.flowerShop.report.Reporter;

public class Main {

    public static void main(String[] args) {
        Reporter.getBouquetReport();
        Reporter.getFindReport(100,300);
        Reporter.getSortReport();
    }
}
