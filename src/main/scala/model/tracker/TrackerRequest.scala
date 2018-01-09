package model.tracker

case class TrackerRequest
(
  infoHash: String,
  peerId: String,
  port: Int,
  uploaded: Int,
  downloaded: Int,
  left: Int,
  compact: Boolean,
  noPeerId: Option[Boolean],
  event: Event,
  numwant: Int = TrackerRequest.defaultNumPeers
)

object TrackerRequest {
  val defaultNumPeers = 50
}

sealed trait Event

case object Started extends Event
case object Stopped extends Event
case object Completed extends Event
case object Empty extends Event