package np.com.ngimasherpa.databasemigration

import android.app.Application
import androidx.room.Room
import np.com.ngimasherpa.databasemigration.room.MIGRATION_1_2
import np.com.ngimasherpa.databasemigration.room.MyDatabase

class MyApp : Application(){

    override fun onCreate() {
        super.onCreate()
        Room.databaseBuilder(this, MyDatabase::class.java, "my_database")
            .addMigrations(MIGRATION_1_2)
            .build()
    }
}