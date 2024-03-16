import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.DoubleStream;

public class pboLinkedList {
    public static void main(String[] args) {
        double[][] data = {
                {91.35, 4.75, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
                {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
                {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

        double[] dataKedua = Arrays.stream(data)
                .flatMapToDouble(DoubleStream::of)
                .toArray();

        List<Double> linkedList = new LinkedList<>(Arrays.asList(Arrays.stream(dataKedua).boxed().toArray(Double[]::new)));

        System.out.println("\nLinked List: " + linkedList);

        double max = Arrays.stream(dataKedua).max().orElse(Double.NaN);
        double min = Arrays.stream(dataKedua).min().orElse(Double.NaN);
        double sum = Arrays.stream(dataKedua).sum();
        double average = Arrays.stream(dataKedua).average().orElse(Double.NaN);

        System.out.println("Nilai MAX: " + max);
        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai SUM: " + sum);
        System.out.println("Nilai RATA-RATA: " + average);
    }
}
