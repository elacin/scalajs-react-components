package chandu0101.scalajs.react.components
package materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`

/**
 * This file is generated - submit issues instead of PR against it
 */
    
case class MuiFlatButton(
  key:                  js.UndefOr[String]                          = js.undefined,
  ref:                  js.UndefOr[String]                          = js.undefined,
  /* Color of button when mouse is not hovering over it.*/
  backgroundColor:      js.UndefOr[MuiColor]                        = js.undefined,
  /* Disables the button if set to true.*/
  disabled:             js.UndefOr[Boolean]                         = js.undefined,
  /* Color of button when mouse hovers over.*/
  hoverColor:           js.UndefOr[MuiColor]                        = js.undefined,
  /* URL to link to when button clicked if `linkButton` is set to true.*/
  href:                 js.UndefOr[String]                          = js.undefined,
  /* Use this property to display an icon.*/
  icon:                 js.UndefOr[ReactNode]                       = js.undefined,
  /* Label for the button.*/
  label:                js.UndefOr[String]                          = js.undefined,
  /* Place label before or after the passed children.*/
  labelPosition:        js.UndefOr[BeforeAfter]                     = js.undefined,
  /* Override the inline-styles of the button's label element.*/
  labelStyle:           js.UndefOr[CssProperties]                   = js.undefined,
  /* Enables use of `href` property to provide a URL to link to if set to true.*/
  linkButton:           js.UndefOr[Boolean]                         = js.undefined,
  /* Called when element is focused by the keyboard.*/
  onKeyboardFocus:      js.UndefOr[ReactKeyboardEventH => Callback] = js.undefined,
  /* Called when the mouse enters the element.*/
  onMouseEnter:         js.UndefOr[ReactMouseEventH => Callback]    = js.undefined,
  /* Called when the mouse leaves the element.*/
  onMouseLeave:         js.UndefOr[ReactMouseEventH => Callback]    = js.undefined,
  /* Called when a touch event is started inside the element.*/
  onTouchStart:         js.UndefOr[ReactTouchEventH => Callback]    = js.undefined,
  /* If true, colors button according to
primaryTextColor from the Theme.*/
  primary:              js.UndefOr[Boolean]                         = js.undefined,
  /* Color for the ripple after button is clicked.*/
  rippleColor:          js.UndefOr[MuiColor]                        = js.undefined,
  /* If true, colors button according to secondaryTextColor from the theme.
The primary prop has precendent if set to true.*/
  secondary:            js.UndefOr[Boolean]                         = js.undefined,
  /* Override the inline-styles of the root element.*/
  style:                js.UndefOr[CssProperties]                   = js.undefined,
  /* (Passed on to EnhancedButton)*/
  centerRipple:         js.UndefOr[Boolean]                         = js.undefined,
  /* default: button: This component will render a button element by default and an anchor element if linkButton is set to true. However, you can override this behavior by passing in a string or another react element into this prop. This is useful for generating link buttons with the react router link element.
  (Passed on to EnhancedButton)*/
  containerElement:     js.UndefOr[String | ReactElement]           = js.undefined,
  /* (Passed on to EnhancedButton)*/
  disableFocusRipple:   js.UndefOr[Boolean]                         = js.undefined,
  /* (Passed on to EnhancedButton)*/
  disableKeyboardFocus: js.UndefOr[Boolean]                         = js.undefined,
  /* (Passed on to EnhancedButton)*/
  disableTouchRipple:   js.UndefOr[Boolean]                         = js.undefined,
  /* (Passed on to EnhancedButton)*/
  focusRippleColor:     js.UndefOr[MuiColor]                        = js.undefined,
  /* (Passed on to EnhancedButton)*/
  focusRippleOpacity:   js.UndefOr[Double]                          = js.undefined,
  /* (Passed on to EnhancedButton)*/
  keyboardFocused:      js.UndefOr[Boolean]                         = js.undefined,
  /* (Passed on to EnhancedButton)*/
  onBlur:               js.UndefOr[ReactEventH => Callback]         = js.undefined,
  /* (Passed on to EnhancedButton)*/
  onFocus:              js.UndefOr[ReactFocusEventH => Callback]    = js.undefined,
  /* (Passed on to EnhancedButton)*/
  onKeyDown:            js.UndefOr[ReactKeyboardEventH => Callback] = js.undefined,
  /* (Passed on to EnhancedButton)*/
  onKeyUp:              js.UndefOr[ReactKeyboardEventH => Callback] = js.undefined,
  /* (Passed on to EnhancedButton)*/
  onTouchTap:           js.UndefOr[ReactTouchEventH => Callback]    = js.undefined,
  /* (Passed on to EnhancedButton)*/
  tabIndex:             js.UndefOr[Double]                          = js.undefined,
  /* (Passed on to EnhancedButton)*/
  touchRippleColor:     js.UndefOr[MuiColor]                        = js.undefined,
  /* (Passed on to EnhancedButton)*/
  touchRippleOpacity:   js.UndefOr[Double]                          = js.undefined,
  /* (Passed on to EnhancedButton)*/
  `type`:               js.UndefOr[String]                          = js.undefined){
  /**
   * @param children This is what will be displayed inside the button.
If a label is specified, the text within the label prop will
be displayed. Otherwise, the component will expect children
which will then be displayed. (In our example,
we are nesting an `<input type="file" />` and a `span`
that acts as our label to be displayed.) This only
applies to flat and raised buttons.
   */
  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiFlatButton](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.FlatButton)
    if (children.isEmpty)
      f(props).asInstanceOf[ReactComponentU_]
    else if (children.size == 1)
      f(props, children.head).asInstanceOf[ReactComponentU_]
    else
      f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
