package MainLessons.lesson02.phonebook;

import java.util.ArrayList;
import java.util.List;

public class phonebook {
    private List<Record> records;

    public phonebook() {
        records = new ArrayList<>();
    }
    public void add(Record record) {
        records.add(record);
    }
    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }
}
