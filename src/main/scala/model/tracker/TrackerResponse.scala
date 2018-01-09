package model.tracker

import java.time.Duration

import play.api.libs.json.{Json, OFormat}

sealed trait TrackerResponse

case class Success
(
  warningMessage: Option[String],
  interval: Duration,
  minInterval: Option[Duration],
  trackerId: String,
  complete: Int,
  incomplete: Int,
  peers: List[Peer]
) extends TrackerResponse

case class Fail
(
  failureReason: String
) extends TrackerResponse

object Success {
  implicit val format: OFormat[Success] = Json.format[Success]
}

object Fail {
  implicit val format: OFormat[Fail] = Json.format[Fail]
}