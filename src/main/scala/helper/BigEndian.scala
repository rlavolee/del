package helper

case class BigEndian(value: String) extends AnyVal {
  override def toString: String = value
}

object BigEndian