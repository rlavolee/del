package model.tracker

import helper.BigEndian
import play.api.libs.json.{Json, OFormat}

case class Peer
(
  id: String,
  ip: String,
  port: Int
)

object Peer {

  implicit val format: OFormat[Peer] = Json.format[Peer]

  def apply(be: BigEndian): Peer = ???
}