package helper

import java.security.MessageDigest

object MD5 {
  def apply(bytes: Array[Byte]): Array[Byte] =
    MessageDigest.getInstance("MD5").digest(bytes)
}
