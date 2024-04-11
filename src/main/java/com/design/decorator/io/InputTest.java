package com.design.decorator.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputTest {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = Files.newInputStream(Paths.get("src/main/java/com/design/decorator/io/test.txt"));
        inputStream = new BufferedInputStream(inputStream);
        inputStream = new LowerCaseInputStream(inputStream);
        try (InputStream in = inputStream) {
            int c;
            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }
        }

    }
}
