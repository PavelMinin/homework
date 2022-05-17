package home_work_6.additional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader {

    private final String path;
    private final String text;

    public String getText() {
        return text;
    }

    public TxtFileReader(String path) throws IOException {
        this.path = path;
        this.text = readTxtFile();
    }

    private String readTxtFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path))) {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        return "TxtFileReader{\n" +
                "path ='" + path + '\'' +
                ",\ntext ='" + text + '\'' +
                "\n}";
    }
}
