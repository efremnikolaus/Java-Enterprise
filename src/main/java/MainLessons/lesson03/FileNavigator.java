package MainLessons.lesson03;

import java.util.ArrayList;
import java.util.List;

public class FileNavigator {
    private String path;
    private List<String> files;

    public FileNavigator(String path) {
        this.path = path;
        this.files = new ArrayList<>();
    }

    public String getPath() {
        return path;
    }

    public List<String> getFiles() {
        return files;
    }

    @Override
    public String   toString() {
        return "FileNavigator{" +
                "path='" + path + '\'' +
                ", files=" + files +
                '}';
    }
}
