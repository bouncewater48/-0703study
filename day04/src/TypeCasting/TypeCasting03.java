package TypeCasting;
//13번 : 모든 데이터 타입 조합
public class TypeCasting03 {
	public static void main(String[] args) {
		//변수
		byte b = 10; //정수
		short s = 100; //정수
		char c = 'a'; //97
		int i = 1000; //정수
		long l = 10000L; //정수
		float f = 3.14f; //실수
		double d = 3.141592; //
		boolean bool = true;

//					형변환 가능성(호환성)		
//			byte	short	char	int		long	float	double	boolean
//byte		O		O		X		O		O		O		O		X
//short		X		O		X		O		O		O		O		X
//char		X		X		O		O		O		O		O		X
//int		X		X		X		O		O		O		O		X
//long		X		X		X		X		O		O		O		X
//float		X		X		X		X		X		O		O		X
//double	X		X		X		X		X		X		O		X
//boolean	X		X		X		X		X		X		X		O
		
//		주석처리된건 안되는것, '강제형변환 가능' 적힌건 자동은 안되나 강제는 가능한것!
				
		//byte
		System.out.println("\n===========byte===========");
		System.out.println("byte 타입의 값 : " + b);
		byte bb = b;
		System.out.println(bb);	//10 그대로 출력
		short bs = b;
		System.out.println(bs);	//10 그대로 출력
		char bc = (char)b; 
		System.out.println(bc); //byte안에 char은 기본적으로 안들어가나, 강제변환은 가능함
		int bi = b;
		System.out.println(bi);	//int는 정수형이므로 10 출력
		long bl = b;
		System.out.println(bl); //long은 정수형이므로 10 출력
		double bd = b;
		System.out.println(bd);	//double은 실수형이므로 소수점자리 0도 출력
		float bf = b;
		System.out.println(bf);	//float는 실수형이므로 소수점 자리 0도 출력
//		boolean bbool = b;
//		System.out.println(bbool); boolean은 boolean끼리만
		
		
		//short
		System.out.println("\n===========short===========");
		System.out.println("short 타입의 값 : " + s);
		byte sb = (byte)s; //강제형변환 가능
		System.out.println(sb);
		short ss = s; 
		System.out.println(ss);	
		char sc = (char)s; //유니코드에 맞춰서 대응되는 문자 출력
		System.out.println(sc);	
		int si = s;
		System.out.println(si);	
		long sl = s;
		System.out.println(sl);	
		double sd = s;
		System.out.println(sd);	//실수형이라 소수점까지 출력
		float sf = s;
		System.out.println(sf);	//실수형이라 소수점까지 출력
//		boolean sb = (boolean)s; (boolean은 자기자신을 제외하면 강제도 불가능함!)
//		System.out.println(sb);	boolean은 자기자신과만 가능!
		
		
		
		//char
		System.out.println("\n===========char===========");
		System.out.println("char 타입의 값 : " + c);
		byte cb = (byte)c; //강제형변환 가능
		System.out.println(cb);
		short cs = (short)c; //강제형변환 가능
		System.out.println(cs);
		char cc = c; //char 타입은 유니코드97이 아니라 문자열 a로 그대로 출력
		System.out.println(cc);
		int ci = c;
		System.out.println(ci);
		long cl = c;
		System.out.println(cl);
		float cf = c;
		System.out.println(cf); //실수형이라 소수점까지 출력
		double cd = c;
		System.out.println(cd); //실수형이라 소수점까지 출력
//		boolean cbool = c; boolean은 자기자신과만 가능!
//		System.out.println(cbool);
		
		
		//int
		System.out.println("\n===========int===========");
		System.out.println("int 타입의 값 : " + i);
//		byte ib = (byte)i;
//		System.out.println(ib);
		short is =(short) i; //강제형변환 가능
		System.out.println(is);
		char ic = (char)i;
		System.out.println(ic); //char은 유니코드 문자로 저장하는 타입이고, 
//		유니코드 1000번은 Ϩ로 표기되므로 Ϩ로 출력됨
		long il = i;
		System.out.println(il);
		float i_f = i; //실수형이라 소수점까지 출력
		System.out.println(i_f);
		double id = i; //실수형이라 소수점까지 출력
		System.out.println(id);
//		boolean ibool = i; boolean은 자기자신과만 가능!
//		System.out.println(ibool);	
		
		//long
		System.out.println("\n===========long===========");
		System.out.println("long 타입의 값 : " + l);
		byte lb = (byte)l;	//강제형변환 가능
		System.out.println(lb);	
		short ls = (short)l; //강제형변환 가능
		System.out.println(ls);	
		char lc = (char)l;	//강제형변환시 유니코드에 대응해서 출력
		System.out.println(lc);	
		int li = (int)l; 	//강제형변환 가능
		System.out.println(li);
		long ll = l;
		System.out.println(ll);
		float lf = l; //실수형이라 소수점까지 출력
		System.out.println(lf);
		double ld = l; //실수형이라 소수점까지 출력
		System.out.println(ld);
//		boolean lbool = l;
//		System.out.println(lbool);
		
		
		//float
		System.out.println("\n===========float===========");
		System.out.println("float 타입의 값 : " + f);
		byte fb = (byte)f;
		System.out.println(f);
		short fs = (short)f;
		System.out.println(f);
		char fc = (char)f; // 유니코드에 맞춰서 문자 출력
		System.out.println(fc);
		int fi = (int)f; //강제형변환 가능
		System.out.println(fi);
		long fl = (long)f; 
		System.out.println(fl);
		double fd = f; //실수형이라 소수점까지 출력
		System.out.println(fd); //double이 16진수라 소수점 16자리까지 표기
//		boolean fbool = f; boolean은 자기자신과만 가능!
//		System.out.println(fbool);

		
		//double
		System.out.println("\n===========double===========");
		System.out.println("double 타입의 값 : " + d);
		byte db = (byte)d;
		System.out.println(db);
		short ds = (short)d;
		System.out.println(ds);
		char dc = (char)d;
		System.out.println(dc);
		int di = (int)d; //강제형변환 가능
		System.out.println(di);
		long dl = (long)d;
		System.out.println(dl);
		float df = (float)d; //강제형변환 가능
		System.out.println(df);
		double dd = d;
		System.out.println(dd);
//		boolean dbool = d;
//		System.out.println(dbool);

		//boolean
		System.out.println("\n===========boolean===========");
		System.out.println("boolean 타입의 값 : " + bool);
//		int bi2 = (int)bool; boolean은 강제변환도 안됨, 자기자신끼리만 가능!
	
		
		
		
	}
}
