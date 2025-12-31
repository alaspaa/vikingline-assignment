package com.assignment.vikingline.bubblesort;

import com.assignment.vikingline.models.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.assignment.vikingline.bubblesort.BubbleSort.bubbleSortByName;

public class BubbleSortTest {

    @Test
    public void givenListOfNames_whenBubbleSortByNameIsCalled_thenSortedListIsReturned() {
        List<Person> unsortedList = new ArrayList<>(
                Arrays.asList(
                        new Person("Liisa"),
                        new Person("Pelle"),
                        new Person("Anna"),
                        new Person("Kalle")
                )
        );

        List<Person> expectedList = new ArrayList<>(
                Arrays.asList(
                        new Person("Anna"),
                        new Person("Kalle"),
                        new Person("Liisa"),
                        new Person("Pelle")
                )
        );

        List<Person> result = bubbleSortByName(unsortedList);

        Assertions.assertThat(result).isEqualTo(expectedList);
    }
}
