import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static PriorityQueue priorityQueue = new PriorityQueue();
    static Queue firstQueue = new Queue();
    static Queue secondQueue = new Queue();
    static Queue thirdQueue = new Queue();


    public static void main(String[] args) throws IOException {
        readFile();
        workMethod();
    }

    public static void workMethod() {
        int traffic = 3;
        priorityQueue.show(traffic);
        firstQueue.show(traffic);
        secondQueue.show(traffic);
        thirdQueue.show(traffic);

    }

    static void readFile() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:\\Siaod3\\src\\data.txt"));
        String data = bf.readLine();
        String[] line;
        line = data.split("\\s+");
        for (String s : line) {
            priorityQueue.add(Integer.parseInt(s));
        }
        data = bf.readLine();
        line = data.split("\\s+");
        for (String s : line) {
            firstQueue.add(Integer.parseInt(s));
        }
        data = bf.readLine();
        line = data.split("\\s+");
        for (String s : line) {
            secondQueue.add(Integer.parseInt(s));
        }
        data = bf.readLine();
        line = data.split("\\s+");
        for (String s : line) {
            thirdQueue.add(Integer.parseInt(s));
        }
        bf.close();
    }
}