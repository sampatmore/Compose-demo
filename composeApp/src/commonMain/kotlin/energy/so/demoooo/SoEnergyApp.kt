package energy.so.demoooo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SoEnergyApp() {

    MaterialTheme {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Menu()
            Body()
        }
    }
}

@Composable
fun Menu() {
    Text(
        modifier = Modifier.background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp),
        text = "menu"
    )
}

@Composable
fun Body() {
    Column {
        // Top Video
        Text(
            modifier = Modifier.background(Color.Green)
                .fillMaxWidth()
                .height(400.dp),
            text = "Video section",
        )
        CommonTitleSubtitleRowComponent(
            modifier = Modifier.background(Color.Red),
            title = "What we do",
            subtitle = "We're all about making life easier for you.\n" +
                    "Simple solutions for your energy needs.",
        )
        CommonTitleSubtitleRowComponent(
            modifier = Modifier.background(Color.DarkGray),
            title = "Why So Energy?",
            subtitle = "Energy doesn't have to be complicated. From honest pricing to UK-based customer support, we make switching, saving, and being sustainable simple.",
        )
        CommonTitleSubtitleRowComponent(
            modifier = Modifier.background(Color.Magenta),
            title = "common row component 3",
            subtitle = "common row component 3",
        )
    }
}

@Composable
private fun CommonTitleSubtitleRowComponent(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp),
        text = title
    )
    Text(
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp),
        text = subtitle
    )
}

