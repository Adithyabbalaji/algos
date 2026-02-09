# algos

Java-first repository for Data Structures & Algorithms questions organized by concept.

## Structure

- `com.algos.arrays` - array-focused problems
- `com.algos.arrays.intervals` - interval-pattern array problems
- `com.algos.strings` - string-focused problems
- `com.algos.graphs` - graph-focused problems
- `com.algos.dp.lcs` - dynamic programming problems (currently Longest Common Subsequence)

## Implemented Problems

### Longest Common Subsequence (LCS)

Class: `com.algos.dp.lcs.LongestCommonSubsequence`

Methods:
- `length(String first, String second)`
- `sequence(String first, String second)`

### Longest Palindromic Subsequence (LPS)

Class: `com.algos.dp.lcs.LongestPalindromicSubsequence`

Methods:
- `length(String input)`
- `sequence(String input)`

## Compile and Run Tests

```bash
mkdir -p out
javac -d out $(find src/main/java src/test/java -name "*.java")
java -cp out com.algos.dp.lcs.LongestCommonSubsequenceTest
java -cp out com.algos.dp.lcs.LongestPalindromicSubsequenceTest
```
