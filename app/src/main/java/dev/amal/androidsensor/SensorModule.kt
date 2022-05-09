package dev.amal.androidsensor

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SensorModule {

    @Provides
    @Singleton
    fun provideLightSensor(
        app: Application
    ): MeasurableSensor = LightSensor(app)
}