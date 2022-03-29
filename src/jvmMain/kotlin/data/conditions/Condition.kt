package data.conditions

enum class Condition(val id: String?) {
    EntityConidtion(null),
    BiomeCondition("origins:biome")
    ;

    // The types of Entity Conditions
    enum class Entity(val id: String) {
        EntityType("origins:entity_type"),
        ExposedToSky("origins:exposed_to_sky"),
        InRain("origins:in_rain"),
        Sprinting("origins:sprinting"),
        Swimming("origins:swimming")
    }

    // The types of Biome conditions
    enum class Biome(val id: String)  {
        Category("origins:category"),
        Temperature("origins:temperature")
    }
}