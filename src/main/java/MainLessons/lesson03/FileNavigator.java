package MainLessons.lesson03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileNavigator {
    private String pathToFile;
    private HashMap<String, ArrayList<FileData>> files;

    public FileNavigator() {
        this.files = new HashMap<>();
    }

    void add(String nameOfFile, int sizeInBytes, String pathToFile) {
        FileData fileData = new FileData(nameOfFile, sizeInBytes, pathToFile);
        if (files.containsKey(pathToFile)){
            files.get(pathToFile).add(fileData);
        }
        else {
            ArrayList<FileData> newFiles = new ArrayList<>();
            newFiles.add(fileData);
            files.put(pathToFile, newFiles);
        }
    }
    public ArrayList<FileData> find(String pathToFile){
        if (files.containsKey(pathToFile)){
            return files.get(pathToFile);
        }
        return null;
        }
    public ArrayList<FileData> filterBySize(int sizeInBytes) {
        ArrayList<FileData> filteredFiles = new ArrayList<>();
        for (FileData file : files) {
            if (file.getSizeInBytes() <= sizeInBytes) {
                filteredFiles.add(file);
            }
        }
        return filteredFiles;
    }
    void remove(String pathToFile){
        if (!this.pathToFile.equals(pathToFile)){
            return;
        }
        files.clear();
    }
}
