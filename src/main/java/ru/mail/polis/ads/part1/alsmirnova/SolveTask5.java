package ru.mail.polis.ads.part1.alsmirnova;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SolveTask5 {
    private static final String QUIT   = "exit";
    private static final String PUSH   = "push";
    private static final String POP    = "pop";
    private static final String FRONT  = "front";
    private static final String SIZE   = "size";
    private static final String CLEAR  = "clear";
    private int size;
    private int[] elementData;
    private static final int DEFAULT_CAPACITY = 100;


    @SuppressWarnings("unchecked")
    public SolveTask5() {
        this.elementData = (int[]) new int[DEFAULT_CAPACITY];
    }

    public void push(int n) {
        elementData[size]=n;
        size++;
        System.out.println("ok");
    }

    public int pop() {
        if (size>0) {
            size--;
            int a=elementData[0];
            shiftL();
            System.out.println(a);
        }
        return 0;
    }

    public void shiftL() {
        int[] elementData1 = Arrays.copyOfRange(elementData, 1, size+1);
        elementData = Arrays.copyOf(elementData1, DEFAULT_CAPACITY);
    }

    public int front() {
        return elementData[0];

    }

    public int size() {
        return size;

    }

    public void clear() {
        size=0;
        System.out.println("ok");
    }

    public void commands (String command) {
        String todo = command.split(" ")[0];
        switch (todo) {
            case PUSH: push(Integer.parseInt(command.split(" ")[1]));
                break;
            case POP: pop();
                break;
            case FRONT:
                System.out.println(front());
                break;
            case SIZE:
                System.out.println(size());
                break;
            case CLEAR: clear();

        }
    }

    public static void main(String[] args) {
        try (BufferedReader lineReader = new BufferedReader(new InputStreamReader(System.in))) {
            String sequence;
            SolveTask5 QQ = new SolveTask5();
            while (!QUIT.equals(sequence = lineReader.readLine())) {
                QQ.commands(sequence);
            }
            System.out.print("bye");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}