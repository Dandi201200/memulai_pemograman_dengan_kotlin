data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("dandi", 19)
    val dataUser2 = DataUser("dandi", 19)
    val dataUser3 = DataUser("dustin", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

}