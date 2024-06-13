package generalFunctionality;

import parsingCSV.WorkWithCSV;

public class Functionality {
    public static void main(String[] args) {


        WorkWithCSV workWithCSV = new WorkWithCSV();
        System.out.println(workWithCSV.findVehicleById("1"));

    }
}
