package random;

import java.util.Arrays;

public class NumberOfBeams {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int devicesInRowCount = 0;
        int previousDeviceCount = 0;
        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    devicesInRowCount++;
                }
            }
            if (devicesInRowCount != 0) {
                res += devicesInRowCount * previousDeviceCount;
                previousDeviceCount = devicesInRowCount;
            }
            devicesInRowCount = 0;
        }
        return res;
    }
}

