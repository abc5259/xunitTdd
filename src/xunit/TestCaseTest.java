package xunit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        WasRun wasRun = new WasRun("testMethod"); // 생성자로 테스트할 메소드 지정
        Assert.assertEquals(false,wasRun.wasRun);
        wasRun.run(); // 메소드 실행시 wasRun true로
        Assert.assertEquals(true,wasRun.wasRun);
    }

    public void testSetUp() {
        WasRun wasRun = new WasRun("testMethod"); // 생성자로 테스트할 메소드 지정
        Assert.assertEquals(false,wasRun.wasSetUp);
        wasRun.run(); // 메소드 실행시 wasSetUp true로
        Assert.assertEquals(true,wasRun.wasSetUp);
    }
}
