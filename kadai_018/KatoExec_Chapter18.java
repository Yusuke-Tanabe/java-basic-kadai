package kadai_018;

public class KatoExec_Chapter18{

	public static void main(String[] args) {
		
		//各子クラスのインスタンスを作成	
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18("加藤", "東京都中野区〇×");	
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤", "東京都中野区〇×");	
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18("加藤", "東京都中野区〇×");	
	
		
		//setGivenNameメソッドの実行
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		//execIntroduceメソッドの実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();

	
	}

	
	
}