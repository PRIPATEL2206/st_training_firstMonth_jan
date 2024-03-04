package producerConsumer;

import java.util.concurrent.BlockingQueue;

// Consumer class
class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = queue.take();
                System.out.println("Consuming: " + item);
                Thread.sleep(200);  // Simulate some processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
