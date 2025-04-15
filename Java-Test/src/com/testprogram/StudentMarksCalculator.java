package com.test;

import java.util.*;
import java.util.stream.IntStream;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        int N = 3; // Number of students
        int M = 5; // Number of subjects

        int[][] marks = {
                {75, 76, 65, 87, 87},
                {78, 76, 68, 56, 89},
                {67, 87, 78, 77, 65}
        };

        System.out.println(Arrays.toString(calculateTotalMarks(N, M, marks)));
    }

    public static int[] calculateTotalMarks(int N, int M, int[][] marks) {
        // Step 1: Calculate the average marks for each subject
        double[] subjectAverages = new double[M];

        IntStream.range(0, M).forEach(j ->
                subjectAverages[j] = Arrays.stream(marks).mapToInt(row -> row[j]).average().orElse(0)
        );

        // Step 2: Find the subject index with the lowest average
        int minAvgSubjectIndex = IntStream.range(0, M)
                .reduce((i, j) -> subjectAverages[i] < subjectAverages[j] ? i : j)
                .orElse(0);

        // Step 3: Calculate total marks for each student excluding the lowest average subject
        return Arrays.stream(marks)
                .mapToInt(row -> IntStream.range(0, M)
                        .filter(j -> j != minAvgSubjectIndex)  // Exclude the lowest average subject
                        .map(j -> row[j])
                        .sum()
                ).toArray();
    }
}