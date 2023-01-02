package MainLessons.lesson02.phonebook;
import java.util.Objects;

public class Record implements Comparable<Record> {
    private String name;
    private String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return name + ": " + phone;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(name, record.name) &&
                Objects.equals(phone, record.phone);
    }
    @Override
    public int compareTo(Record o) {
        return name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
