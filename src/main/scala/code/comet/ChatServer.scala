package code.comet

/**
 * Created by warzhou1 on 11/16/14.
 */

import net.liftweb._
import http._
import actor._

object ChatServer extends LiftActor with ListenerManager {

  private var msgs = Vector("Welcome")

  def createUpdate = msgs

  override def lowPriority = {
    case s: String => msgs :+= s; updateListeners()
  }

}
