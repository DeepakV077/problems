# 3870. Count Commas in Range

**Difficulty:** Easy
You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

A comma is inserted after every three digits from the right.
Numbers with fewer than 4 digits contain no commas.

## Examples

Example 1:

```text
Input: n = 1002

Output: 3
```

The numbers `1,000`, `1,001`, and `1,002` each contain one comma, giving a total of 3.

Example 2:

```text
Input: n = 998

Output: 0
```

## Approach

Numbers from `1` through `999` do not contain commas. Starting at `1,000`, each
number contributes exactly one comma within the problem constraints.

Therefore, the count is the number of integers in the range `[1000, n]`:

```text
max(0, n - 999)
```

If `n` is less than `1000`, the result is `0`; otherwise, every value from
`1000` through `n` contributes one comma.

## Correctness

There are no commas in any number less than `1000`. For every number from
`1000` through `n`, standard formatting inserts exactly one comma. The number
of values in that inclusive range is `n - 1000 + 1`, which simplifies to
`n - 999`. Taking the maximum with `0` handles the case where `n < 1000`.

Thus, `max(0, n - 999)` returns the total number of commas.

## Complexity

- **Time:** $O(1)$
- **Space:** $O(1)$