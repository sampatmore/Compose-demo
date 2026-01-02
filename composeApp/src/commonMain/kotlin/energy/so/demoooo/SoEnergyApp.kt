package energy.so.demoooo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
        Text(
            modifier = Modifier.background(Color.Red)
                .fillMaxWidth()
                .height(400.dp),
            text = "common row component 1"
        )
        Text(
            modifier = Modifier.background(Color.DarkGray)
                .fillMaxWidth()
                .height(400.dp),
            text = "common row component 2"
        )
        Text(
            modifier = Modifier.background(Color.Magenta)
                .fillMaxWidth()
                .height(400.dp),
            text = "common row component 3"
        )
    }
}
