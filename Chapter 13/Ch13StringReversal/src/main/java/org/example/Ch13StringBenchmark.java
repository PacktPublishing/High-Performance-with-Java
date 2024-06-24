package org.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
public class Ch13StringBenchmark {

    private String sampleString;

    @Setup
    public void prepare() {
        sampleString = "The quick brown fox jumps over the lazy dog";
    }

    @Benchmark
    public String reverseWithStringBuilder() {
        return new StringBuilder(sampleString).reverse().toString();
    }

    @Benchmark
    public String reverseManually() {
        char[] strArray = sampleString.toCharArray();
        int left = 0;
        int right = strArray.length - 1;
        while (left < right) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left++;
            right--;
        }
        return new String(strArray);
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(Ch13StringBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}

