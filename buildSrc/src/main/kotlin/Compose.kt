object Compose {
    const val composeCompilerVersion = "1.3.2"
    private const val lifecycleVersion = "2.4.0"
    private const val activityComposeVersion = "1.4.0"
    private const val hiltNavigationComposeVersion = "1.0.0"
    private const val navigationVersion = "2.5.3"
    private const val composeBomVersion = "2022.10.00"


    const val composeBom = "androidx.compose:compose-bom:$composeBomVersion"
    const val material = "androidx.compose.material:material"
    const val ui = "androidx.compose.ui:ui"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val runtime = "androidx.compose.runtime:runtime"
    const val compiler = "androidx.compose.compiler:compiler:$composeCompilerVersion"

    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"
}