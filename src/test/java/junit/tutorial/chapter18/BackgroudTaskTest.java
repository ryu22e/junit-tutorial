package junit.tutorial.chapter18;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BackgroudTaskTest {

    @Rule
    public Timeout timeout = new Timeout(1000);

    @Test
    public void invokeメソッドによりRunnableオブジェクトのrunメソッドが別スレッドで実行される()
            throws Exception {
        // SetUp
        final AtomicReference<String> backgroundThreadName =
                new AtomicReference<String>();
        final CountDownLatch latch = new CountDownLatch(1);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                backgroundThreadName.set(Thread.currentThread().getName());
                latch.countDown();
            }
        };

        BackgroudTask sut = new BackgroudTask(task);

        // Exercise
        sut.invoke();
        latch.await();
        // Verify
        assertThat(backgroundThreadName.get(), is(not(Thread
            .currentThread()
            .getName())));
    }
}
