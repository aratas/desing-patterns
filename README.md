# Design Patterns

A plain Java project for learning and implementing design patterns.

## Strategy Pattern Example

This project demonstrates the **Strategy Pattern** - a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable.

## Project Structure

```
src/strategy/
├── SortStrategy.java          # Strategy interface
├── BubbleSort.java            # Concrete strategy (Bubble sort)
├── QuickSort.java             # Concrete strategy (Quick sort)
├── MergeSort.java             # Concrete strategy (Merge sort)
├── Sorter.java                # Context class
└── StrategyPatternDemo.java   # Main entry point
lib/                           # External JAR dependencies
bin/                           # Compiled output
```

## Building and Running

### Compile all classes
```bash
javac -d bin src/strategy/*.java
```

### Run the demo
```bash
java -cp bin strategy.StrategyPatternDemo
```