class  Test02_TC1{
	public static void main(String[] args) {

        long l1 = 10;
        float f1 = l1;
        
		System.out.println("l1: "+ l1);
		System.out.println("f1: "+ f1);

        long l2 = 94847837358l;
        float f2 = l2;
        System.out.println("l2: "+ l2);
        System.out.println("f2: "+f2);

        float f3 = 10.4f;
        // long l3 = f3;
        long l3 = (long)f3;
        System.out.println("l3: "+ l3);
        System.out.println("f3: "+ f3);
    }
}