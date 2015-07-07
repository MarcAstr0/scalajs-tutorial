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
    jQuery("""<button type="button">Click me!</button>""").click(addClickedMessage _).appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello world!</p>")
    jQuery("body").append("<ul id=\"the-list\"></ul>")
    val list = List("First element", "Second element")
    for (item <- list) {
      jQuery("#the-list").append("<li>" + item + "</li>")
    }
    jQuery("body").append("<p id=\"some-id\">This paragraph will turn red when the button is clicked.</p>")
    jQuery("""<button type="button">Click to change color</button>""").click(changeColor _).appendTo(jQuery("body"))
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }

  def changeColor(): Unit = {
    if (jQuery("#some-id").hasClass("red")) jQuery("#some-id").removeClass("red") else jQuery("#some-id").addClass("red")
  }

}
