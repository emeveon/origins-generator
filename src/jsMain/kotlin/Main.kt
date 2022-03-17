import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import data.powers.PowerType
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import web.header
import web.theme.Stylesheet

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Style(Stylesheet)
        Div({ style { padding(25.px) } }) {
            header()
            Button(attrs = {
                onClick { count -= 1
                }
            }) {
                Text("-")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }

            Div({style {flexDirection(FlexDirection.Column)}}){
                for (i in 0..count) {
                    if (i < PowerType.values().size) {
                        Div {
                            Text(PowerType.values()[i].name)
                        }
                    }
                }
            }

        }
    }
}

