package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//じゃんけんのインスタンスを作成
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手を入力する
		String Me = Jyanken.getMyChoice();
		
		//対戦相手のじゃんけんの手が乱数で選ばれる
		String You =Jyanken.getRandom();
		
		//じゃんけんの結果を出力する
		Jyanken.playGame(Me, You);

	}

}
