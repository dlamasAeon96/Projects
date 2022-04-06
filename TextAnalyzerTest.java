Import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TextAnalyzerTest {

    String message: "TextAnalyzer works";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());

    }
}