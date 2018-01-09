import java.nio.file.{Files, Paths}

import model.Path
import model.metainfo.Info
import uncle.UncleB

object Main extends App {

  private val p = Path("/Users/remi/Sites/del/src/main/scala/body.png")
//  val bytes: Array[Byte] = Files.readAllBytes(Paths.get(filePath))
//  val s: List[Array[Byte]] = bytes.grouped(262144).toList
//
//  def sha1(b: Array[Byte]): String = {
//    new String(java.security.MessageDigest.getInstance("SHA-1").digest(b), "UTF-8")
//  }
//
//  val p = s.map(x=> sha1(x))

  println(UncleB.toBen(Info(p)).toJson)
}
