package 무제;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Welocme to Shopping Mall!";
	    String tagline = "Welcome to Book Market!!";
		
		System.out.println("*************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("*************************");
		
		System.out.println("1. 고객정보 확인하기 \t5. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t6. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우\t7. 장바구니의 항목 삭제하기" );
		System.out.println("4. 영수증 표시하\t8. 종료" );
		System.out.println("*************************");
	}

}
