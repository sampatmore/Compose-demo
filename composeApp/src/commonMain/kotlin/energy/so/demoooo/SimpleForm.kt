package energy.so.demoooo

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun SimpleForm(
    modifier: Modifier = Modifier,
    onSubmit: (SimpleFormFields) -> Unit,
) {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var nickname by remember { mutableStateOf(TextFieldValue("")) }
    var favouriteFood by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = modifier) {
        TextField(value = name, placeholder = { Text("name") }, onValueChange = { name = it })
        TextField(value = nickname, placeholder = { Text("nickname") }, onValueChange = { nickname = it })
        TextField(value = favouriteFood, placeholder = { Text("favouriteFood") }, onValueChange = { favouriteFood = it })
        Button(
            content = { Text(text = "Submit") },
            onClick = { onSubmit(SimpleFormFields(name.text, nickname.text, favouriteFood.text)) })
    }
}

data class SimpleFormFields(
    val name: String,
    val nickname: String,
    val favouriteFood: String,
)