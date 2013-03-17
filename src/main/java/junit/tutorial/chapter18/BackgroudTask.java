package junit.tutorial.chapter18;

import java.util.concurrent.Executors;

public class BackgroudTask {

    private final Runnable task;

    public BackgroudTask(Runnable task) {
        this.task = task;
    }

    public void invoke() {
        Executors.newSingleThreadExecutor().execute(task);
    }

}
