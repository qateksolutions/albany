package listeners;

import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.BeforeClass;

public class LoggerForParallelTests {
    @BeforeClass
    public void addThread(){
        ThreadContext.put("threadName", this.getClass().getName());
    }
}
