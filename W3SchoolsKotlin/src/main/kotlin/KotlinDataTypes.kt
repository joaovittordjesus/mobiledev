fun main(args: Array<String>){
    val myNum: Int = 5;
    val myDouble: Double = 1.99;
    val myLetter: Char = 'J'
    val myBoolean: Boolean = true;
    val myText: String = "Hello";
    //Integer Types
    val myByte: Byte = 127;// -128
    println("Byte: "+ myByte);
    val myShort: Short = -32768;//to 32767
    println("Short: "+ myShort);
    val myInt: Int = -2147483648;//to 2147483647
    println("Int: "+ myInt);
    val myLong: Long = -9223372036854775807L;//to 9223372036854775807L
    println("Long: "+ myLong);

    val myNum1 = 2147483647//Int
    val myNum2 = 2147483648//Long
    //Floating Point Types
    val meuNumero: Float = 1.8F;
    println("Altura: "+ meuNumero);
    val myNumber: Double = 20.1;
    print("Idade: "+ myNumber);
    //Scientific Numbers
    val variavel1: Float = 35e3F;
    val variavel2: Double = 12e4;
    println("35e3F = "+ variavel1);
    println("12e4 = "+ variavel2);
    //Booleans
    val isKotlinFun: Boolean = false;
    val isFishTasty: Boolean = true;
    println(isKotlinFun);
    println(isFishTasty);
    //Characters(Char)
    val myGrade: Char = 'A';
    println(myGrade);
    // Can't use ASCII values
    //String("")
    val myTexto: String = "Nihao Mundo!"
    println(myTexto);
    //Type Conversion
    /*val x: Int = 5;
    val y: Long = x;//Error
    println(y);*/

    val x: Int = 5;
    val y: Long = x.toLong();
    println(y);





}