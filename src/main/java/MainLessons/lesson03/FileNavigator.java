package MainLessons.lesson03;

import java.util.*;
// Test Pull Request 011222
public class FileNavigator {
    private Map<String, List<FileData>> files = new HashMap<>();

    public void add(String path, FileData file) {
        if (!path.equals(file.getPath())) {
            System.out.println("Error. Not valid path!");
            return;
        }

        List<FileData> fileList = files.getOrDefault(path, new ArrayList<>());
        fileList.add(file);
        files.put(path, fileList);
    }

    public List<FileData> find(String path) {
        return files.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(String path, long maxSize) {
        List<FileData> fileList = files.getOrDefault(path, new ArrayList<>());
        List<FileData> filteredList = new ArrayList<>();

        for (FileData file : fileList) {
            if (file.getSize() <= maxSize) {
                filteredList.add(file);
            }
        }

        return filteredList;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();

        for (List<FileData> fileList : files.values()) {
            allFiles.addAll(fileList);
        }

        Collections.sort(allFiles, Comparator.comparingLong(FileData::getSize));
        return allFiles;
    }
}