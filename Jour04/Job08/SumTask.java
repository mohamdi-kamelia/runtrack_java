package Jour04.Job08;

class SumTask implements Runnable {
    private long start;
    private long end;
    private long sum;

    public SumTask(long start, long end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}
