fun toPositionSurrogate(position: Position<*>) =
    when (position.dimensions) {
        2 -> Position2DSurrogate(
            position.coordinates[0],
            position.coordinates[1],
        )
        else -> GenericPositionSurrogate(
            position.coordinates.toList(),
            position.dimensions,
        )
    }
