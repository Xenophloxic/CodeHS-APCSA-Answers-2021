# Answers to CodeHS's Java Pretest
### Please don't copy the answers, use them to help you learn, not doing the learning for you. <br>
<br><br>
##### Evaluate the mathematical expression: 18 ÷ 3 + 3 × 3 – 8: <br>
<strong>Answer: 7</strong><br>
<br>
##### What value will be held in mysteryNumber when this code finishes running?<br>
```java
int mysteryNumber = 0;
String[] mysteryArray = {"Finn", "Jake", "Bubblegum"};
for(int i = 0; i < mysteryArray.length; i++)
{
    mysteryNumber += mysteryArray[i].length();
}
```
<strong>Answer: 17</strong><br>
<br>
##### What is the output of the following program?<br>
```java
public class Main
{
    private String str = "dog";

   /*Use public static void main() to replace the line below   
      outside of the CodeHS platform.*/
    public void run() 
    {
        Main m = new Main("cat");
        System.out.println(m.getString());
    }

    public Main(String str)
    {
        str = str;
    }

    public String getString()
    {
        return str;
    }
}
```
<strong>Answer: dog</strong><br>
<br>
##### Given this array:
```c
1 2 4 5 6 7 8 12 14 21 22 42 53
```
##### How many comparisons are required to find 42 using the Binary Search?
<strong>Answer: 3</strong><br>
<br>
##### Which of the following are valid arrays?
```java
I.   int[] coolArray = {1, 2, 3};
II.  int[] threeThings = {1.0, 2.0, 3.0};
III. int[] = {"1", "2", "3"};
```
<strong>Answer: I only</strong>
<br>
##### What are parameters?
<br>
<strong>Answer: The formal names given to the data that gets passed into a method.</strong>
