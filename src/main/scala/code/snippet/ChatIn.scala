package code.snippet

import net.liftweb._
import http._
import js._
import JsCmds._
import JE._

import code.comet.ChatServer

/**
 * Created by warzhou1 on 11/16/14.
 */
object ChatIn {

  def render = SHtml.onSubmit(s => {
    ChatServer ! s
    SetValById("chat_in", "")
  })

}
