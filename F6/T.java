package f6;

import java.util.concurrent.Callable;

public final class T implements Callable {
    final Object result;
    final Runnable task;

    public T(Runnable runnable, Object obj) {
        this.task = runnable;
        this.result = obj;
    }

    public Object call() {
        this.task.run();
        return this.result;
    }

    public String toString() {
        return "Callable(task: " + this.task + ", result: " + this.result + ')';
    }
}
