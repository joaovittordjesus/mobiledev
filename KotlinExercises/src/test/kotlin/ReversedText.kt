fun main(args: Array<String>){
    println("Type a text: ");
    val text = readLine();

    fun textReverse(text:  String): String{
        return text.reversed();
    }

     if (text != null){
         val  reversedText = textReverse(text);
         println("Reversed text: "+ reversedText);
     }else{
         println("Invalid text!!!");
     }
}