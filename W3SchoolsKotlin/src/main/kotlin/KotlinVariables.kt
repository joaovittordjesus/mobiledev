fun main(args: Array<String>){

    var name = "João";//Variable that can be changed no need to declare its type
    val birthyear = 2003;//Can't
    println(name);
    println(birthyear);

    var nome: String = "John"; //String
    val anoNascimento: Int = 1975;

    println(nome);
    println(anoNascimento);

    //This works fine
    var nombre : String;
    nombre = "Ruan";
    println(nombre);

    /*THis will generate an error
    var Namae;
    Namae = "Kato";
    println*/

    //Val notes
    //birthyear = 2002;
    //println(birthyear);
    val pi = 3.14159265359
    println(pi);
}
