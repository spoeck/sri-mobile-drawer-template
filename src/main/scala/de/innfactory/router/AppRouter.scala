package de.innfactory.router


import de.innfactory.components.wrapper.DrawerWrapper
import sri.core.ReactElement
import de.innfactory.components.{FooPage, HelloSriMobile, RightButton, SideMenu, SomePage}
import sri.universal.components.{DefaultNavigationBar, View}
import sri.universal.router._
import sri.universal.styles.UniversalStyleSheet
import sri.universal.components.DefaultNavigationBar.Style


object AppRouter {

  object PAGE_HelloSriMobile extends StaticPage

  object PAGE_SomePage extends StaticPage

  object PAGE_FooPage extends StaticPage

  val sampleRightButton = () => RightButton()
  val sideMenu = () => SideMenu()
  var currentPage: Page = PAGE_HelloSriMobile

  object Config extends UniversalRouterConfig {


    override val initialRoute = defineInitialRoute(PAGE_HelloSriMobile, "Home", HelloSriMobile())

    staticRoute(PAGE_SomePage, "Some Page", SomePage(), rightButton = sampleRightButton)
    staticRoute(PAGE_FooPage, "Foo Page", FooPage(), rightButton = sampleRightButton)

    override val notFound = UniversalRouteNotFound(initialRoute._1)

    override def renderScene(route: NavigatorRoute, ctrl: UniversalRouterCtrl): ReactElement = {

      currentPage = route.page

      DrawerWrapper(
        children = View(style = UniversalStyleSheet.wholeContainer)(
          DefaultNavigationBar(CustomNavigationBarTheme),
          super.renderScene(route, ctrl)
        ),
        content = sideMenu.apply(),
        onCloseStart = () => {},
        onOpenStart = () => {},
        openDrawerOffset = 0.6,
        negotiatePan = true,
        panCloseMask = 0.6,
        panOpenMask = 0.1, // drag to open area
        captureGestures = true,
        tweenDuration = 100,
        tapToClose = true,
        type_wrapped = "displace",
        open = false)()
    }


  }



  val router = UniversalRouter(Config, style = styles.rootStyle)


}


object styles extends UniversalStyleSheet {

  val rootStyle = style(backgroundColor := "#343536")

}


object CustomNavigationBarTheme extends Style {

  override val navBar = styleE(super.navBar)(backgroundColor := "#343536", borderBottomColor := "#ED4721")

  override val navBarTitleText = styleE(super.navBarTitleText)(color := "orange")

  override val navBarLeftButton = super.navBarLeftButton

  override val navBarButtonText = styleE(super.navBarButtonText)(color := "white")

}

