# Lab Instructions

In this lab we will be practicing retrieving an object from our custom Linked List in `src/main/java/CustomLinkedList.java`. 
We will be implementing the `get()` method which should allow us to retrieve an object by its index in the list. 

The list itself should not be modified in anyway by this operation. 
Be sure to account for invalid indices, which should throw `IndexOutOfBoundsException`.

## Running the Tests

The lab comes with tests that will verify the correct functionality. You can look at the test code to get a better sense of what the lab expects located in `src/test/java/CustomLinkedListTest.java`. 

To run the tests, use Maven via your shell with `mvn test` or in your IDE. The **Run** button on Replit should also run your tests. 

Without editing any code, your first test run should give you output similar too:

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running CustomLinkedListTest
[ERROR] Tests run: 6, Failures: 2, Errors: 4, Skipped: 0, Time elapsed: 0.018 s <<< FAILURE! - in CustomLinkedListTest
[ERROR] whenPerformingOperationSizeDoesNotChange  Time elapsed: 0.01 s  <<< ERROR!
java.lang.Error:
Unresolved compilation problem:
	This method must return a result of type T

	at CustomLinkedListTest.whenPerformingOperationSizeDoesNotChange(CustomLinkedListTest.java:52)
  ```

If you have any issues, try running `mvn dependency:resolve` and then running the tests again. 

If that doesn't work, let avi@revature.com know and do your best without the tests.

## GitHub

You can also fork and clone this lab on [GitHub](https://github.com/revature-curriculum/linked-list-retrieval-lab-java) and submit a pull request when you're done.