# Java Practice

A Java practice repository for building syntax fluency and core problem-solving patterns before moving deeper into LeetCode and backend interview preparation.

## Current topics

- Basic `for` loop syntax
- Counting up and down
- Counters
- Accumulators
- `%` / divisibility checks
- Arrays, indexes, and `.length`
- Indexed array traversal
- Counting even values
- Summing even values
- Finding minimum and maximum values
- Finding the largest even value safely
- Enhanced `for-each` loops

## Project structure

```text
src/main/java/fundamentals/
```

Each concept is kept in its own runnable Java file.

## Compile

From the repository root:

```bash
javac -d out src/main/java/fundamentals/*.java
```

## Run an example

```bash
java -cp out fundamentals.MaxValuePractice
```

Swap `MaxValuePractice` for any other class name in the folder.

## Learning rule

Attempt each exercise from memory before checking an earlier solution. The goal is to make common Java syntax and patterns automatic, not merely recognizable.

## Git habit

Commit after a meaningful concept or exercise is complete.

Examples:

```text
Practice indexed for loops with arrays
Add counter and accumulator exercises
Practice min and max array scans
Add conditional max-even exercise
Practice enhanced for-each loops
```
