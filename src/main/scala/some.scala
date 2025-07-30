object some {
def main (args : Array [String]): Unit =
  {
//    var name = "Text"
//    name =  None
//    println(name.length)
//
    val name1 = None
    val length = name1.getOrElse(" kuch nai")
    println(length)

    var nickName:Option [String]=Some("AAA")
    val displayName=nickName.getOrElse("NoNickName")
    println(displayName)
    nickName=None
    val displayName1=nickName.getOrElse("No nickname")
    println(displayName1)

  }
}
