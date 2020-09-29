# Loops

In almost all imperative programs of any complexity we must repeat a section of code a fixed number of times.

The most usual method of doing this in C like languages (such as Java) is with a `for` loop.

{% next %}

## What's It All For?

A `for` loop has the same normal syntax, we define an initial state (setting integer `i` to 0), the state when we should terminate (how we should break out of the loop, when `i=10`), and an action to take on each iteration of the loop (increase the value of `i` by one each time).

```
for(int i = 0; i < 5; i++) {
    System.out.println("I've said 'Hello there' " + i + " times previously!");
}
```

Complete the program Hello.java so that it prompts the user for an integer, $`n`$, and then print the phrase to the terminal $`n`$ times. The output of your program should be as below:

```
$ java Hello
2                                               // User Input
I've said 'Hello there' 0 times previously!     // Console Output
I've said 'Hello there' 1 times previously!
```

{% next %}

## As A Matter of Factorial

Factorials are a useful tool in combinatorics, algebra, calculus, probability theory, and number theory. They're pretty neat.

We calculate the factorial of a positive integer $`n`$ by taking the product of all integers from $`1`$ to $`n`$, denoted by $`n!`$.

$`n! = n \times (n-1) \times (n-2) ... \times 3 \times 2 \times 1`$

## Making Arrangements

Take a standard deck of cards, and select all of the spade, non face cards (ace of spades to the ten of spades).

How many unique permutations can we get if we shuffle these cards completely randomly?

We could get a deck of cards, and spend a long afternoon shuffling until we are sure we have found every permutation. Or we could use factorials.

There are $`10`$ possible cards for the top card in our shuffled deck to take. Once we have remove this, there are $`9`$ possible card values the second card could take. Carrying this forward we can see that there there must be $`10!`$ permutations in total.

## Computing Permuting

Instead of calculating this in our heads, let's write a quick program to do the work for us.

Open the file `Factorial.java` and complete the rest of the code to ensure that it compiles, reads in a value of the integer $`n`$ from the user, and prints the value of $`n!`$.

The correct output should be as follows.

```
$ java Factorial
4          // User input
24
```

{% spoiiler "Hint" %}

When defining the starting and ending conditions of your for loop, you aren't forced to make your iterating variable start from 0, nor do we have to use `<` for our final value. You could start this from $`1`$ and use `<=` for example...

{% endspoiler %}

## Improving Our Program

Now that we've found out how many different permutations there are, isn't it a good job we didn't do that by hand.

Unfortunately our program still has a flaw...

If we were to add the jack of spades and queen of spades into our deck, how many different permutations are there now?

```
$ java Factorial
12
479001600
```

Now let's add the king of spades into our pile and use your program to compute the new number of permutations. Now use your calculator to calculate $`13!`$...

Fix your program so that it will correctly output the factorial of integers up to $`20!`$.

{% spoiiler "Hint" %}

Use an online [decimal to binary](https://www.rapidtables.com/convert/number/decimal-to-binary.html) calculator to see what is $`12!`$ in binary? How about $`13!`$? If we count the number of bits can we use a 32-bit integer to store this value?

{% endspoiler %}

