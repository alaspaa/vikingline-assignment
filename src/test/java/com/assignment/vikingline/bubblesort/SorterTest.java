package com.assignment.vikingline.bubblesort;

import com.assignment.vikingline.models.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.assignment.vikingline.bubblesort.Sorter.bubbleSortByName;

public class SorterTest {

    @Test
    public void givenListOfNames_whenBubbleSortByNameIsCalled_thenSortedListIsReturned() {
        List<Person> unsortedList = new ArrayList<>(4);
        unsortedList.add(new Person("Liisa"));
        unsortedList.add(new Person("Pelle"));
        unsortedList.add(new Person("Anna"));
        unsortedList.add(new Person("Kalle"));

        List<Person> expectedList = new ArrayList<>(4);
        expectedList.add(new Person("Anna"));
        expectedList.add(new Person("Kalle"));
        expectedList.add(new Person("Liisa"));
        expectedList.add(new Person("Pelle"));

        List<Person> result = bubbleSortByName(unsortedList);

        Assertions.assertThat(result).isEqualTo(expectedList);
    }
}
