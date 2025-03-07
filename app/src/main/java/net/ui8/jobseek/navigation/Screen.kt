package net.ui8.jobseek.navigation

interface Screen {

    val route: String
        get() = javaClass.canonicalName ?: throw Exception("Screen class must have name")
}
