package com.company.String;

public class StringDemo {
    public static void main(String[] args) {
//        compareStrings("I like Java!!!");
//        compareStrings("I like .Net!!!");
//        printLastCharacter("ABCDE");
//        findPosition("I like Java!!!");
//        replaceSymbol("I like Java!!!");
//        goToLowerCase("I like Java!!!");
//        goToUpperCase("I like Java!!!");
        subString("I like Java!!!");
    }

    /**
     * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
     * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
     * @param str
     */
    public static void compareStrings(String str) {
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
    }

    /**
     *  Распечатать последний символ строки. Используем метод String.charAt().
     * @param str
     */
    public static void printLastCharacter(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    /**
     * Найти позицию подстроки “Java” в строке “I like Java!!!”
     * @param str
     */
    public static void findPosition(String str) {
        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("Java"));
    }

    /**
     * Заменить все символы “а” на “о”.
     * @param str
     */
    public static void replaceSymbol(String str) {
        System.out.println(str.replace("a", "o"));
    }

    /**
     * Преобразуйте строку к верхнему регистру.
     * @param str
     */
    public static void goToUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    /**
     * Преобразуйте строку к нижнему регистру.
     * @param str
     */
    public static void goToLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    /**
     * Вырезать строку Java c помощью метода String.substring()
     * @param str
     */
    public static void subString(String str) {
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 11));
    }


}
