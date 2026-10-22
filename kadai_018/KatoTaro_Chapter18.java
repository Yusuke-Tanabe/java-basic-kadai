package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//コンストラクタ
	KatoTaro_Chapter18(String familyName, String address) {
		super(familyName, address);
	}
 
	
	public void setGivenName(String givenName) {
		//givenNameフィールドを取得、名前をセット
		
		this.givenName = givenName;

	}
	
	//メソッド　個別紹介を設定	
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

	
}
