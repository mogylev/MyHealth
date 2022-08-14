object OtherDependencies {
    private const val coilComposeVersion = "1.3.2"
    private const val moshiVersion = "1.13.0"


    const val coilCompose = "io.coil-kt:coil-compose:$coilComposeVersion"

    const val moshiCodegen = "kapt 'com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion'"
}

object NetworkingDependencies {
    private const val retrofitVersion = "2.9.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"

    private const val okHttpVersion = "5.0.0-alpha.2"
    const val okHttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
}

object DatabaseDependencies {
    private const val roomVersion = "2.4.0"
    const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
    const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    const val roomKtx = "androidx.room:room-ktx:$roomVersion"

    private const val dataStoreVersion = "1.0.0"
    const val dataStore = "androidx.datastore:datastore-preferences:$dataStoreVersion"
}
