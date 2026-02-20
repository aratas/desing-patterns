# Design Patterns

A plain Java project for learning and implementing design patterns.

## Strategy Pattern

This project demonstrates the **Strategy Pattern** - a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable.

### Classic Implementation (OOP)

Uses traditional classes implementing the `SortStrategy` interface:
- **BubbleSort, QuickSort, MergeSort** - Concrete strategy implementations
- **Sorter** - Context class that uses strategies
- **StrategyPatternDemo** - Demonstrates switching between sorting algorithms

### Functional Implementation (Lambda)

Uses Java lambdas/functional interfaces for discount calculation strategies:
- **DiscountStrategy** - Functional interface defining the strategy contract
- **PriceCalculator** - Context class using lambda strategies
- **FunctionalStrategyDemo** - Demonstrates dynamic strategy switching with lambdas

### Sealed Implementation (Records + Switch)

Uses a sealed hierarchy with records and pattern-matching switch for shipping strategies:
- **FunctionalSealedStragegyDemo** - Demo using sealed strategies and switch expressions

## Project Structure

```
src/strategy/
├── SortStrategy.java          # Strategy interface
├── BubbleSort.java            # Concrete strategy (Bubble sort)
├── QuickSort.java             # Concrete strategy (Quick sort)
├── MergeSort.java             # Concrete strategy (Merge sort)
├── Sorter.java                # Context class
├── StrategyPatternDemo.java   # Classic demo entry point
└── functional/
    ├── DiscountStrategy.java  # Functional interface
    ├── PriceCalculator.java   # Context class (functional)
    └── FunctionalStrategyDemo.java   # Functional demo entry point
src/strategy/sealed/
└── FunctionalSealedStragegyDemo.java  # Sealed strategy demo entry point
lib/                           # External JAR dependencies
bin/                           # Compiled output
```

## Building and Running

### Compile all classes
```bash
javac -d bin src/strategy/*.java
javac -d bin src/strategy/functional/*.java
javac -d bin src/strategy/sealed/*.java
```

### Run classic demo (OOP)
```bash
java -cp bin strategy.StrategyPatternDemo
```

### Run functional demo (Lambda)
```bash
java -cp bin strategy.functional.FunctionalStrategyDemo
```

### Run sealed demo (Records + Switch)
```bash
java -cp bin strategy.sealed.FunctionalSealedStragegyDemo
```