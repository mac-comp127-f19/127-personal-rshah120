package Basicjava;

import java.util.*;

public class DoNDrills {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= 256; i = i * 2) {
            System.out.println(i);
        }
        int sum = 0;
        System.out.println(0);
        for (int i = 1; i <= 256; i = i * 2) {
            sum = sum + i;
            System.out.println(sum);
        }

    }
}


