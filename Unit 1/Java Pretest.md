# Answers to CodeHS's Java Pretest
### Please don't copy the answers, use them to help you learn, not doing the learning for you. <br>
<br><br>

#### Evaluate the mathematical expression: 18 ÷ 3 + 3 × 3 – 8: <br>
<strong>Answer: 7</strong><br>
<br>

#### What value will be held in mysteryNumber when this code finishes running?<br>

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

#### What is the output of the following program?<br>

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

#### Given this array:

```c
1 2 4 5 6 7 8 12 14 21 22 42 53
```
#### How many comparisons are required to find 42 using the Binary Search?
<strong>Answer: 3</strong><br>
<br>

#### Which of the following are valid arrays?

```java
I.   int[] coolArray = {1, 2, 3};
II.  int[] threeThings = {1.0, 2.0, 3.0};
III. int[] = {"1", "2", "3"};
```
<strong>Answer: I only</strong>
<br>

#### What are parameters?
<br>

<strong>Answer: The formal names given to the data that gets passed into a method.</strong><br>

#### Which for loop will properly print "good luck" 10 times?<br>
<strong>Answer: B</strong><br>

#### In Ms. Garcia’s computer science class, students receive letter grades based on the following scale.

```
Integer Score      	Letter Grade
92 or above	A
From 81 to 91 (inclusive)    	B
From 72 to 80 (inclusive)	C
71 or below	F
```

#### Which of the following code segments will assign the correct string grade for a given integer score?
<br>
<strong>Answer: I and III only</strong><br>

#### Melissa will only drink a cup of coffee if she has slept less than 8 hours or she had to wake up before 6 am.
#### In which of the following cases does Melissa not drink a cup of coffee?
<br>
<strong>Melissa Sleeps for 8 hours and waks up at 7am</strong>
<br>

#### Karel the Dog is instructed to move forward two spaces. Then, if Karel is standing on a ball, Karel will turn left and move forward two spaces. Otherwise, Karel will move forward two spaces. Given the starting point below, where will Karel end up?
<br>
<strong>Answer:</strong>
![Image of the answer](https://codehs.com/uploads/622efbb0ea7fd12d8364e47123fd7e1d)
<br>

#### If x represents the area of the number line colored blue, which inequality accurately reflects the value of x?
<br>
<strong>Answer: x ≤ 8</strong>
<br>

#### Based on this code snippet

```java
public class Shape
{
   public String getShapeName()
   {
       return "Shape";
   }
}

public class Rectangle extends Shape
{
   public String getShapeName()
   {
       return "Rectangle";
   }
}

public class Square extends Rectangle {}

public class Oval extends Shape
{
    public String getShapeName() 
    {
        return "Oval";
    }
}

public class Circle extends Oval
{
    public String getShapeName()
    {
        return "Circle";
    }
}
```

#### What does this program output?

```java
Shape shape1 = new Shape();
Shape shape2 = new Rectangle();
Shape shape3 = new Square();
Shape shape4 = new Circle();

System.out.print(shape1.getShapeName());
System.out.print(shape2.getShapeName());
System.out.print(shape3.getShapeName());
System.out.print(shape4.getShapeName());
```

<strong>Answer: Shape Rectangle Rectangle Circle</strong>
<br>
#### What does this method return?

```java
public int doubleInt(int x)
{
    x * 2;
}
```

`doubleInt(5)`

<strong>Answer: This method is improperly written.</strong>

#### You’re building an e-commerce website. You create a class called Transaction to represent a single purchase on the site.

#### Which of these would not make sense as an instance variable in the Transaction class?

<strong>Answer: private int totalTransactionsToday</strong>
<br>

#### Consider the following program code:

```java
int x = 5;
int y = 8;
int temp = x;
x = y;
y = temp;
```

#### What are the values of x and y as a result of this program code?
<br>
<strong>Answer:
x has a value of 8
y has a value of 5</strong>