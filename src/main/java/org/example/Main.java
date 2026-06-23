package org.example;

public class Main {

    // Palindrom kontrolü
    public static boolean isPalindrome(int sayi) {
        sayi = Math.abs(sayi);
        int original = sayi;
        int ters = 0;
        while (sayi > 0) {
            int sonRakam = sayi % 10;
            ters = ters * 10 + sonRakam;
            sayi = sayi / 10;
        }
        return ters == original;
    }

    // Mükemmel sayı kontrolü
    public static boolean isPerfectNumber(int sayi) {
        if (sayi < 1) {
            return false;
        }
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }

    // Sayıyı kelimelere çevirme
    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String numStr = String.valueOf(sayi);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }
}
