package com.bridgelabz.junit.basic;

import com.junit.basic.FileHandling;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;


public class FileHandlingTest {
    private static final String TEST_FILE = "testfile.txt";
    private FileHandling fileProcessor;


    @BeforeEach
    void setUp() {
        fileProcessor = new FileHandling();
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, this is a test!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        Assertions.assertEquals(content, readContent, "File content should match written content");
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Test content");

        File file = new File(TEST_FILE);
        Assertions.assertTrue(file.exists(), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFileThrowsIOException() {
        Assertions.assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"),
                "Reading a non-existent file should throw IOException");
    }
}
