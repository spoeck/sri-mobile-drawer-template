package de.inncart.components

import sri.core.ElementFactory.makeElement
import sri.core.ReactElement
import sri.mobile.ReactNative
import de.inncart.components.HelloSriMobile.styles._
import de.inncart.components.wrapper.DrawerWrapper
import de.inncart.router.AppRouter.Second
import sri.universal.components._
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet

import scala.runtime.Nothing$
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by spoeck on 1/6/17.
  */
object NavDrawer {

  val sideMenu = () => SideMenu()

  var child: ReactElement = null;

  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Unit, Unit] {

    override def render(): ReactElement = DrawerWrapper(
      children = child,
      content = sideMenu.apply(),
      onCloseStart = ()=>{},
      onOpenStart = ()=>{},
      openDrawerOffset = 0.6,
      negotiatePan = true,
      panCloseMask = 0.6,
      tweenDuration = 100,
      tapToClose= true,
      type_wrapped = "displace",
      open = true)()

  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply() = makeElement[Component]

  def routeTo(child: ReactElement): Unit = {
    this.child = child
  }


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
