package net.ui8.jobseek.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = GreenPure,
    secondary = Blue,
    tertiary = Purple,

    surface = Bg,
    onSurface = Black,
    onSurfaceVariant = Grey_60,

    surfaceContainer = PureWhite,
)

private val DarkColorScheme = darkColorScheme(
    primary = GreenPure,
    secondary = Blue,
    tertiary = Purple,

    surface = DarkModeBg,
    onSurface = DarkModeWhite,
    onSurfaceVariant = Grey_60,

    surfaceContainer = DarkModeSubBg,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun JobseekTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
