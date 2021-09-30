package np.com.ngimasherpa.databasemigration.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import np.com.ngimasherpa.databasemigration.room.entities.TestEntity
import np.com.ngimasherpa.databasemigration.room.entities.UserEntity

@Database(
    entities = [
        UserEntity::class,
        TestEntity::class,
    ],
    version = 2,
    exportSchema = true,
)
abstract class MyDatabase : RoomDatabase() {
}

val MIGRATION_1_2 = object: Migration(1,2){
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE IF NOT EXISTS `tests` (`value` TEXT NOT NULL, `key` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))")
    }
}