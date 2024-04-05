package random;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ReadAsString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int a;
        while ((a = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) a);
        }
        return stringBuilder.toString();
    }
}
