fun WhenExpression(){
    val extname = ".kt"
    when(extname){
        ".kt"-> println("Kotlin File")
        ".java"-> println("Java File")
        else-> println("Unknow")
    }
}

fun WhenExpression2(){
    val country = "Thailand"
    when(country){
        "UK","USA","AUS"-> println("English")
        "Korea","Loa","Japan" -> println("Bangkok")
        "China","Taiwan","Hong Kong" -> println("Chinese")
    }
}

fun WhenExpression3(){
    val device = "Oppo"
    val os = when(device){
        "Oppo","Vivo","Sumsung" -> "Android"
        "iPhone" -> "ios"
        "iPad" -> "iPadOS"
        else -> "Unknow"
    }
    println(os)
}