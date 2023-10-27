fun <T : Any> encodeConcentration(content: T): String {
    return runCatching {
        Json.Default
        .encodeToString(serializer(content::class.java), content)
    }.getOrElse {
        content.toString()
    }
}

