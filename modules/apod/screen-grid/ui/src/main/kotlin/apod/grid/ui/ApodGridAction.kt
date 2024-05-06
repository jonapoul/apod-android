package apod.grid.ui

import androidx.compose.runtime.Immutable
import apod.core.model.ApiKey
import apod.core.model.ApodItem
import kotlinx.datetime.LocalDate

@Immutable
internal sealed interface ApodGridAction {
  data object RegisterForApiKey : ApodGridAction
  data object NavBack : ApodGridAction
  data object NavSettings : ApodGridAction
  data class NavToItem(val item: ApodItem) : ApodGridAction
  data object LoadRandom : ApodGridAction
  data class LoadPrevious(val date: LocalDate) : ApodGridAction
  data class LoadNext(val date: LocalDate) : ApodGridAction
  data class RetryLoad(val key: ApiKey, val date: LocalDate?) : ApodGridAction
  data class SearchMonth(val current: LocalDate?) : ApodGridAction
}
