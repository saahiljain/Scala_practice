package lectures

import scala.util.Try

object HandlingFailure extends App{
  def unsafeMethod():String =throw new RuntimeException("No String for u buster")
  def backupMethod():String ="A valid Result"
  val fallbackTry=Try(unsafeMethod()).orElse(Try(backupMethod()))



}
