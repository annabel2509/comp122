# Whiling away the hours

`while` loops are a core part of controlling the flow of our programs. These will repeatedly execute a block of code _while_ some condition is true.

```
...
boolean lessThanTen = true;

System.out.println("Enter an integer greater than or equal to ten")

while (lessThanTen) {
    myInt = myScanner.nextInt();
    lessThanTen = myInt < 10;

    if lessThanTen {
        System.out.println("That should have been greater than ten, try again...")
    }
}
...
```

{% next %}

## When to while

We should use `while` statements when we do not know how many times a loop will need to run before terminating.

{% spoiler "Hint" %}

We can introduce bugs into our code if we forget to change the condition which is being tested, meaning that the loop runs forever. Infinite while loops can appear as if your program has frozen, when in reality it is executing the same code repeatedly

{% endspoiler %}

## Newtons Method

In `Newton.java`, implement [Newton's method](https://www.wikipedia.com/en/Newton's_method#/Square_root_of_a_number) in the given function `sqRoot()` to give an approximation of the square root of an inputted value of $`n`$.

This algorithm (also called the "Babylonian method"), approximates $`\sqrt{n}`$ by iteratively improving a $`guess`$ for the square root according to the formula:
```math
new\ guess = \frac{(n / guess) + guess}{2}
```

Until the last two values differ by at most, a given precision %`\epsilon`$.

For example, suppose you want to approximate $`\sqrt{n}`$ up to error $`\epsilon=0.0000001`$. If our initial guess is $`1`$, the sequence of guesses would be:

```
1.0
1.5
1.4166666666666665
1.4142156862745097
1.4142135623746899
1.414213562373095
```

These last two numbers differ by less than ϵ\epsilonϵ, so the sequence of guesses stops with the final number as the estimate of $`\sqrt{2}`$​​. By taking $`\epsilon`$ to be smaller, one can get a better estimate of $`\sqrt{2}`$​. Of course, this has limits based on the number of decimal places that the computer can store internally.

{% next %}

## Newtons Method

Your code will take in two positive numbers $`n`$ and $`guess`$ as input using `Scanner.nextDouble()`. It should calculate an $`\epsilon`$-approximation of the square root of $`n`$, when $`\epsilon=0.0000001`$.

Your function should print the square root of $`n`$ and the total number of guesses taken (including the initial guess).

```
java Newton
2.0 1.0
6
1.414213562373095
```

{% spoiler "Hint" %}

You may want to use a `while` loop to compute $`new\ guess`$ and compare it to your previous guess. You can use the function Math.abs() when testing the difference between successive guesses.

{% endspoiler %}


## Submission

These programs will be tested automatically against a range of test cases, so ensure that the output matches the examples given otherwise these are guaranteed to fail.

Once you have completed these exercises submit these in the usual way

check50 liv-ac-uk/comp122/2021/labs/variables
