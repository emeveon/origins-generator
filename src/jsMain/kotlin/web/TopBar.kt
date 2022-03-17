package web

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.attr
import org.jetbrains.compose.web.dom.*
import web.theme.Stylesheet

@Composable
fun header() {
    Div(
        attrs = { classes(Stylesheet.container) }
    ) {
        Div({
            style {
                textAlign("center")
                fontFamily("Lucida Console")
                fontSize(50.px)
            }
        }) {
            Text("Origins Generator")
        }
        Div({
            style {
                flexGrow(1)
                justifyContent(JustifyContent.FlexEnd)
                textAlign("end")
            }
        }) {
            A(href = "https://github.com/emeveon/origins-generator") {
                Text("Github")
            }
        }
        Hr(attrs = {
            classes(Stylesheet.linebreak)
        })
    }
}