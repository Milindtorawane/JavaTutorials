package utlities;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;




public class CSVReadWrite {
    public static void main(String[] args) {
        try {
            writeCSVExample();
            writeAllExample();    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeCSVExample() throws IOException {
        String csv = "D:\\worldcupwrite2.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        String[] country = "WestInddies#India#Australia#Pakistan#Sri Lanka".split("#");
        writer.writeNext(country);
        System.out.println("CSV File written successfully line by line");
        writer.close();
    }
    private static void writeAllExample() throws IOException {
        String csv = "D:\\worldcupwrite.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        List<String[]> data = new ArrayList<String[]>();
        data.add(new String[]{"WestInddies", "17 Run"});
        data.add(new String[]{"WestInddies", "92 Run"});
        data.add(new String[]{"India", "43 Run"});
        data.add(new String[]{"Australia", "7 Run"});
        data.add(new String[]{"Pakistan", "22 Run"});
        data.add(new String[]{"Sri Lanka", "7 Wicket"});
        data.add(new String[]{"Australia", "8 Wicket"});
        data.add(new String[]{"Australia", "125 Run"});
        data.add(new String[]{"Australia", "53 Run"});
        data.add(new String[]{"India", "6 Wicket"});
        data.add(new String[]{"Australia", "7 Wicket"});
        writer.writeAll(data);
        System.out.println("CSV File written successfully All at a time");
        writer.close();
    }
}


