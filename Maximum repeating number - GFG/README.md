# Maximum repeating number
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>Arr</strong> of size <strong><em>N</em></strong>, the array contains numbers in range from <strong>0 </strong>to<strong> <em>K-1</em></strong> where <strong><em>K</em></strong> is a positive integer and <em><strong>K &lt;= N</strong>.</em> Find the maximum repeating number in this array. If there are two or more maximum repeating numbers return&nbsp;the element<strong> having least value</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, K = 3
Arr[] = {2, 2, 1, 2}
<strong>Output: </strong>2
<strong>Explanation:</strong> 2 is the most frequent
element.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 6, K = 3
Arr[] = {2, 2, 1, 0, 0, 1}
<strong>Output:</strong> 0
<strong>Explanation:</strong>&nbsp;0, 1 and 2 all have same
frequency of 2.But since 0 is smallest,
you need to return 0.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>maxRepeating()</strong>&nbsp;which takes the&nbsp;array of&nbsp;integers&nbsp;<strong>arr,</strong>&nbsp;<strong>n</strong> and <strong>k&nbsp;</strong>as parameters and returns an integer&nbsp;denoting the answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(K)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>7</sup><br>
1 &lt;= K &lt;= N<br>
0 &lt;= Arr<sub>i</sub> &lt;= K - 1</span></p>

<p>&nbsp;</p>
</div>