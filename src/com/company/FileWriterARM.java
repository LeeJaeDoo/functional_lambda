package com.company;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jaedoo Lee
 */
public class FileWriterARM implements AutoCloseable {
    private final FileWriter writer;

    public FileWriterARM(final String fileName) throws IOException {
        this.writer = new FileWriter(fileName);
    }

    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }

    @Override
    public void close() throws Exception {
        System.out.println("close auto");
        writer.close();
    }
}
