package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    protected final String name;
    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult result) { //생성자로 설정한 메소드를 실행해주는 역할
        result.testStarted();
        setUp();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            result.testFailed();
        }

        tearDown();
    }

    public void setUp() {
    }

    public void tearDown() {
    }
}
