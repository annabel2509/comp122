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

{% next %}
