package kadai_018;

abstract public class Kato_Chapter18 {

	//フィールド
	protected String familyName;
	protected String givenName;
	protected String address;
	
	//コンストラクタ
	Kato_Chapter18(String familyName, String address) {
		this.familyName = familyName;
		this.address = address;
	}
	
	
	//メソッド
	//共通の紹介を出力
	public void commonIntroduce(){
		System.out.println("名前は"+familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
	}
	
	//個別の紹介を出力
	public abstract void eachIntroduce();
			
	
	//紹介を実行する
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
	
}
