package de.inncart.components

import de.inncart.components.NavDrawer.styles.{backgroundColor, flexOne, style}
import de.inncart.components.RightButton.styles.{color, marginRight, style}
import sri.core.{ReactComponent, ReactElement}
import sri.mobile.ReactNative
import sri.mobile.all.{isIOSPlatform, makeElementNoProps}
import sri.universal.components.{Text, TouchableOpacity, View}
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by spoeck on 1/17/17.
  */
object SideMenu {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
        Text()(s"Here is the side menu!!")
      )
    }
  }

  object styles extends UniversalStyleSheet {

    val container = style(flexOne,
      backgroundColor := "rgb(162, 3, 112)",
      justifyContent.center,
      alignItems.center)
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)


}
