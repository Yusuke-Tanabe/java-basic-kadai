package kadai_018;


public class KatoHanako_Chapter18 extends Kato_Chapter18 {
		
		//コンストラクタ
		KatoHanako_Chapter18(String familyName, String address) {
			super(familyName, address);
		}
		
		
		public void setGivenName(String givenName) {
			//givenNameフィールドを取得、名前をセット
			this.givenName = givenName;
		}
		
		//メソッド　個別紹介を設定	
		@Override
		public void eachIntroduce() {
			System.out.println("趣味は読書です");
		}

		
}