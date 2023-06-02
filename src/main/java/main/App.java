package main;

import model.ConvertRomanNumbers;

public class App {
    public static void main(String[] args) {
        ConvertRomanNumbers num = new ConvertRomanNumbers();
        System.out.println(num.romanToInt("VII"));
        System.out.println(num.romanToInt("XVII"));
        System.out.println(num.intToRoman(8));
        System.out.println(num.intToRoman(15));
    }
}
