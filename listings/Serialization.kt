fun <T : Any> encodeConcentration(content: T): String =
    runCatching {
        Json.Default
        .encodeToString(serializer(content::class.java), content)
    }.getOrElse {
        content.toString()
    }
