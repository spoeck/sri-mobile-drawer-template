package de.innfactory.components

import sri.core.ElementFactory.makeElement
import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.universal.components.{Image, ImageSource, Text, View}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by spoeck on 1/5/17.
  */
object SomePage {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
        Text(style = styles.text)(s"Some Page"),
        Image(style = styles.image, source = ImageSource(uri = "http://www.scala-js.org/images/scala-js-logo-256.png"))(),
        Text(style = styles.text)("This is another Page!")
      )
    }

  }


  def apply() = makeElement[Component]


  object styles extends UniversalStyleSheet {

    val container = style(flexOne,
      backgroundColor := "lightgrey",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight._500,
      fontSize := 18,
      color := "white")

  }

}