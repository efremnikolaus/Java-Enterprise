package MainLessons.lesson03;

public class FileData {
    private String nameOfFile;
    private int sizeInBytes;
    private String pathToFile;

    public FileData(String nameOfFile, int sizeInBytes, String pathToFile) {
        this.nameOfFile = nameOfFile;
        this.sizeInBytes = sizeInBytes;
        this.pathToFile = pathToFile;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public String getPathToFile() {
        return pathToFile;
    }
}
