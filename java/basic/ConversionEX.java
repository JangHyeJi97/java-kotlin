class ConversionEx {
	public static void main(String[] args) {
		int n1 = 'A', n2 = 'z', n3 = 'a', n4 = 'z';
		int n5 = '0', n6 = '9', n7 = '°¡', n8 = 'ÆR';
		System.out.println("A : " + n1 + ", Z : " + n2 + ", a : " + n3 + ", z : " + n4);
		// A : 65, Z : 122, a : 97, z : 122
		System.out.println("0 : " + n5 + ", 9 : " +n6 + ", °¡ : " + n7 + ", ÆR : " + n8);
		// 0 : 48, 9 : 57, °¡ : 44032, ÆR : 55203


		
		double d1 = 123; // Á¤¼ö´Â ½Ç¼ö·Î ÀÚµ¿ Çüº¯È¯ÀÌ °¡´ÉÇÏ¹Ç·Î ½Ç¼öÇü º¯¼ö¿¡ ¹Ù·Î ³ÖÀ» ¼ö ÀÖÀ½
		int i1 = (int)3.14; // ½Ç¼ö´Â Á¤¼ö·Î ÀÚµ¿ Çüº¯È¯ÀÌ ºÒ°¡´ÉÇÏ¹Ç·Î ¸í½ÃÀûÀ¸·Î º¯È¯ ÈÄ ³Ö¾î¾ß ÇÔ
		System.out.println("d1 : " + d1);
		// d1 : 123.0
	}
}
