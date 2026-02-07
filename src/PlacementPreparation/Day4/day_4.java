package PlacementPreparation.Day4;

public class day_4 {
    /*
    problem solving:

### **Length of The Array**

Difficulty: **Basic**Accuracy: **72.39%**Submissions: **17K+**Points: **1**

You are given an array **arr[]** that contains integers. You need to **return** the **length** of the array.

**Examples:**

```
Input: arr[] = [54, 43, 2, 1, 5]
Output: 5
Explanation: The array contains 5 elements, so its length is 5.
```

```
Input:arr[] = [324, 5, 2, 2]
Output:4
Explanation: The array contains 4 elements, so its length is 4.
```

```java
class Solution {
    public static int arrayLength(int[] arr) {
        return arr.length;
    }
}

```

### **Array Traversal**

Difficulty: **Basic**Accuracy: **69.26%**Submissions: **27K+**Points: **1**

You are given an array **arr[]** that contains integers. You need to print the elements of the array in a single line with a space between them.Note: Don't add a new line at the end.

**Examples:**

```
Input: arr[] = [54, 43, 2, 1, 5]
Output: 54 43 2 1 5
Explanation: Just traverse and print the numbers.
```

```
Input:arr[] = [324, 5, 2, 2]
Output:324 5 2 2
Explanation: Just traverse and print the numbers.
```

```java
class Solution {
    public static void arrayTraversal(int[] arr) {
        // Code here
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

```

### **For-Each Loop**

Difficulty: **Basic**Accuracy: **75.22%**Submissions: **9K+**Points: **1**

Given an array of Strings **arr[].** Use **For-Each** loop to print each string in the array in a new line.

**Examples:**

```
Input:arr[] = [ "Hello", "World", "Geeks", "For", "Geeks" ]
Output:
Hello
World
Geeks
For
Geeks
Explanation:All Strings of array are printed in a new line.
```

```
Input: arr[] = [ "Legends" ]
Output:Legends
Explanation:Only string is printed in a new line.
```

```java
class Solution {
    public void printArray(String[] arr) {
        // Code here
        for(String x : arr){
            System.out.println(x);
        }
    }
}
```

### **Array Traversal Reverse**

Difficulty: **Easy**Accuracy: **70.16%**Submissions: **36K+**Points: **2**

You are given an array **arr[]** that contains integers. You need to print the elements of the array with in reverse order with a in a single line with space between them.Note: Don't print a new line at the end.

**Examples:**

```
Input: arr[] = [54, 43, 2, 1, 5]
Output: "5 1 2 43 54 "
Explanation: Just traverse in reverse and print the numbers.
```

```
Input:arr[] = [324, 5, 2, 2]
Output: "2 2 5 324 "
Explanation: Just traverse in reverse and print the numbers.
```

```java
class Solution {
    public static void arrayTraversalReverse(int[] arr) {
        // Code here
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

```

### **Decrement Array Values**

Difficulty: **Easy**Accuracy: **73.37%**Submissions: **29K+**Points: **2**

You are given an array **arr[]** that contains integers. You need to decrement each element of the array by 1 and return the array.

**Examples:**

```
Input: arr[] = [54, 43, 2, 1, 5]
Output: 53 42 1 0 4
Explanation: Just decrement the numbers by 1.
```

```
Input:arr[] = [324, 5, 2, 2]
Output:323 4 1 1
Explanation: Just decrement the numbers by 1.
```

```java
class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int[] res = new int[arr.length];
        int ind = 0;
        for(int i=0;i<arr.length;i++){
            res[ind++] = arr[i]-1;
        }
        return res;
    }
}
```

### **Check if array is sorted**

Difficulty: **Easy**Accuracy: **39.37%**Submissions: **348K+**Points: **2**Average Time: **15m**

Given an array **arr[]**, check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

**Examples:**

```
Input:arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
```

```
Input:arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
```

**Constraints:**1 ≤ arr.size ≤ 106- 109 ≤ arr[i] ≤ 109

```java
class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1] <= arr[i]){

            }else{
                return false;
            }
        }
        return true;
    }
}
```

### **Largest in Array**

Difficulty: **Basic**Accuracy: **67.48%**Submissions: **566K+**Points: **1**Average Time: **20m**

Given an array **arr[].** The task is to find the largest element and return it.

**Examples:**

```
Input:arr[] = [1, 8, 7, 56, 90]
Output:90
Explanation:The largest element of the given array is 90.
```

```
Input:arr[] = [5, 5, 5, 5]
Output:5
Explanation:The largest element of the given array is 5.
```

```
Input:arr[] = [10]
Output:10
Explanation:There is only one element which is the largest.
```

**Constraints:**1 <= arr.size()<= 1060 <= arr[i] <= 106

```java
class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}

```

### **Sum All Array Elements**

Difficulty: **Easy**Accuracy: **80.38%**Submissions: **31K+**Points: **2**

You are given an array that contains integers. You need to return the sum of all array elements.

**Examples:**

```
Input: arr[] = [54, 43, 2, 1, 5]
Output: 105
Explanation: Just sum it 54+43+2+1+5=105.
```

```
Input:arr[] = [324, 5, 2, 2]
Output:333
Explanation: Just sum it 324+5+2+2=333.
```

```java
class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }
}
```

### **Average**

Difficulty: **Easy**Accuracy: **45.92%**Submissions: **35K+**Points: **2**

You are given an array **arr[]** **that contains integers. You need to **return average** of the **non negative** integers in **double** format.

**Examples:**

```
Input: arr[] = [-12, 8, -7, 6, 12, -9, 14]
Output:10.0
Explanation: The positive numbers are 8 6 12 14. The sum is 8+6+12+14 = 40, Average = 40/4 = 10.0
```

```
Input: arr[] = [1, 2, 3]
Output:2.0
Explanation: The positive numbers are 1 2 3. The sum is 1+2+3 = 6, Average = 6/3 = 2.0
```

```java
class Solution {
    public static double posAverage(int[] arr) {
        int cnt = 0;
        int res = 0;
        for(int x : arr){
            if(x >= 0){
                cnt++;
                res += x;
            }
        }

        return (double)res/cnt;
    }
}

```

### **Row Sum in a Matrix**

Difficulty: **Easy**Accuracy: **71.79%**Submissions: **7K+**Points: **2**

Given a 2-D integer matrix **mat[][]** of size **n*****m**. Return a list of integers where **list[i]** represents the sum of elements of the **ith** row of the matrix.

**Note:** The sum of any row will remain within the range of an integer

**Examples:**

```
Input:mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]Output:[6, 15, 24]
Explanation:Row 1 -> 1+2+3=6, Row 2 -> 4+5+6=15, Row 3 -> 7+8+9=24
```

```
Input:mat = [[1, 2], [10, 2], [3, 3]]Output:[3, 12, 6]
Explanation:Row 1 -> 1+2=3, Row 2 -> 10+2=12, Row 3 -> 3+3=6
```

**Constraints:**1  <=  n, m  <=  1000

```java
class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int n = mat.length;
        int[] res = new int[n];
        int ind = 0;
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[i].length;j++){
                sum += mat[i][j];
            }
            res[ind++] = sum;
        }
        return res;
    }
}
```

### **Column Sum in a Matrix**

Difficulty: **Easy**Accuracy: **60.77%**Submissions: **8K+**Points: **2**

Given a 2-D integer matrix **mat[][]** of size **n*****m**. Return a list of integers where **list[i]** represents the sum of elements of the **ith** column of the matrix.

**Examples:**

```
Input:mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]Output:[12, 15, 18]
Explanation:Column 1 -> 1+4+7=12, Column 2 -> 2+5+8=15, Column 3 -> 3+6+9=18
```

```
Input:mat = [[1, 2], [10, 2], [3, 3]]Output:[14, 7]
Explanation:Column 1 -> 1+10+3=14, Column 2 -> 2+2+3=7
```

**Constraints:**1  <=  n, m  <=  1000

```java
class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int n = mat.length;
        int m = mat[0].length;

        int[] res = new int[m];
        int ind = 0;
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += mat[j][i];
            }
            res[ind++] = sum;
        }
        return res;
    }
}
```

### **Print Matrix in snake Pattern**

Difficulty: **Easy**Accuracy: **68.08%**Submissions: **86K+**Points: **2**Average Time: **15m**

Given a matrix **mat[][]** of size **n x n**

. Print the elements of the matrix in the snake like pattern depicted below.

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701263/Web/Other/blobid0_1749128162.webp)

**Examples :**

```
Input: n = 3, mat[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
Output: [45, 48, 54, 87, 89, 21, 70, 78, 15]
Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15].
```

```
Input: n = 2, mat[][] = [[1, 2], [3, 4]]Output: [1, 2, 4, 3]Explanation: Printing it in snake pattern will give output as [1, 2, 4, 3]..
```

**Constraints:**1 <= n <= 1031 <= mat[i][j] <= 109

```java
// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        boolean rightToLeft = false;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(!rightToLeft){
                L_R(matrix[i],li);
                rightToLeft = true;
            }else{
                R_L(matrix[i],li);
                rightToLeft = false;
            }
        }
        return li;

    }

    public static void L_R(int[] arr,ArrayList<Integer> res){
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
    }

    public static void R_L(int[] arr,ArrayList<Integer> res){
        for(int i=arr.length-1;i>=0;i--){
            res.add(arr[i]);
        }
    }

}
```

### **Row with Minimum 1s**

Difficulty: **Easy**Accuracy: **25.0%**Submissions: **82K+**Points: **2**Average Time: **8m**

Given a 2D **binary matrix**(1-based indexed) **mat** of dimensions **nxm** , determine the **row** that contains the **minimum number** of **1's**.**Note:** The matrix contains only **1's** and **0's**. Also, if two or more rows contain the **minimum number** of **1's**, the answer is the **lowest** of those **indices**.

**Examples :**

```
Input:mat = [[1, 1, 1, 1], [1, 1, 0, 0], [0, 0, 1, 1], [1, 1, 1, 1]]
Output:2
Explanation:Rows 2 and 3 contain the minimum number of 1's (2 each). Since, row 2 is less than row 3. Thus, the answer is 2.
```

```
Input:mat = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
Output:1
Explanation:All the rows contain the same number of 1's (0 each). Among them, index 1 is the smallest, so the answer is 1.
```

**Constraints:**1 <= n,m <= 1000

0 <= mat[i][j] <= 1

```java
class Solution {
    int minRow(int mat[][]) {
        // code here
        int ind = -1;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++){
            int cnt = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt < max){
                ind = i;
                max = cnt;
            }
        }
        return ind+1;
    }
};
```

### **Magic Square**

Difficulty: **Medium**Accuracy: **44.63%**Submissions: **6K+**Points: **4**Average Time: **15m**

Given a **n*n** matrix **mat[][]** ,check whether the matrix is a **magic square** or not.

> A Magic Square is a n x n matrix of distinct elements from 1 to n2 where the sum of any row, column, or diagonal is always equal to the same number.
>

**Examples:**

```
Input:mat = [[2, 7, 6], [9, 5, 1], [4, 3, 8]]
Output:"Magic Square"
Explanation:R1->2+7+6=15, R2->9+5+1=15, R3->4+3+8=15
             C1->2+9+4=15, C2->7+5+3=15, C3->6+1+8=15
             D1->2+5+8=15, D2=6+5+4=15
```

```
Input: mat = [[1, 2], [3, 4]]
Output:"Not a Magic Square"
Explanation:Sum of all rows and columns are not same.
```

```
Input: mat = [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
Output:"Not a Magic Square"
Explanation:All sums are same but all elements from 1 to n2 are not present.
```

**Constraints:**1  <=  mat.length  <= 1000

```java
class Solution {
    public String magicSquare(int[][] mat) {
        int n = mat.length;

        // Step 1: Expected sum (sum of first row)
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += mat[0][j];
        }

        // Step 2: Check rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum != magicSum) {
                return "Not a Magic Square";
            }
        }

        // Step 3: Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += mat[i][j];
            }
            if (colSum != magicSum) {
                return "Not a Magic Square";
            }
        }

        // Step 4: Check diagonals
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += mat[i][i];
            diag2 += mat[i][n - 1 - i];
        }
        if (diag1 != magicSum || diag2 != magicSum) {
            return "Not a Magic Square";
        }

        // Step 5: Check distinct numbers from 1 to n^2
        boolean[] visited = new boolean[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                if (val < 1 || val > n * n || visited[val]) {
                    return "Not a Magic Square";
                }
                visited[val] = true;
            }
        }

        return "Magic Square";
    }
}

```

---

---

# Java Output Prediction Exercises (50 Questions)

I'll provide 50 code snippets with questions about their output. Try to predict what each will print before looking at the answers.

## **Basic Concepts (Questions 1-10)**

### 1. **Primitive Types and Operators**

```java
public class Q1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double c = 5.0 / 2;
        System.out.println(a / b + " " + c);
    }
}
```

### 2. **Increment/Decrement**

```java
public class Q2 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++ + " " + ++x + " " + x);
    }
}
```

### 3. **Type Casting**

```java
public class Q3 {
    public static void main(String[] args) {
        int i = 100;
        byte b = (byte) i;
        byte c = (byte) 130;
        System.out.println(b + " " + c);
    }
}
```

### 4. **String Concatenation**

```java
public class Q4 {
    public static void main(String[] args) {
        System.out.println(10 + 20 + "Hello");
        System.out.println("Hello" + 10 + 20);
    }
}
```

### 5. **Boolean Operations**

```java
public class Q5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println((a && b) || (c && !b));
    }
}
```

### 6. **Ternary Operator**

```java
public class Q6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int max = (x > y) ? x : (x == y) ? 0 : y;
        System.out.println(max);
    }
}
```

### 7. **Short-circuit Evaluation**

```java
public class Q7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (++a < 5 && ++b > 10) {
            System.out.println("Inside");
        }
        System.out.println(a + " " + b);
    }
}
```

### 8. **Bitwise Operators**

```java
public class Q8 {
    public static void main(String[] args) {
        int x = 5;  // 0101
        int y = 3;  // 0011
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
    }
}
```

### 9. **Shift Operators**

```java
public class Q9 {
    public static void main(String[] args) {
        int x = 8;  // 1000
        System.out.println(x >> 1);
        System.out.println(x << 1);
        System.out.println(x >>> 1);
    }
}
```

### 10. **Operator Precedence**

```java
public class Q10 {
    public static void main(String[] args) {
        int result = 10 + 20 * 30 - 40 / 5 % 3;
        System.out.println(result);
    }
}
```

## **Control Flow (Questions 11-20)**

### 11. **If-Else**

```java
public class Q11 {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("A");
        } else if (x > 8) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
```

### 12. **Switch Case**

```java
public class Q12 {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1: System.out.println("Mon");
            case 2: System.out.println("Tue");
            case 3: System.out.println("Wed"); break;
            default: System.out.println("Other");
        }
    }
}
```

### 13. **Switch with Strings**

```java
public class Q13 {
    public static void main(String[] args) {
        String color = "RED";
        switch (color) {
            case "RED": System.out.print("R");
            case "GREEN": System.out.print("G");
            case "BLUE": System.out.print("B"); break;
            default: System.out.print("X");
        }
    }
}
```

### 14. **For Loop**

```java
public class Q14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            if (i == 4) break;
            System.out.print(i + " ");
        }
    }
}
```

### 15. **Enhanced For Loop**

```java
public class Q15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            num = num * 2;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

### 16. **While Loop**

```java
public class Q16 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
            if (i == 3) break;
        }
    }
}
```

### 17. **Do-While Loop**

```java
public class Q17 {
    public static void main(String[] args) {
        int x = 5;
        do {
            System.out.print(x + " ");
            x--;
        } while (x > 0);
        System.out.println(x);
    }
}
```

### 18. **Nested Loops**

```java
public class Q18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

### 19. **Labeled Break**

```java
public class Q19 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) break outer;
                System.out.println(i + "," + j);
            }
        }
    }
}
```

### 20. **Complex Loop**

```java
public class Q20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) continue;
                if (i + j == 10) break;
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## **Arrays and Strings (Questions 21-30)**

### 21. **Array Declaration**

```java
public class Q21 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0] + " " + arr[3] + " " + arr.length);
    }
}
```

### 22. **Multi-dimensional Array**

```java
public class Q22 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[2][1]);
    }
}
```

### 23. **Array Reference**

```java
public class Q23 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 10;
        System.out.println(a[1]);
    }
}
```

### 24. **String Immutability**

```java
public class Q24 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        s1 = s1 + " World";
        System.out.println(s1);
        System.out.println(s2);
    }
}
```

### 25. **String Pool**

```java
public class Q25 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
```

### 26. **String Methods**

```java
public class Q26 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(6));
        System.out.println(str.indexOf('o'));
        System.out.println(str.lastIndexOf('o'));
    }
}
```

### 27. **StringBuilder**

```java
public class Q27 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.delete(11, 12);
        System.out.println(sb);
    }
}
```

### 28. **Array of Strings**

```java
public class Q28 {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue"};
        colors[1] = colors[1].toLowerCase();
        for (String color : colors) {
            System.out.print(color + " ");
        }
    }
}
```

### 29. **Array Copy**

```java
public class Q29 {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] dest = new int[5];
        System.arraycopy(source, 1, dest, 0, 3);
        for (int num : dest) {
            System.out.print(num + " ");
        }
    }
}
```

### 30. **Command Line Arguments**

```java
public class Q30 {
    public static void main(String[] args) {
        // Assume args = {"A", "B", "C"}
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
// To test: java Q30 A B C
```

## **Methods and Classes (Questions 31-40)**

### 31. **Method Overloading**

```java
public class Q31 {
    static void print(int x) { System.out.println("int: " + x); }
    static void print(double x) { System.out.println("double: " + x); }
    static void print(Integer x) { System.out.println("Integer: " + x); }

    public static void main(String[] args) {
        print(10);
        print(10.0);
        print(Integer.valueOf(10));
    }
}
```

### 32. **Pass by Value**

```java
public class Q32 {
    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int num = 50;
        change(num);
        System.out.println(num);
    }
}
```

### 33. **Pass by Reference (Array)**

```java
public class Q33 {
    static void change(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        change(nums);
        System.out.println(nums[0]);
    }
}
```

### 34. **Variable Arguments**

```java
public class Q34 {
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum());
    }
}
```

### 35. **Recursion**

```java
public class Q35 {
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
```

### 36. **Static vs Instance**

```java
public class Q36 {
    static int count = 0;
    int id;

    Q36() {
        count++;
        id = count;
    }

    public static void main(String[] args) {
        Q36 obj1 = new Q36();
        Q36 obj2 = new Q36();
        Q36 obj3 = new Q36();

        System.out.println(obj1.id);
        System.out.println(obj2.id);
        System.out.println(Q36.count);
    }
}
```

### 37. **Constructor Chaining**

```java
public class Q37 {
    Q37() {
        this(10);
        System.out.println("Default");
    }

    Q37(int x) {
        this(x, 20);
        System.out.println("One param");
    }

    Q37(int x, int y) {
        System.out.println("Two params: " + x + ", " + y);
    }

    public static void main(String[] args) {
        new Q37();
    }
}
```

### 38. **Initialization Blocks**

```java
public class Q38 {
    static { System.out.println("Static block"); }
    { System.out.println("Instance block"); }

    Q38() { System.out.println("Constructor"); }

    public static void main(String[] args) {
        System.out.println("Main start");
        new Q38();
        System.out.println("Main end");
    }
}
```

### 39. **Method Overriding (Basic)**

```java
class Parent {
    void show() { System.out.println("Parent"); }
}

class Child extends Parent {
    void show() { System.out.println("Child"); }
}

public class Q39 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
```

### 40. **Polymorphism**

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}

class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}

public class Q40 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal a : animals) {
            a.sound();
        }
    }
}
```

## **Advanced Concepts (Questions 41-50)**

### 41. **Interface**

```java
interface Drawable {
    void draw();
    default void msg() { System.out.println("Drawable"); }
}

class Circle implements Drawable {
    public void draw() { System.out.println("Drawing circle"); }
}

public class Q41 {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        d.msg();
    }
}
```

### 42. **Abstract Class**

```java
abstract class Shape {
    abstract void draw();
    Shape() { System.out.println("Shape created"); }
}

class Square extends Shape {
    void draw() { System.out.println("Drawing square"); }
}

public class Q42 {
    public static void main(String[] args) {
        Shape s = new Square();
        s.draw();
    }
}
```

### 43. **Exception Handling**

```java
public class Q43 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Rest of code");
    }
}
```

### 44. **Multiple Catch Blocks**

```java
public class Q44 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
```

### 45. **Throw Keyword**

```java
public class Q45 {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid");
        } else {
            System.out.println("Welcome");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println("Rest of code");
    }
}
```

### 46. **Wrapper Classes**

```java
public class Q46 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }
}
```

### 47. **Autoboxing/Unboxing**

```java
public class Q47 {
    public static void main(String[] args) {
        Integer i1 = 10;  // Autoboxing
        int i2 = i1;      // Unboxing
        Integer i3 = i1 + i2;  // Unboxing, addition, autoboxing

        System.out.println(i1 + " " + i2 + " " + i3);
    }
}
```

### 48. **Enum**

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class Q48 {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch(today) {
            case MONDAY: System.out.println("Start"); break;
            case TUESDAY: System.out.println("Middle"); break;
            case WEDNESDAY: System.out.println("End"); break;
        }

        System.out.println(today.ordinal());
        System.out.println(today.name());
    }
}
```

### 49. **Collections - ArrayList**

```java
import java.util.ArrayList;

public class Q49 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1, 3);
        list.remove(0);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
```

### 50. **Final Keyword**

```java
public class Q50 {
    final int x = 10;
    final int y;

    Q50() {
        y = 20;
    }

    void modify() {
        // x = 30;  // Error - final variable
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        new Q50().modify();
    }
}
```

## **Answer Key**

1. `2 2.5`
2. `5 7 7`
3. `100 -126`
4. `30Hello`, `Hello1020`
5. `true`
6. `20`
7. `6 10`
8. `1`, `7`, `6`
9. `4`, `16`, `4`
10. `609`
11. `A`
12. `Tue`, `Wed`
13. `RGB`
14. `0 1 3`
15. `1 2 3 4 5`
16. `1 2`
17. `5 4 3 2 1 0`
18. `1`, `1 2`, `1 2 3`
19. `0,0`, `0,1`, `0,2`, `1,0`
20. `90`
21. `1 0 5`
22. `3`, `2`, `6`
23. `10`
24. `Hello World`, `Hello`
25. `true`, `false`, `true`
26. `11`, `e`, `World`, `4`, `7`
27. `Hello, World`
28. `Red green Blue`
29. `2 3 4 0 0`
30. `3`, `A B C` (when run with args)
31. `int: 10`, `double: 10.0`, `Integer: 10`
32. `50`
33. `100`
34. `6`, `15`, `0`
35. `120`
36. `1`, `2`, `3`
37. `Two params: 10, 20`, `One param`, `Default`
38. `Static block`, `Main start`, `Instance block`, `Constructor`, `Main end`
39. `Child`
40. `Animal sound`, `Bark`, `Meow`
41. `Drawing circle`, `Drawable`
42. `Shape created`, `Drawing square`
43. `ArrayIndex`, `Finally`, `Rest of code`
44. `Arithmetic Exception`
45. `Caught: Not valid`, `Rest of code`
46. `true`, `false`, `true`, `true`
47. `10 10 20`
48. `End`, `2`, `WEDNESDAY`
49. `3 2`
50. `10 20`

**Tips for Practice:**

1. Try to predict the output before running the code
2. Pay attention to tricky concepts like:
    - Post-increment vs pre-increment
    - String immutability and string pool
    - Pass by value vs pass by reference
    - Exception handling flow
    - Static vs instance members
3. Write and execute the code yourself to verify your predictions
4. Modify the code to test edge cases

Good luck with your practice!

---

---

# [**125. Valid Palindrome**](https://leetcode.com/problems/valid-palindrome/)

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a **palindrome**, or* `false` *otherwise*.

**Example 1:**

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```

**Example 2:**

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```

**Example 3:**

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```

**Constraints:**

- `1 <= s.length <= 2 * 105`
- `s` consists only of printable ASCII characters.

    ```java
    class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            s = s.replaceAll("[^a-z0-9]","");
            int len = s.length();

            int start = 0,end = len-1;
            while(start < end){
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
    ```


---
    * */
}
