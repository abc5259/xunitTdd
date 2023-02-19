package xunit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String name) {
        super(name);
    }

    WasRun wasRun;

    @Override
    public void setUp() {
        wasRun = new WasRun("testMethod"); // 생성자로 테스트할 메소드 지정
    }

    public void testRunning() {
        Assert.assertEquals(false,wasRun.wasRun);
        wasRun.run(); // 메소드 실행시 wasRun true로
        Assert.assertEquals(true,wasRun.wasRun);
    }

    public void testSetUp() {
        Assert.assertEquals(false,wasRun.wasSetUp);
        wasRun.run(); // 메소드 실행시 wasSetUp true로
        Assert.assertEquals(true,wasRun.wasSetUp);
    }
}
