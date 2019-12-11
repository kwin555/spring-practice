package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    //Sorting an array
    //Search the array
    //return the result

    public SortingAlgorithm getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    @Autowired
    private SortingAlgorithm sortingAlgorithm;

    public BinarySearchImpl(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }


    public int binarySearch(int[] numbers, int numberToSearch) {
        int [] sortedNums = sortingAlgorithm.sort(numbers);
        System.out.println(sortingAlgorithm);
        return 3;
    }
}
