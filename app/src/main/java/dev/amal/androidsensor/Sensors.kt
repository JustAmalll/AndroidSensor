package dev.amal.androidsensor

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class LightSensor(context: Context) : AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_LIGHT,
    sensorType = Sensor.TYPE_LIGHT
)

// Example

// class ProximitySensor(context: Context) : AndroidSensor(
//     context = context,
//     sensorFeature = PackageManager.FEATURE_SENSOR_PROXIMITY,
//     sensorType = Sensor.TYPE_PROXIMITY
// )