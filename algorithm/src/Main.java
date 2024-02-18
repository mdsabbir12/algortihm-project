import java.util.Scanner;

public class Main {

    static int[][] mat = {
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
    };
    static int[] visit = new int[12];
    static int[] queue = new int[12];
    static int[] level = new int[12];
    static int front = -1, rear = -1;
    static int[] array = new int[12];
    public Main() {
    }

    public static void main(String[] args) {
/*        int nodes = 12; // Number of nodes in the graph

        *//*System.out.println("Matrix representation of the graph:");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }*//*

        for (int i = 0; i < nodes; i++)
            visit[i] = 0;

        int src = 0;
        // Source node to start BFS
        bfs(src, nodes);
        db d=new db();
        db2 d1=new db2();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Your name: " );
        String name=sc.nextLine();
        System.out.println("\nEnter Your ID: ");
        int Id=sc.nextInt();
        System.out.println("\nEnter the year: ");
        int year=sc.nextInt();
        // finding per semester course

        for(int i=0;i<nodes;i++)
        {
           if(level[i]==year) {
               System.out.print(i + " ");
               try {
                   d1.conect(i);
               } catch (ClassNotFoundException e) {
                   throw new RuntimeException(e);
               }
           }
        }

        System.out.println("As Retake course : ");
        //finding fai or pre requeste course
        int n=Id;
        try {
            d.conect(n);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/


    }

    static void bfs(int src, int nodes) {
        enqueue(src);
        level[src] = 0;

        while (front < rear) {
            int nd = dequeue();
            //System.out.print(nd + " ");

            for (int i = 0; i < nodes; i++) {
                if (mat[nd][i] == 1 && visit[i] == 0) {
                    enqueue(i);
                    visit[i] = 1;
                    level[i] = level[nd] + 1;
                }
            }
        }

    }


    static void enqueue(int n) {
        if (rear == queue.length - 1) {
            System.out.println("Queue overflow");
            return; // Handle the queue overflow case
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = n;
        visit[n] = 1;
    }

    static int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow");
            return -1; // Handle the queue underflow case
        }
        int item = queue[front];
        front++;
        return item;
    }
}
