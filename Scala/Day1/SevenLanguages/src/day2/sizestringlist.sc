object sizestringlist {
 val list = List("Heather", "Luke", "Storm")      //> list  : List[java.lang.String] = List(Heather, Luke, Storm)
 val sizeStringList = (0 /: list) {(sum, i) => sum + i.size}
                                                  //> sizeStringList  : Int = 16
}