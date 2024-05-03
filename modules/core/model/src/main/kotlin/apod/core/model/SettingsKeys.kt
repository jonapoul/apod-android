package apod.core.model

import alakazam.kotlin.core.PrefPair

object SettingsKeys {
  val AppTheme = PrefPair(key = "appTheme", default = ThemeType.System)
}
