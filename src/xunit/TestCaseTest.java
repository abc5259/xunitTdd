package xunit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod"); // 생성자로 테스트할 메소드 지정
        wasRun.run();
        Assert.assertEquals("setUp testMethod tearDown",wasRun.log);
    }
}
