package PDF_Exam_Ch6_Working_With_Streams_And_Lambda.Ex01;

import java.util.List;
import java.util.stream.Collectors;

public class Thermometer {
    private String feelsLike;
    private double temp;

    public Thermometer(String feelsLike, double temp) {
        this.feelsLike = feelsLike;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return feelsLike;
    }

    public static void main(String... season) {
        var readings = List.of(
            new Thermometer("HOT!", 72),
            new Thermometer("Too Cold", 0),
            new Thermometer("Just right", 72)
        );

        readings.parallelStream()
            .collect(Collectors.groupingByConcurrent(Thermometer::getTemp))
            .forEach(System.out::println);
    }
}

/*
What is a possible output of the following application?  以下應用程式可能的輸出是什麼？

A) {0.0=[Cold!], 72.0=[Hot!, Just right!]}
B) {0.0=[Cold!], 72.0=[Just right!], 72.0=[HOT!]}
C) The code does not compile because of line k1  程式碼因為第 k1 行無法編譯
D) The code does not compile because of line k2  程式碼因為第 k2 行無法編譯
E) The code does not compile because of line k3  程式碼因為第 k3 行無法編譯
F) None of the above  以上皆非
*/
