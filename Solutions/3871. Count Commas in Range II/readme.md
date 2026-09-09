# 3871. Count Commas in Range II

**Difficulty:** Medium

Given an integer `n`, return the total number of commas used when writing every
integer from `[1, n]` in standard number formatting.

A comma is inserted after every three digits from the right. Numbers below
`1000` contain no commas.

## Examples

### Example 1

```text
Input: n = 1002
Output: 3
```

The numbers `1,000`, `1,001`, and `1,002` each contain one comma.

### Example 2

```text
Input: n = 998
Output: 0
```

Every number from `1` through `998` contains fewer than four digits.

## Approach

For each power of `1000`, count one additional comma for every number from
that threshold through `n`:

- `1000`: the first comma appears.
- `1000000`: a second comma appears.
- `1000000000`: a third comma appears.

For a threshold `start`, the contribution is `n - start + 1`. Continue
multiplying the threshold by `1000` until it exceeds `n`.

The loop checks `start > n / 1000` before multiplication to avoid overflow.

## Correctness

Every number in `[start, n]` has at least one additional comma at the digit
group represented by `start`. Therefore, that threshold contributes exactly
`n - start + 1` commas. Summing this contribution for every threshold
`1000, 1000000, 1000000000, ...` counts each comma exactly once.

## Complexity

- **Time:** $O(\log_{1000} n)$
- **Space:** $O(1)$

## Constraints

- `1 <= n <= 10^15`