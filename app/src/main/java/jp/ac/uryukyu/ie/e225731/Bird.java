package jp.ac.uryukyu.ie.e225731;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;


public class Bird {

    private String name;
    private int health = 0;
    private int satisfaction = 0;
    public ArrayList<String> words = new ArrayList<>();
    public boolean independence = false;

    /** 
     * getHealthメソッド
     *　　　healthを返す
     * @return health
    */
    public int getHealth(){
        return health;
    }

    /**
     * getSatisfactionメソッド
     * satisfactionを返す
     * @return satisfaction
     */
    public int getSatisfaction(){
        return satisfaction;
    }

    /**
     * getNameメソッド
     * nameを返す
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * getIndependenceメソッド
     * independenceを返す
     * @return　indepeendence
     */
    public boolean getIndependence(){
        return independence;
    }

    /**
     * setHealthメソッド
     * healthを設定する
     * @param h 整数値
     */
    public void setHealth(int h){
        this.health = h;
    }

    /**
     * setSatisfactionメソッド
     * satisfactionを設定する
     * @param s 整数値
     */
    public void setSatisfaction(int s){
        this.satisfaction = s;
    }

    /**
     * Birdメソッド
     * nameを設定する
     * @param name
     */
    public Bird(String name){

        this.name = name;
        System.out.println("");  
        System.out.println("ピヨピヨ🦜"+ name + "は嬉しそうに鳴いた");
    }

    /**
     * teachメソッド
     * Birdに言葉を教える
     * @throws InterruptedException
     * @throws IOException
     */
    public void teach() throws InterruptedException,IOException{
        //出力を遅らせるということは動作を妨げることと同じため、InterruptedExceptionを入れ,例外処理を行う。
        //IOExceptionは入出力の管理

        if(satisfaction <= 100){

            System.out.println( name + "は言葉を覚えたいみたい!");
            Thread.sleep(1000);
            System.out.println("言葉を教えましょう\n→");
            BufferedReader taughtWord = new BufferedReader(new InputStreamReader(System.in));
            String word = taughtWord.readLine();
            words.add(word);
            System.out.println(name+"は'"+word+"'と嬉しそうに鳴いた");
            Random satPoint = new Random();
            int s = satPoint.nextInt(21) + 1; //満足度ポイントを1から20までの数から、ランダムに出したい
            satisfaction += satisfaction + s;

            if ((health >= 100) && (satisfaction >= 100)){                
                independence = true;
            }
        }

        else if(satisfaction >= 100){
            System.out.println( name + "は興味を示していないようだ");        
        }
    }

    /**
     * feedメソッド
     * Birdに餌を与えるメソッド
     * @throws InterruptedException
     * @throws IOException
     */
    public void feed() throws InterruptedException, IOException{

        if(health <= 100){

            System.out.println( name + "は餌を食べたいみたい!何をあげますか?");
            Thread.sleep(1000);
            System.out.println("1:りんご  2:ピーナッツ  3:ぶどう 数字を入力しよう!");
            System.out.println("");
            Random food = new Random();
            int wantedFood = food.nextInt(4) + 1; //wantedFoodの中身は1から3となる
            BufferedReader whatFood = new BufferedReader(new InputStreamReader(System.in));
            int givenFood =Integer.parseInt(whatFood.readLine());

                if( givenFood >=1 && givenFood <= 3){
                    if(wantedFood==givenFood){
                        Random healthPoint = new Random();
                        int gainedHealth = healthPoint.nextInt(10) + 30;
                        health += health + gainedHealth;
                        System.out.println("おめでとう!"+wantedFood+"が食べたかったみたい!!");

                        if ((health >= 100) && (satisfaction >= 100)){              
                            independence = true;  
                        }               
                    }

                    else{
                        Random healthPoint2 = new Random();
                        int gainedHealth2 = healthPoint2.nextInt(10) + 11;
                        health += health + gainedHealth2;
                        System.out.println(givenFood+"をもぐもぐ食べた。");

                        if ((health >= 100) && (satisfaction >= 100)){    
                            independence = true;
                        }
                    }
                }
                else{
                    System.out.println("1から3の数字を入力しよう");
                }
        }
        else{
            System.out.println(name + "はお腹が空いていないみたい");
        }
    }
}

    
    

