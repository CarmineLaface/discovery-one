package com.sailor.destination

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class ActivityNavigationDestination(
    val name: String,
    vararg val arguments: DestinationArgument
)