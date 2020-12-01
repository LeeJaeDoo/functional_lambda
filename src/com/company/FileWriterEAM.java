package com.company;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jaedoo Lee
 */
public class FileWriterEAM {
    private final FileWriter writer;

    public FileWriterEAM(final String fileName) throws IOException {
        this.writer = new FileWriter(fileName);
    }

    private void close() throws IOException {
        System.out.println("close called auto...");
        writer.close();
    }

    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }

    public static void use(final String fileName,
                           final UseInstance<FileWriterEAM, IOException> block) throws IOException {
        final FileWriterEAM writerEAM = new FileWriterEAM(fileName);
        try {
            block.accept(writerEAM);
        } finally {
            writerEAM.close();
        }
    }
}
