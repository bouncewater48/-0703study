package Oper;
//8번 : 비트연산자를 이용한 암호화와 복호화
public class Bitcryption {
	public static void main(String[] args) {
		
		//전달할 데이터(원본데이터)
		int originalMsg = 42;
		int key = 99; //비트 마스크(암호화, 복호화에 사용)(같은걸 사용하니 대칭키!)
		System.out.println("원본 메시지 : " + originalMsg);
		// 원본 메시지 : 42
		
		int encryptMsg = originalMsg ^ key; //xor 연산을 통한 암호화
		// xor 연산을 사용한 이유 : 99와 42의 비트 연산값이 서로 달라서 엉뚱한 값이 나오기 때문
		// 실제환경에선 이미 만들어져있는 각종 암호화 알고리즘을 이용함
		System.out.println("암호화된 메세지 : " + encryptMsg);
		// 암호화된 메세지 : 73
		
		int deryptMsg = encryptMsg ^ key; //암호화된 메시지를 동일한 키로 xor 연산을 통한 복호화
		System.out.println("복호화된 메세지 : " + deryptMsg);
		// 복호화된 메세지 : 42
		
//		XOR => 두 비트의 값이 서로 다르면 1 그 외에는 0을 반환
//		0 XOR 0 => 0
//		0 XOR 1 => 1
//		1 XOR 0 => 1
//		1 XOR 1 => 0

	}
}
