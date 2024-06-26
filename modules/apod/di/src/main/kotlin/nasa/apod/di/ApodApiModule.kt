package nasa.apod.di

import alakazam.android.core.IBuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import nasa.apod.data.api.ApodApi
import nasa.apod.data.api.ApodJson
import nasa.core.http.buildOkHttp
import nasa.core.http.buildRetrofit
import nasa.core.model.NASA_API_URL
import retrofit2.create
import timber.log.Timber

@Module
@InstallIn(SingletonComponent::class)
internal class ApodApiModule {
  @Provides
  fun api(buildConfig: IBuildConfig): ApodApi = buildRetrofit(
    client = buildOkHttp(buildConfig.debug) { Timber.tag("APOD").v(it) },
    json = ApodJson,
    url = NASA_API_URL,
  ).create()
}
