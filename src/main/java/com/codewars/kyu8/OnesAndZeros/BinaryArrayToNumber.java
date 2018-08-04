package com.codewars.kyu8.OnesAndZeros;

import org.apache.commons.lang3.StringUtils;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String changeList = StringUtils.join(binary,"");
        return Integer.parseInt(changeList,2);
    }
}
