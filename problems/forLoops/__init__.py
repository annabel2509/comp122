import check50
import check50_java

@check50.check()
def helloExists():
    """Hello.java exists."""
    check50.exists("Hello.java")

@check50.check(exists)
def helloCompiles():
    """Hello.java compiles."""
    check50_java.compile("Hello.java")

@check50.check(compiles)
def helloPrintsTwo():
    """Ensures Hello is returning the specified value"""
    check50_java.run("Hello").stdin(3).stdout("I've said 'Hello there' 0 times previously!\nI've said 'Hello there' 1 times previously!\n").exit()

@check50.check(compiles)
def helloPrintsThree():
    """Ensures Hello is returning the specified value"""
    check50_java.run("Hello").stdin(3).stdout("I've said 'Hello there' 0 times previously!\nI've said 'Hello there' 1 times previously!\nI've said 'Hello there' 2 times previously!\n").exit()

@check50.check()
def factorialExists():
    """factorial.java exists."""
    check50.exists("Factorial.java")

@check50.check(exists)
def factorialCompiles():
    """FPTestApp.java compiles."""
    check50_java.compile("Factorial.java")

@check50.check(compiles)
def factorialFour():
    """Ensures Factorial is printing the specified value"""
    check50_java.run("Factorial").stdin("4").stdout("24").exit()


@check50.check(compiles)
def factorialTen():
    """Ensures Factorial is printing the specified value"""
    check50_java.run("Factorial").stdin("10").stdout("3628800").exit()


@check50.check(compiles)
def factorialThirteen():
    """Ensures Factorial is printing the specified value"""
    check50_java.run("Factorial").stdin("13").stdout("6227020800").exit()


@check50.check(compiles)
def factorialNineteen():
    """Ensures Factorial is printing the specified value"""
    check50_java.run("Factorial").stdin("19").stdout("121645100408832000").exit()