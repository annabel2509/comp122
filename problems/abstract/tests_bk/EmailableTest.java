import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.lang.reflect.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public abstract class EmailableTest {
    public abstract Emailable createInstance();

    @Test
    public final void test() {
        Emailable instance = createInstance();
        assertTrue(instance.sendEmail(true));
    }

    @Test
    public final void testMyMethod_False() {
        MyInterface instance = createInstance();
        assertFalse(instance.myMethod(false));
    }
}

public class MyClass1Test extends MyInterfaceTest {
    public MyInterface createInstance() {
        return new MyClass1();
    }
}

public class MyClass2Test extends MyInterfaceTest {
    public MyInterface createInstance() {
        return new MyClass2();
    }
}