package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6};
        System.out.println(Arrays.asList(integers).stream().
                filter(x -> x % 2 == 0).map(x -> x * x).reduce(Integer::max));
    }
}
