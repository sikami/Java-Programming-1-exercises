
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
        
    }
    
    public void addNumber(int number) {
        sum += number;
        count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        double average = 0;
        if(count == 0) {
            return 0.0;
        }
        
        average = (double) sum / (double) count;
        return average;
    }
}
