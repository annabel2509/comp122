import check50
import check50_java
import check50_junit


@check50.check()
def report_exists():
    """report exists"""
    check50.exists("report.pdf")


@check50.check()
def item_exists():
    """Item.java exists"""
    check50.exists("Item.java")


@check50.check(item_exists)
def item_compiles():
    """Item.java compiles"""
    check50_java.compile("Item.java")

@check50.check(item_exists)
def item_has_main_method():
    """is application"""
    check50_java.checks.is_application_class("Item")


@check50.check(item_compiles)
def item_constructor():
    """Item constructor as expected"""
    check50_junit.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#testInstantiate'])


@check50.check(item_constructor)
def item_getPrice():
    """Item.getPrice()"""
    check50_junit.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#getPrice'])


@check50.check(item_constructor)
def item_getDescription():
    """Item.getDescription()"""
    check50_junit.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#getDescription'])


@check50.check(item_constructor)
def item_pricePerUnitWeight():
    """Item.pricePerUnitWeight()"""
    check50_junit.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#pricePerUnitWeight'])


@check50.check(item_constructor)
def item_toString():
    """Item.toString()"""
    check50_junit.run_and_interpret_test(
        classpaths=['tests/'],
        args=['--select-method', 'ItemTest#testToString'])
