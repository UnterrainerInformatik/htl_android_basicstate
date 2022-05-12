import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import info.unterrainer.android.basicstate.StatefulCounter
import info.unterrainer.android.basicstate.WaterCounter
import info.unterrainer.android.basicstate.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}