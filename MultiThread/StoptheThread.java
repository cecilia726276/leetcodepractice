package MultiThread;

/**
 * @Author SYZ
 * @create 2019-08-01 14:44
 */
public class StoptheThread implements Runnable {
    private volatile boolean stop = false;//此变量必须加上volatile
    int a = 0;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (!stop) {
            synchronized ("") {
                a++;
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                a--;
                String tn = Thread.currentThread().getName();
                System.out.println(tn + ":a=" + a);
            }
        }
    }
        //线程终止
        public void terminate () {
            stop = true;
        }
        public static void main (String[]args){
            StoptheThread t = new StoptheThread();
            Thread t1 = new Thread(t);
            t1.start();
            for (int i = 0; i < 5; i++) {
                new Thread(t).start();
            }
            t.terminate();
        }
    }
