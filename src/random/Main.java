package random;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[]{3, 10});
        OutputStream outputStream = new ByteArrayOutputStream();
        print(stream, outputStream);
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int buffer;
        int result = 0;
        while ((buffer = inputStream.read()) != -1) {
            result += (byte) buffer;
        }
        return result;
    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int buffer;
        while ((buffer = inputStream.read()) != -1) {
            if (buffer % 2 == 0) {
                System.out.println(buffer);
                outputStream.write(buffer);
            }
            outputStream.flush();
        }
    }
}