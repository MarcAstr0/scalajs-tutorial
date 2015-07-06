package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

/**
 * Created by mcastro on 06-07-2015.
 */
object TutorialApp extends JSApp {
  def main(): Unit = {
//    println("Hello world!")
    appendPar(document.body, "Hello world!")
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
}
