import java.io.*;
import jp.ac.uryukyu.ie.e225731.*;
import java.util.Random;


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

        while( bird.independence == false ){
            System.out.println("1:言葉を教える 2:餌を与える 3:鳥の状態を見る");
            System.out.println("→ 1から3の文字を入力しよう");
            System.out.println("");
            BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
            int choiceNum = Integer.parseInt(choice.readLine());

            if(choiceNum >= 1 && choiceNum <= 3){
                if(choiceNum == 1){
                    bird.teach();
                    
                }
                else if(choiceNum == 2){
                    bird.feed();
                }
                else if(choiceNum == 3){
                    System.out.println(bird.name +"のステータス\n health  :  "+bird.getSatisfaction()+"\nsatisfaction  :  "+ bird.getSatisfaction());
                }

            }

            else{

                System.out.println("1から3の数字を入力しよう");
            }
        }

        int index = new Random().nextInt(bird.words.size());
        String lastWord = bird.words.get(index);
        System.out.println(bird.name + "は元気に成長しきった");
        System.out.println(bird.name + "は" + lastWord + "と言って羽ばたいた"  );
        System.out.println("これで" + bird.name + "との生活は幕を閉じた");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("Thank you for playing 🦜"); 



    }
    
}
