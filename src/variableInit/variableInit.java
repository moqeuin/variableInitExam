package variableInit;

public class variableInit {
	
	/*
		초기화 순서
		1)자동초기화 == 클래스 변수 초기화 -> 인스턴스 변수 초기화
			변수들을 기본값으로 초기화한다.
		
		자동초기화 -> 명시적 초기화 -> 블럭 초기화 -> 생성자 생성
		
		2)명시적 초기화
			int number = 4; 와 같이 값을 대입한 초기화
		
		3)블럭 초기화
			복잡한 초기화에 사용된다
			
			-클래스 블럭 초기화
			명시적 초기화 후 초기화된다.
			static{
			
			}
			-인스턴스 블럭 초기화
			인스턴스가 생성될 때 초기화된다.
			{
			
			}
	
	*/
	static int[] arr = new int[10];
	int number;
	
	// 클래스 블럭
	static {
		System.out.println("클래스 블럭 초기화 실행");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*20);
		}
	}
	
	// 인스턴스 블럭
	{
		System.out.println("인스턴스 블럭 초기화 실행");
	}
	
	// 생성자
	public variableInit() {
		System.out.println("생성자 생성 실행");
	}	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
		
		variableInit variInit = new variableInit();
		int number2; // 지역 변수
		
		
		//System.out.println(number2); // 오류, 지역변수는 명시적 초기화를 해줘야한다.
		System.out.println(variInit.getNumber()); // 0, 멤버변수는 자동초기화가 된다.
		
		// 클래스 내부에서는 클래스 변수를 바로 접근할 수 있다
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		
		/*
			출력문:
			클래스 블럭 초기화 실행
			인스턴스 블럭 초기화 실행
			생성자 생성 실행
			arr[0]15
			arr[1]19
			arr[2]5
			arr[3]9
			.
			.
			.			
		*/
	}
}
