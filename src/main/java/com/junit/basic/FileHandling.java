package com.junit.basic;

import java.io.*;

public class FileHandling {

    public void writeToFile(String filename, String content)throws IOException {
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(filename));
        fileWrite.write(content);
        fileWrite.close();
    }

    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }
}
