package parsingCSV;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import customer.data.Customer;
import lombok.SneakyThrows;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import com.opencsv.bean.CsvToBeanBuilder;
import org.json.JSONArray;
import vehicle.data.Vehicle;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class WorkWithCSV {

    private final String vehicleDataJSON = "src/main/resources/VehiclesData.json";
    private final String customersDataJSON = "src/main/resources/CustomersData.json";
    private final String rentalInformationJSON = "src/main/resources/RentalInformation.json";



    @SneakyThrows
    public Vehicle findVehicleById(String vehicleId)
    {
        Path path = Path.of(vehicleDataJSON);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonContent = Files.readString(path);
        JSONArray jsonArray = new JSONArray(jsonContent);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (Object jsonObject : jsonArray)
        {
            Vehicle vehicle = gson.fromJson(String.valueOf(jsonObject), Vehicle.class);
            vehicles.add(vehicle);
        }

        Vehicle vehicle = vehicles.stream()
                .filter(vehicle1 -> vehicle1.getId().equals(vehicleId))
                .findFirst() // id is unique but it requires this function
                .orElse(null);
        return vehicle;
    }

    public Customer findCustomerById(String customerId)
    {
        return null;
    }

    public void addVehicle(String id, String type, String brand, String model,
     int year, String vin, String color, double maxSpeed, double maxLoad, double engine,
     double fuelTankCapacity, double fuelConsumption, String engineType, String fuelType,
     String gearBox, double mileage, int numberOfSeats, boolean isReserved)
    {
    }
}
