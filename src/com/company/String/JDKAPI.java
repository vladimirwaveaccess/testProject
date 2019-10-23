package com.company.String;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JDKAPI {
    public static void main(String[] args) {
        String.join(":", "foobar", "foo", "bar");
        // => foobar:foo:bar

        "foobar:foo:bar"
                .chars()//преобразование в массив интов
                .distinct() // удаление повторяющихся символов
                .mapToObj(c -> String.valueOf((char) c)) // приводим результат к строкам
                .sorted() // сортируем строки
                .collect(Collectors.joining()); //преобразовываем результат к строке
        // => :abfor

        Pattern.compile(":") // искомый разделитель
                .splitAsStream("foobar:foo:bar") // разбиение строки на подстроки
                .filter(s -> s.contains("bar")) // поиск строк содержащих "bar"
                .sorted() // сортировка найденных слов
                .collect(Collectors.joining(":")); // объединение в строку результирующих строк
        // => bar:foobar

        Pattern pattern = Pattern.compile(".*@gmail\\.com");
        Stream.of("bob@gmail.com", "alice@hotmail.com")
                .filter(pattern.asPredicate())
                .count();
        // => 1
    }
}
