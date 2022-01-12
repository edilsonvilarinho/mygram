package br.com.edilsonvilarinho.mygram.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity
import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity

@Database(entities = arrayOf(StoryEntity::class, PostEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
    abstract fun storyDao(): StoryDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun createDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "mygram.db")
                .build()

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = createDatabase(context)
                INSTANCE = instance

                instance
            }
        }
    }
}