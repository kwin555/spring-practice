package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm {
    public int[] sort (int [] numbers) {
        return numbers;
    }

}
