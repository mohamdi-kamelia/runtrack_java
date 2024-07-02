package Jour04.Job05;

public class CountingThread extends Thread {
    private int start;
    private int end;
    private int count;

    public CountingThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
