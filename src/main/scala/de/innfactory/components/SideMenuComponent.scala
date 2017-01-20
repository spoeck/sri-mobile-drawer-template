package de.innfactory.components

import de.innfactory.router.AppRouter
import sri.core.ReactElement
import sri.mobile.ReactNative
import sri.mobile.all.{isIOSPlatform, makeElementNoProps}
import sri.universal.components.{Text, TouchableOpacity}
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet
import sri.core.ElementFactory._
import sri.core.{ReactElement, ReactNode}
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by spoeck on 1/19/17.
  */
object SideMenuComponent {

  case class Props(text: String, onPress: () => _, active: Boolean)

  val Component = (props: Props, children: ReactElement) => {
    TouchableOpacity(onPress = props.onPress)(
      View(style = if (props.active) styles.borderViewActive else styles.borderView)(
        Text(style = styles.text)(props.text)
      )
    )

  }


  object styles extends UniversalStyleSheet {


    val text = style(
      color := "white",
      paddingVertical := 10
    )

    val borderView = style(
      flex := 1,
      flexDirection := flexDirection.column.value,
      alignItems := alignItems.center.value,
      justifyContent := justifyContent.center.value,
      borderBottomColor := "rgb(120, 120, 120)",
      borderBottomWidth := 0.2,
      borderTopColor := "rgb(120, 120, 120)",
      borderTopWidth := 0.2
    )

    val borderViewActive = style(
      flex := 1,
      flexDirection := flexDirection.column.value,
      alignItems := alignItems.center.value,
      justifyContent := justifyContent.center.value,
      borderBottomColor := "rgb(120, 120, 120)",
      borderBottomWidth := 0.2,
      borderTopColor := "rgb(120, 120, 120)",
      borderTopWidth := 0.2,
      backgroundColor := "#8D0000"
    )

  }


  def apply(text: String, onPress: () => _, active: Boolean)(children: ReactNode*) =
    createStatelessFunctionElementWithChildren(Component, Props(text, onPress, active))(children: _*)

}
