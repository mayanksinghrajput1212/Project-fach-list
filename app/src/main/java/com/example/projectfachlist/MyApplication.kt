package com.example.projectfachlist

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * MyApplication - Main Application class with Koin Dependency Injection setup
 * 
 * This class initializes the Koin DI container when the application starts.
 * All dependencies are configured through Koin modules.
 * 
 * Created: 2026-01-12 10:26:52 UTC
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        
        // Initialize Koin with application context
        startKoin {
            // Enable Koin logging
            androidLogger(Level.DEBUG)
            
            // Provide Android context to Koin
            androidContext(this@MyApplication)
            
            // Load all Koin modules here
            // Example: modules(repositoryModule, viewModelModule, networkModule)
            // modules(/* your modules here */)
        }
    }
}
