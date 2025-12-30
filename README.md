# Run instructions
currently there is no real runnable project bur I created a couple of tests that verify that data is processed correctly.
Assuming the java version is compatible on the target computer it should be sufficient to run `./gradlew test` (Java 21)

# Task 1
### Implement bubble sort
* I used a for loop combined with recursion and an exit flag in order to cut down on unnecessary looping. 
* In a scenario where the list is sorted at an early stage the flag signals an early break, so that there should only 
ever be one pass of a correctly sorted list.

# Task 2
### Update inventory list
* I felt that looping through lists seemed cumbersome, so decided to turn the existing inventory list into a map 
* A HashMap of items offers a reliable set of data that is easily searchable. this allows us to quickly pinpoint the 
data that needs to be updated, or in the case of missing information add it to the data set. 

* I also implemented an interface called `NamedObject` which contains a method signature `public String getName()`. With 
this we are able to modify the bubble sort algorithm from the previous task to work with both the `Item` and `Person` classes by using Java generics

* I also noticed a corner case where from the inventory updates point of view there is no guarantee that the items in 
the list are unique. This could cause issues when updating the list items. In order to handle said corner case I opted to combine the values during the initial map conversion.