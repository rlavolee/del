package model.metainfo

import java.math.BigInteger
import java.nio.file.{Files, Paths}

import helper.{Encoding, MD5, SHA1}
import model.Path
import play.api.libs.json.{Json, OFormat}

case class Info
(
  length: Int,
  name: String,
  pieceLength: Int = 262144, //262144 or 524288 or 1048576
  pieces: String,
  md5sum: String
)

object Info {

  implicit val format: OFormat[Info] = Json.format[Info]

  def apply(p: Path): Info = {
    val bytes: Array[Byte] = Files.readAllBytes(Paths.get(p.value))
    val s: List[Array[Byte]] = bytes.grouped(262144).toList

    def hash(b: Array[Byte]): String = {
      new String(SHA1(b), Encoding.utf8)
    }

    val m = new BigInteger(1, MD5(bytes)).toString(16)

    Info(bytes.length, p.value.split("/").last, pieces = s.map(x=> hash(x)).mkString, md5sum = m)
  }
}