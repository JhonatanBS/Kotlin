<h2>
  <a href="https://leetcode.com/problems/missing-number/">Missing Number</a>
</h2>

<h3>Description</h3>

<p>
  Given an array <code>nums</code> containing <code>n</code> distinct numbers
  in the range <code>[0, n]</code>, return <em>the only number in the range
  that is missing from the array.</em>
</p>

<h3>Examples</h3>

<h4>Example 1</h4>

<p><strong>Input:</strong></p>

<pre><code>nums = [3, 0, 1]</code></pre>

<p><strong>Output:</strong></p>

<pre><code>2</code></pre>

<p><strong>Explanation:</strong></p>

<p>
  <code>n = 3</code> since there are 3 numbers, so all numbers are in the
  range <code>[0, 3]</code>. <code>2</code> is the missing number in the
  range since it does not appear in <code>nums</code>.
</p>

<h4>Example 2</h4>

<p><strong>Input:</strong></p>

<pre><code>nums = [0, 1]</code></pre>

<p><strong>Output:</strong></p>

<pre><code>2</code></pre>

<p><strong>Explanation:</strong></p>

<p>
  <code>n = 2</code> since there are 2 numbers, so all numbers are in the
  range <code>[0, 2]</code>. <code>2</code> is the missing number in the
  range since it does not appear in <code>nums</code>.
</p>

<h4>Example 3</h4>

<p><strong>Input:</strong></p>

<pre><code>nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]</code></pre>

<p><strong>Output:</strong></p>

<pre><code>8</code></pre>

<p><strong>Explanation:</strong></p>

<p>
  <code>n = 9</code> since there are 9 numbers, so all numbers are in the
  range <code>[0, 9]</code>. <code>8</code> is the missing number in the
  range since it does not appear in <code>nums</code>.
</p>

<h3>Constraints</h3>

<ul>
  <li><code>n == nums.length</code></li>
  <li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
  <li><code>0 &lt;= nums[i] &lt;= n</code></li>
  <li>All the numbers of <code>nums</code> are <strong>unique</strong>.</li>
</ul>