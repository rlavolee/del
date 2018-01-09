package model.metainfo

import java.time.Instant

import helper.Encoding

case class Metainfo
(
  info: Info,
  announce: String,
  announceList: List[String],
  creationDate: Instant = Instant.now(),
  comment: Option[String],
  createdBy: String,
  encoding: String = Encoding.utf8
)

object Metainfo
