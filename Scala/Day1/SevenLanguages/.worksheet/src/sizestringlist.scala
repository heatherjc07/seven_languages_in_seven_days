object sizestringlist {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
 val list = List("Heather", "Luke", "Storm");System.out.println("""list  : List[java.lang.String] = """ + $show(list ));$skip(61); 
 val sizeStringList = (0 /: list) {(sum, i) => sum + i.size};System.out.println("""sizeStringList  : Int = """ + $show(sizeStringList ))}
}