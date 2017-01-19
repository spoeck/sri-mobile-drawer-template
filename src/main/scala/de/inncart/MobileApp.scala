package de.inncart

import de.inncart.router.AppRouter
import sri.mobile.ReactNative
import sri.mobile.all._

import scala.scalajs.js.JSApp


object MobileApp extends JSApp {

  def main() = {

    val root = createReactNativeRoot(
      AppRouter.router
    )
    ReactNative.AppRegistry.registerComponent("SriMobileTemplate", () => root)
  }
}
