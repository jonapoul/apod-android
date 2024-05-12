package nasa.apod.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
  version = 1,
  exportSchema = true,
  entities = [
    ApodEntity::class,
  ],
)
@TypeConverters(
  ApodMediaTypeConverter::class,
  LocalDateTypeConverter::class,
)
abstract class ApodDatabase : RoomDatabase() {
  abstract fun apodDao(): ApodDao
}