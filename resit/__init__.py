import check50
import check50_java


@check50.check()
def report_exists():
    check50.exists("report.pdf")

#####################################
# Item
#####################################
@check50.check()
def item_exists():
    """Item.java exists"""
    check50.exists("Item.java")


@check50.check(item_exists)
def item_compiles():
    """Item.java compiles"""
    check50_java.compile("Item.java")


@check50.check(item_compiles)
def item_constructor():
    """Item constructor as expected"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#testInstantiate'])


@check50.check(item_constructor)
def item_getPrice():
    """Item.getPrice()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#getPrice'])


@check50.check(item_constructor)
def item_getDescription():
    """Item.getDescription()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#getDescription'])


@check50.check(item_constructor)
def item_pricePerUnitWeight():
    """Item.pricePerUnitWeight()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#pricePerUnitWeight'])


@check50.check(item_constructor)
def item_toString():
    """Item.toString()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#testToString'])


###############################################
# Drink
###############################################

@check50.check()
def drink_exists():
    """Drink.java exists"""
    check50.exists("Drink.java")


@check50.check(drink_exists)
def drink_compiles():
    """Drink.java compiles."""
    check50_java.compile("Drink.java")


@check50.check(drink_compiles)
def drink_isItem():
    """Drink is Item"""
    check50.include("tests/HierarchyTest.java")
    check50_java.junit5.compile_test("HierarchyTest.java")
    check50_java.junit5.run_and_interpret_test(
        args=['--select-method', 'HierarchyTest#drinkIsItem'])


@check50.check(drink_compiles)
def drink_constructor():
    """Drink constructor as expected"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'DrinkTest#testInstantiate'])


@check50.check(drink_constructor)
def drink_getVolume():
    """Drink.getVolume()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'DrinkTest#getVolume'])


@check50.check(drink_constructor)
def drink_toString():
    """Drink.toString()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'DrinkTest#testToString'])


###############################################
# Sandwich
###############################################

@check50.check()
def sandwich_exists():
    """Sandwich.java exists"""
    check50.exists("Sandwich.java")


@check50.check(sandwich_exists)
def sandwich_compiles():
    """Sandwich.java compiles."""
    check50_java.compile("Sandwich.java")


@check50.check(sandwich_compiles)
def sandwich_isItem():
    """Sandwich is Item"""
    check50.include("tests/HierarchyTest.java")
    check50_java.junit5.compile_test("HierarchyTest.java")
    check50_java.junit5.run_and_interpret_test(
        args=['--select-method', 'HierarchyTest#sandwichIsItem'])


@check50.check(sandwich_compiles)
def sandwich_constructor():
    """Sandwich constructor as expected"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'SandwichTest#testInstantiate'])


@check50.check(sandwich_constructor)
def sandwich_getCalories():
    """Sandwich.getCalories()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'SandwichTest#getCalories'])


@check50.check(sandwich_constructor)
def sandwich_toString():
    """Sandwich.toString()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'SandwichTest#testToString'])


###############################################
# Snack
###############################################

@check50.check()
def snack_exists():
    """Snack.java exists"""
    check50.exists("Snack.java")


@check50.check(snack_exists)
def snack_compiles():
    """Snack.java compiles"""
    check50_java.compile("Snack.java")


@check50.check(snack_compiles)
def snack_isItem():
    """Snack is Item"""
    check50.include("tests/HierarchyTest.java")
    check50_java.junit5.compile_test("HierarchyTest.java")
    check50_java.junit5.run_and_interpret_test(
        args=['--select-method', 'HierarchyTest#snackIsItem'])


@check50.check(snack_compiles)
def snack_constructor():
    """Snack constructor as expected"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'SnackTest#testInstantiate'])


@check50.check(snack_constructor)
def snack_getHealthy():
    """Snack.getHealthy()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'SnackTest#getHealthy'])


@check50.check(snack_constructor)
def snack_toString():
    """Snack.toString()"""
    check50_java.junit5.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'SnackTest#testToString'])
