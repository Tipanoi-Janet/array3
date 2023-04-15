fun main(){
    var friends = arrayOf("Jane", "Wanda", "Chris", "John", "Mary", "Vee", "Ann", "Bree")
  println(friends[0])
   println(friends.get(4))
   (friends.set(4, "Fiona"))
    friends[3] = "David"

   println(friends.contentToString())
    var friend2023 = friends.plus("Brenda")
    val febFriends = arrayOf("Bella", "Thimothy")
  var latestFriends = friend2023.plus(febFriends)
    println(latestFriends.contentToString())
    school()

}
fun school(){
    val text = "Banana"
    println(text[0])
}

fun text() {
    val message = "PA4782DHUE. Confirmed"
    val message2 = "PA4782DHUE. Confirmed"
    if (message.equals(message2)) {
        println(true)
    } else {
        println(false)
    }

}










