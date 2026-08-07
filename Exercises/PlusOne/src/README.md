<h1>Plus One</h1>

<p>
You are given a large integer represented as an integer array <code>digits</code>,
where each <code>digits[i]</code> is the <strong>i-th digit</strong> of the integer.
The digits are ordered from the <strong>most significant</strong> to the
<strong>least significant</strong> digit in left-to-right order.
The large integer does not contain any leading zeros.
</p>

<p>
Increment the large integer by <strong>one</strong> and return the resulting array of digits.
</p>

<h2>Examples</h2>

<h3>Example 1</h3>

<p><strong>Input:</strong></p>

```text
digits = [1,2,3]
```

<p><strong>Output:</strong></p>

```text
[1,2,4]
```

<p><strong>Explanation:</strong></p>

<p>
The array represents the integer <strong>123</strong>.
Incrementing by one gives:
</p>

```text
123 + 1 = 124
```

<p>
Thus, the result should be:
<code>[1,2,4]</code>.
</p>

---

<h3>Example 2</h3>

<p><strong>Input:</strong></p>

```text
digits = [4,3,2,1]
```

<p><strong>Output:</strong></p>

```text
[4,3,2,2]
```

<p><strong>Explanation:</strong></p>

<p>
The array represents the integer <strong>4321</strong>.
Incrementing by one gives:
</p>

```text
4321 + 1 = 4322
```

<p>
Thus, the result should be:
<code>[4,3,2,2]</code>.
</p>

---

<h3>Example 3</h3>

<p><strong>Input:</strong></p>

```text
digits = [9]
```

<p><strong>Output:</strong></p>

```text
[1,0]
```

<p><strong>Explanation:</strong></p>

<p>
The array represents the integer <strong>9</strong>.
Incrementing by one gives:
</p>

```text
9 + 1 = 10
```

<p>
Thus, the result should be:
<code>[1,0]</code>.
</p>