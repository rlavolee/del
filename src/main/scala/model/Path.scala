package model

case class Path(value: String) extends AnyVal {
  override def toString: String = value
}

object Path