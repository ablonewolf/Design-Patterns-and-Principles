package StructuralPatterns.DecoratorPattern.LowerCaseConverterDecorator;

import java.io.*;

public class StreamClient {
    public static void main(String[] args) {
        int c;
        StringBuffer buffer = new StringBuffer("Hello Arka. Nice to meet you. How are you doing?");
        byte[] bytes = buffer.toString().getBytes();
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)));
            while((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
            inputStream.close();
        }
        catch (IOException e) {
            System.out.println("An exception occured. " + e.getMessage());;
        }
    }
}
