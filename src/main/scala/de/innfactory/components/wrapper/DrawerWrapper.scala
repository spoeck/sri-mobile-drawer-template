package de.innfactory.components.wrapper

import sri.core.{React, ReactClass, ReactElement, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSImport

/**
  * Created by spoeck on 1/16/17.
  */
case class DrawerWrapper(
                          acceptDoubleTap: js.UndefOr[Boolean] = js.undefined,
                          acceptPan: js.UndefOr[Boolean] = js.undefined,
                          acceptTap: js.UndefOr[Boolean] = js.undefined,
                          captureGestures: js.UndefOr[Boolean] = js.undefined, // true, false, 'open', 'closed'
                          children: ReactElement,
                          closedDrawerOffset: js.UndefOr[Int] = js.undefined,
                          content: ReactElement,
                          disabled: js.UndefOr[Boolean] = js.undefined,
                          elevation: js.UndefOr[Double] = js.undefined,
                          initializeOpen: js.UndefOr[Boolean] = js.undefined,
                          open: js.UndefOr[Boolean] = js.undefined,
                          negotiatePan: js.UndefOr[Boolean] = js.undefined,
                          onClose: js.UndefOr[js.Function] = js.undefined,
                          onCloseStart: js.Function,
                          onOpen: js.UndefOr[js.Function] = js.undefined,
                          onOpenStart: js.Function,
                          openDrawerOffset: Double,
                          panThreshold: js.UndefOr[Double] = js.undefined,
                          panCloseMask: js.UndefOr[Double] = js.undefined,
                          panOpenMask: js.UndefOr[Double] = js.undefined,
                          side: js.UndefOr[String] = js.undefined, // 'left' 'right'
                          styles: js.UndefOr[js.Object] = js.undefined,
                          tapToClose: js.UndefOr[Boolean] = js.undefined,
                          tweenDuration: js.UndefOr[Int] = js.undefined,
                          tweenEasing: js.UndefOr[String] = js.undefined,
                          tweenHandler: js.UndefOr[js.Function] = js.undefined,
                          type_wrapped: js.UndefOr[String] = js.undefined, // 'overlay', 'static', 'displace'
                          useInteractionManager: js.UndefOr[Boolean] = js.undefined
                        ) {


  def toJS = {
    val p = js.Dynamic.literal()
    acceptDoubleTap.foreach(v => p.updateDynamic("acceptDoubleTap")(v))
    acceptPan.foreach(v => p.updateDynamic("acceptPan")(v))
    acceptTap.foreach(v => p.updateDynamic("onOpen")(v))
    captureGestures.foreach(v => p.updateDynamic("captureGestures")(v))
    p.updateDynamic("children")(children)
    closedDrawerOffset.foreach(v => p.updateDynamic("closedDrawerOffset")(v))
    p.updateDynamic("content")(content)
    disabled.foreach(v => p.updateDynamic("disabled")(v))
    elevation.foreach(v => p.updateDynamic("elevation")(v))
    initializeOpen.foreach(v => p.updateDynamic("initializeOpen")(v))
    open.foreach(v => p.updateDynamic("open")(v))
    negotiatePan.foreach(v => p.updateDynamic("negotiatePan")(v))
    onClose.foreach(v => p.updateDynamic("onClose")(v))
    p.updateDynamic("onCloseStart")(onCloseStart)
    onOpen.foreach(v => p.updateDynamic("onOpen")(v))
    p.updateDynamic("onOpenStart")(onOpenStart)
    p.updateDynamic("openDrawerOffset")(openDrawerOffset)
    panThreshold.foreach(v => p.updateDynamic("panThreshold")(v))
    panCloseMask.foreach(v => p.updateDynamic("panCloseMask")(v))
    panOpenMask.foreach(v => p.updateDynamic("panOpenMask")(v))
    side.foreach(v => p.updateDynamic("side")(v))
    styles.foreach(v => p.updateDynamic("styles")(v))
    tapToClose.foreach(v => p.updateDynamic("tapToClose")(v))
    tweenDuration.foreach(v => p.updateDynamic("tweenDuration")(v))
    tweenEasing.foreach(v => p.updateDynamic("tweenEasing")(v))
    tweenHandler.foreach(v => p.updateDynamic("tweenHandler")(v))
    type_wrapped.foreach(v => p.updateDynamic("type")(v))
    useInteractionManager.foreach(v => p.updateDynamic("useInteractionManager")(v))
    p
  }

  def apply(children: ReactNode*) = {
    // access real js component , make sure you wrap with createFactory (this is needed from 0.13 onwards)
    React.createElement(DrawerClass,toJS,children:_*)
  }

}


@js.native
@JSImport("react-native-drawer",JSImport.Default)
object DrawerClass extends ReactClass
