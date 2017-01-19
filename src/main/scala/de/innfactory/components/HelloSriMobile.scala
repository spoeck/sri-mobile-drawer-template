package de.innfactory.components

import sri.core.ElementFactory._
import sri.core.{ReactComponent, ReactElement}
import sri.mobile.ReactNative
import de.innfactory.router.AppRouter.Second
import sri.universal.components._
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet
import sri.universal.router
import sri.universal.router.{UniversalRouterComponent, _}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


object HelloSriMobile {

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Unit, Unit] {
    override def render(): ReactElement = View(style = styles.container)(
      Text(style = styles.text)(s"Welcome to Sri Mobile(${ReactNative.Platform.OS})"),
      Image(style = styles.image, source = ImageSource(uri = "http://www.scala-js.org/images/scala-js-logo-256.png"))(),
      Text(style = styles.text)("Scala.js - Future of app development!"),
      Button(title = "Klick mich!", onPress = () => navigateTo(Second))()
    )

  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply() = makeElement[Component]


  object styles extends UniversalStyleSheet {

    val container = style(flexOne,
      backgroundColor := "rgb(162, 3, 112)",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight._500,
      fontSize := 18,
      color := "white")

  }

}

