import java.io.*;
import jp.ac.uryukyu.ie.e225731.*;

public class Main {
    public static void main(String[] args)throws IOException, InterruptedException  {

        Thread.sleep(3000);
        System.out.println("散歩をしていると、空から怪我をした鳥が落ちてきた！！");
        Thread.sleep(2500);
        System.out.println("");
        System.out.println("あなたは鳥を助けることに...");
        Thread.sleep(2500);    
        System.out.println("");
        System.out.println("鳥の名前を名付けましょう");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Bird bird = new Bird(br.readLine());
        Thread.sleep(1000);
        System.out.println("");
        System.out.println(bird.name+"との生活が幕を開けた");
        bird.teach();

        while( bird.independence == false ){

        }



    }
    
}
