package net.ui8.jobseek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import net.ui8.jobseek.navigation.SetupMainNavGraph
import net.ui8.jobseek.ui.theme.JobseekTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JobseekTheme {
                val navController = rememberNavController()
                SetupMainNavGraph(
                    navController = navController,
                )
            }
        }
    }
}
