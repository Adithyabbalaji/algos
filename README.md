# algos

Java-first repository for Data Structures & Algorithms questions organized by concept.

## Structure

- `com.algos.arrays` - array-focused problems
- `com.algos.strings` - string-focused problems
- `com.algos.graphs` - graph-focused problems
- `com.algos.dp.lcs` - dynamic programming problems (currently Longest Common Subsequence)

## Implemented Problem

### Longest Common Subsequence (LCS)

Class: `com.algos.dp.lcs.LongestCommonSubsequence`

Methods:
- `length(String first, String second)`
- `sequence(String first, String second)`

## Compile and Run Tests

```bash
mkdir -p out
javac -d out $(find src/main/java src/test/java -name "*.java")
java -cp out com.algos.dp.lcs.LongestCommonSubsequenceTest
```
