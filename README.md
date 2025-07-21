# Template Method Pattern Example

This project demonstrates the **Template Method Pattern** using a simple beverage-making example. The pattern defines the skeleton of an algorithm in a superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## How it Works

The `BeverageMaker` abstract class defines the overall algorithm for making a beverage in its `makeBeverage()` method. This method acts as a template, calling a sequence of steps:

1.  `boilWater()`
2.  `brew()`
3.  `pourInCup()`
4.  `addCondiments()`

Some steps are common to all beverages (`boilWater`, `pourInCup`) and are implemented in the `BeverageMaker` class.
Other steps are specific to the type of beverage (`brew`, `addCondiments`) and are declared as `abstract`, forcing subclasses to provide their own implementation.

The `CoffeeMaker` and `TeaMaker` classes extend `BeverageMaker` and provide concrete implementations for the `brew` and `addCondiments` steps, customizing the algorithm for coffee and tea respectively.

## How to Compile and Run

1.  **Compile the Java files:**
    Open a terminal and navigate to the project's root directory (`tpm`). Then, compile the source files into the `tpm` directory:
    ```sh
    javac -d . src/*.java
    ```

2.  **Run the program:**
    Execute the `main` method from the `tpm` package:
    ```sh
    java tpm.Main
    ```

    **Expected Output:**
    ```
    --- Making Coffee ---
    Boiling water
    Dripping coffee through filter
    Pouring into cup
    Adding sugar and milk

    --- Making Tea ---
    Boiling water
    Steeping the tea
    Pouring into cup
    Adding lemon
    ```

## Class Structure

-   **`BeverageMaker.java`**: An abstract class that defines the template method (`makeBeverage`) and the abstract steps that subclasses must implement (`brew`, `addCondiments`).
-   **`CoffeeMaker.java`**: A concrete class that extends `BeverageMaker` and implements the steps for making coffee.
-   **`TeaMaker.java`**: A concrete class that extends `BeverageMaker` and implements the steps for making tea.
-   **`Main.java`**: The entry point of the application, which demonstrates how to use the `CoffeeMaker` and `TeaMaker` classes.
