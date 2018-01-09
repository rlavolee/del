package helper

import java.security.MessageDigest

object SHA1 {
  def apply(bytes: Array[Byte]): Array[Byte] =
    MessageDigest.getInstance("SHA-1").digest(bytes)
}
