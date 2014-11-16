package code.comet

import net.liftweb._
import http._
import util._
import Helpers._

/**
 * Created by warzhou1 on 11/16/14.
 */
class Chat extends CometActor with CometListener{

  private var msgs: Vector[String] = Vector()

  def registerWith = ChatServer

  override def lowPriority = {
    case v: Vector[String] => msgs = v; reRender()
  }

  def render = "li *" #> msgs & ClearClearable
}


