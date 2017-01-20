package de.innfactory.components

import de.innfactory.router.AppRouter
import de.innfactory.router.AppRouter.{PAGE_FooPage, PAGE_HelloSriMobile, PAGE_SomePage}
import sri.core.{ReactComponent, ReactElement}
import sri.mobile.ReactNative
import sri.mobile.all.{isIOSPlatform, makeElementNoProps}
import sri.universal.components.{ScrollView, Text, TouchableOpacity, View}
import sri.universal.router
import sri.universal.router.{UniversalRouterComponent, UniversalRouterCtrl}
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by spoeck on 1/17/17.
  */
object SideMenu {


  def setCtrl(): Unit = {}


  @ScalaJSDefined
  class Component extends UniversalRouterComponent[Unit, Unit] {



    def render() = {
      View(style = styles.container)(
        ScrollView(style = styles.scrollView)(
          SideMenuComponent.apply(text="Home Page", onPress = () => replace(PAGE_HelloSriMobile), PAGE_HelloSriMobile == AppRouter.currentPage)(),
          SideMenuComponent.apply(text="Some Page", onPress = () => replace(PAGE_SomePage), PAGE_SomePage == AppRouter.currentPage)(),
          SideMenuComponent.apply(text="Foo Page", onPress = () => replace(PAGE_FooPage), PAGE_FooPage == AppRouter.currentPage)()
        )
      )
    }

  }


  object styles extends UniversalStyleSheet {

    val container = style(
      flex := 1,
      flexDirection := flexDirection.column.value,
      paddingTop := 64,
      backgroundColor := "#473d4c"
      )

    val scrollView = style(
      flex := 1
    )
  }

  js.constructorOf[Component].contextTypes = router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)


}
