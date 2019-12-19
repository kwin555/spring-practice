package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    //Sorting an array
    //Search the array
    //return the result

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    @PostConstruct
    public void postConstruct() {
        logger.info("post construct");
    }

    @PreDestroy
    public void preDestory() {
        logger.info("pre destroy");
    }
}
