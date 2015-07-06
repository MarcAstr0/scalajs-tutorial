package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

/**
 * Created by mcastro on 06-07-2015.
 */
object TutorialApp extends JSApp {
  def main(): Unit = {
//    println("Hello world!")
    jQuery("body").append("<p>Hello world!</p>")
    appendUl(document.body, List("First element", "Second Element", "Third Element"))
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  def appendUl(targetNode: dom.Node, list: List[String]): Unit = {
    val ul = document.createElement("ul")
    for (item <- list) {
      val li = document.createElement("li")
      li.appendChild(document.createTextNode(item))
      ul.appendChild(li)
    }
    document.body.appendChild(ul)
  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}
