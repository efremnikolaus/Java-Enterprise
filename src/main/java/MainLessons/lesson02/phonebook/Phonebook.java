package MainLessons.lesson02.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Phonebook {
    private static List<Record> records;

    public Phonebook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                result.add(record);
            }
        }
        return result.isEmpty() ? null : result;
    }

    public static void main(String[] args) {
        Phonebook directory = new Phonebook();
        directory.add(new Record("John Smith", "92837462"));
        directory.add(new Record("Jane Smith", "73284637"));
        directory.add(new Record("John Doe", "23487923"));

        Record johnSmith = directory.find("John Smith");
        System.out.println(johnSmith);

        List<Record> smiths = directory.findAll("Smith");
        System.out.println(smiths);

        Collections.sort(records);
        System.out.println(directory.records);
    }
}
