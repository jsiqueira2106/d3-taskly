package com.d3.taskly.di

import android.content.Context
import androidx.room.Room
import com.d3.taskly.data.TaskDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTaskDatabase(@ApplicationContext context: Context): TaskDatabase {
        return Room.databaseBuilder(
            context,
            TaskDatabase::class.java,
            "taskly_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTaskDao(database: TaskDatabase) = database.taskDao()
}