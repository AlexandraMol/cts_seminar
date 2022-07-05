package ase.cts.g1088.memento;

public class FileSnapshot {
    String content;  //putea sa fie si de tip File insa se optimizeaza codul deoarece doar content ul se schimba
    int version;
    String dateTime;
    String message;

    public FileSnapshot(String content, int version, String dateTime, String message) {
        this.content = content;
        this.version = version; //unic
        this.dateTime = dateTime;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public String getDetails() {
        return "FileSnapshot{" +
                "version='" + version + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
