package kadai_021;
import java.util.HashMap;


public class Dictionary_Chapter21 {

	//フィールド
	private HashMap<String, String>fruitList;
	
	//コンストラクタ
	public Dictionary_Chapter21() {
	
		this.fruitList = new HashMap<String, String>();
		
		fruitList.put("apple","りんご");
		fruitList.put("peach","桃");
		fruitList.put("banana","バナナ");
		fruitList.put("lemon","レモン");
		fruitList.put("pear","梨");
		fruitList.put("kiwi","キウィ");
		fruitList.put("strawberry","いちご");
		fruitList.put("grape","ぶどう");
		fruitList.put("muscat","マスカット");
		fruitList.put("cherry","さくらんぼ");
	}
		
		
		
	//辞書を調べるメソッド
	public void checkList(String[] number) {
        for (String num : number) {
        	if(fruitList.get(num) != null) {
        		System.out.println(num + "の意味は" +fruitList.get(num));
        	}else {
        		System.out.println(num + "は辞書に存在しません");
        	}
            
        }
		
	}


}
