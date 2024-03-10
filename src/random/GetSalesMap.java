package random;

import java.io.*;
import java.security.Key;
import java.util.*;


class GetSalesMap {
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salesMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String brLine;
            while ((brLine = bufferedReader.readLine()) != null) {
                String[] key_value = brLine.split(" ");
                String name = key_value[0].trim();
                Long number = Long.valueOf(key_value[1].trim());
                if (!name.equals("")) {
                    if (!salesMap.containsKey(name)) {
                        salesMap.put(name, number);
                    } else {
                        salesMap.merge(name, number, Long::sum);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salesMap;
    }
}
 