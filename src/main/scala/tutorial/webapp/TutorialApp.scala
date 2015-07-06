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
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello world!</p>")
    jQuery("body").append("<ul id=\"the-list\"></ul>")
    val list = List("First element", "Second element")
    for (item <- list) {
      jQuery("#the-list").append("<li>" + item + "</li>")
    }
  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}
