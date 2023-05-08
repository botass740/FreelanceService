package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceSevicesTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/freelance.csv")
    public void countRestMonthPart1(int expected, int income, int expenses, int threshold) {
        FreelanceSevices service = new FreelanceSevices();

        int actual = FreelanceSevices.calculate(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void countRestMonthPart2() {
//        FreelanceSevices service = new FreelanceSevices();
//
//        int actual = FreelanceSevices.calculate(100_000, 60_000, 150_000);
//        int expected = 2;
//
//        Assertions.assertEquals(expected, actual);
//    }

}