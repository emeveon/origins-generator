package web.theme

import org.jetbrains.compose.web.css.*

object Stylesheet : StyleSheet() {

    val container by style {
        display(DisplayStyle.Flex)
        padding(20.px)
        flexDirection(FlexDirection.Column)
    }

    val linebreak by style {
        display(DisplayStyle.Block)
        width(100.pc)
        color(Color.black)
        justifyContent(JustifyContent.Center)
    }

}