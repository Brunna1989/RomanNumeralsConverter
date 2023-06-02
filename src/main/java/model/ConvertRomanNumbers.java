package model;

import java.util.HashMap;

public class  ConvertRomanNumbers {
    private final HashMap<Character, Integer> mapRoman;
    private final HashMap<Integer, String> mapInt;

    public ConvertRomanNumbers(){
        mapRoman = new HashMap<>();
        mapInt = new HashMap<>();
        mapRoman.put('I', 1);
        mapRoman.put('V', 5);
        mapRoman.put('X', 10);

        mapInt.put(10, "X");
        mapInt.put(9, "IX");
        mapInt.put(5, "V");
        mapInt.put(4, "IV");
        mapInt.put(1, "I");
    }
    public int romanToInt(String romanNum) {
        romanNum = romanNum.toUpperCase();
        if (romanNum.isBlank())
            throw new IllegalArgumentException("Insira apenas valores validos");

        int len = romanNum.length();
        int result = mapRoman.get(romanNum.charAt(len - 1));

        for (int i = len - 2; i >= 0; i--) {
            if (mapRoman.get(romanNum.charAt(i)) >= mapRoman.get(romanNum.charAt(i + 1))){
                result += mapRoman.get(romanNum.charAt(i));
            }else
                result -= mapRoman.get(romanNum.charAt(i));
        }

        return result;
    }

    public String intToRoman(Integer num) {
        StringBuilder result = new StringBuilder();

        if(num < 1 || num > 20)
            throw new IllegalArgumentException("Valores fora do permitido (entre 1 e 20)");

        while (num > 0) {
            if (num >= 10) {
                result.append(mapInt.get(10));
                num -= 10;
            } else if (num >= 5) {
                if (num == 9) {
                    result.append(mapInt.get(9));
                    num -= 9;
                } else {
                    result.append(mapInt.get(5));
                    num -= 5;
                }
            } else{
                if (num == 4) {
                    result.append(mapInt.get(4));
                    num -= 4;
                }else {
                    result.append(mapInt.get(1));
                    num -= 1;
                }
            }
        }
        return result.toString();
    }
}
