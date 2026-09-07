# 940. Distinct Subsequences II

Given a string `s`, return the number of distinct non-empty subsequences of `s`.
Since the answer may be very large, return it modulo $10^9 + 7$.

A subsequence is formed by deleting zero or more characters without changing the
relative order of the remaining characters.

## Examples

### Example 1

```text
Input: s = "abc"
Output: 7
```

The distinct subsequences are `"a"`, `"b"`, `"c"`, `"ab"`, `"ac"`, `"bc"`,
and `"abc"`.

### Example 2

```text
Input: s = "aba"
Output: 6
```

The distinct subsequences are `"a"`, `"b"`, `"ab"`, `"aa"`, `"ba"`, and
`"aba"`.

### Example 3

```text
Input: s = "aaa"
Output: 3
```

The distinct subsequences are `"a"`, `"aa"`, and `"aaa"`.

## Approach

Let `total` be the number of distinct non-empty subsequences found so far.
For each character, every existing subsequence can either exclude or append that
character, creating `total + 1` candidates.

Appending a character can duplicate subsequences created when the same character
appeared earlier. `end[c]` stores how many new subsequences were created the last
time character `c` was processed. Therefore, for the current character `c`:

```text
newSubsequences = total + 1 - end[c]
total += newSubsequences
end[c] = newSubsequences
```

All calculations are performed modulo $10^9 + 7$.

## Correctness

Before processing a character, `total` contains every distinct subsequence that
can be formed from the processed prefix. Appending the character to each of
those subsequences, plus the one-character subsequence, produces all candidates
ending with the current character. Exactly `end[c]` of them were already added
when `c` was processed previously, so subtracting that value removes duplicates.
Updating `end[c]` records the new set of subsequences ending in `c`, preserving
the invariant for the next occurrence.

## Complexity

- Time: $O(n)$
- Space: $O(1)$

## Constraints

- `1 <= s.length <= 2000`
- `s` consists of lowercase English letters.
