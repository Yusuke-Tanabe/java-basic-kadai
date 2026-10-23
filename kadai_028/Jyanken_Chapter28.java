package kadai_028;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		//自分のじゃんけんの手を入力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner myHand = new Scanner(System.in); //Scannerクラスのオブジェクトを生成する
		String input = myHand.next();//入力した内容を取得する
		
		try{
			if(input.equals("r") || input.equals("s") || input.equals("p")) {//r or s or pの時正しい処理
				//正しい処理
				
			}else {
				throw new InputMismatchException();
			}
			
		}catch(InputMismatchException e) {
			//文字列の入力ではない場合に行う処理
			System.out.println(input);
			System.out.println("正しい文字列の入力ではありません");
			System.out.println("r(グー)、s(チョキ)、p(パー)のいずれかを入力していください");
			System.out.println();
			getMyChoice();//入力に戻る
			
			System.exit(0);//例外処理前のgetMyChoiceを終了
		}
		
		return input;

	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//配列にじゃんけんの手をセットする
		String[] enemyHand = {"r", "s","p"};
		
		//乱数で対戦相手のじゃんけんの手を選ぶ　※3未満の数を取得
		int ransu = (int)Math.floor(Math.random() * 3);
		//System.out.println(enemyHand[ransu]); テスト
		
		//じゃんけんクラスを実行するクラスに対戦相手のじゃんけんの手を返す
		return enemyHand[ransu];
		
	}

	//じゃんけんを行う
	public void playGame(String Me, String You) {
		//自分と対戦相手のじゃんけんの手を出力する
		//※ HashMapを作成
		HashMap<String, String>Hand = new HashMap<>();
		Hand.put("r", "グー");
		Hand.put("s", "チョキ");
		Hand.put("p", "パー");
		
		String MyHand = Hand.get(Me);
		String EnemyHand = Hand.get(You);
		
		System.out.println("自分の手は"+ MyHand + "対戦相手の手は"+ EnemyHand );

		//自分と対戦相手のじゃんけんの手を比較する
		if(MyHand.equals(EnemyHand)) {
			System.out.println("あいこです。");
		}else if(MyHand.equals("グー")) {
			if(EnemyHand.equals("チョキ")) {
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
		}else if(MyHand.equals("チョキ")) {
			if(EnemyHand.equals("グー")) {
				System.out.println("自分の負けです");
			}else {
				System.out.println("自分の勝ちです");
			}
		}else if(MyHand.equals("パー")) {
			if(EnemyHand.equals("グー")) {
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
		
		//じゃんけんの結果を出力する
		}
	}

}
