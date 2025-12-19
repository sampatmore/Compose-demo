package energy.so.demoooo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform