package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
    @Qualifier("bubble")
    private SortingAlgorithm sortingAlgorithm;

    public BinarySearchImpl(SortingAlgorithm bubbleSortAlgorithm) {
        this.sortingAlgorithm = bubbleSortAlgorithm;
    }


    public int binarySearch(int[] numbers, int numberToSearch) {
        int [] sortedNums = sortingAlgorithm.sort(numbers);
        System.out.println(sortingAlgorithm);
        return 3;
    }
}
