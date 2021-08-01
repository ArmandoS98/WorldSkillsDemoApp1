package com.aesc.worldskillsdemoapp1.modelo

data class AbilityDescription(
    var name: String? = null,
    var url: String? = null
)

data class Ability(
    var ability: AbilityDescription? = null,
    var is_hidden: Boolean? = false,
    var slot: Int? = 0,
)

data class Form(
    var name: String? = null,
    var url: String? = null
)

data class Version(
    var name: String? = null,
    var url: String? = null
)

data class GameIndice(
    var game_index: Int? = 0,
    var version: Version? = null
)

data class Item(
    var name: String? = null,
    var url: String? = null
)

data class VersionDetail(
    var rarity: Int? = 0,
    var version: Version? = null
)

data class HeldItem(
    var item: Item? = null,
    var version_details: List<VersionDetail>? = null
)

data class MoveDescription(
    var name: String? = null,
    var url: String? = null
)

data class MoveLearnMethod(
    var name: String? = null,
    var url: String? = null
)

data class VersionGroup(
    var name: String? = null,
    var url: String? = null
)

data class VersionGroupDetail(
    var level_learned_at: Int? = 0,
    var move_learn_method: MoveLearnMethod? = null,
    var version_group: VersionGroup? = null
)

data class Move(
    var move: MoveDescription? = null,
    var version_group_details: List<VersionGroupDetail>? = null
)

data class Species(
    var name: String? = null,
    var url: String? = null
)

data class DreamWorld(
    var front_default: String? = null,
    var front_female: Any? = null
)

data class OfficialArtwork(
    var front_default: String? = null
)

data class Other(
    var dream_world: DreamWorld? = null,
    var officialArtwork: OfficialArtwork? = null
)

data class RedBlue(
    var back_default: String? = null,
    var back_gray: String? = null,
    var front_default: String? = null,
    var front_gray: String? = null
)

data class Yellow(
    var back_default: String? = null,
    var back_gray: String? = null,
    var front_default: String? = null,
    var front_gray: String? = null
)

data class GenerationI(
    var redBlue: RedBlue? = null,
    var yellow: Yellow? = null
)

data class Crystal(
    var back_default: String? = null,
    var back_shiny: String? = null,
    var front_default: String? = null,
    var front_shiny: String? = null
)

data class Gold(
    var back_default: String? = null,
    var back_shiny: String? = null,
    var front_default: String? = null,
    var front_shiny: String? = null
)

data class Silver(
    var back_default: String? = null,
    var back_shiny: String? = null,
    var front_default: String? = null,
    var front_shiny: String? = null
)

data class GenerationIi(
    var crystal: Crystal? = null,
    var gold: Gold? = null,
    var silver: Silver? = null
)

data class Emerald(
    var front_default: String? = null,
    var front_shiny: String? = null
)

data class FireredLeafgreen(
    var back_default: String? = null,
    var back_shiny: String? = null,
    var front_default: String? = null,
    var front_shiny: String? = null
)

data class RubySapphire(
    var back_default: String? = null,
    var back_shiny: String? = null,
    var front_default: String? = null,
    var front_shiny: String? = null
)

data class GenerationIii(
    var emerald: Emerald? = null,
    var fireredLeafgreen: FireredLeafgreen? = null,
    var rubySapphire: RubySapphire? = null
)

data class DiamondPearl(
    var back_default: String? = null,
    var back_female: String? = null,
    var back_shiny: String? = null,
    var back_shiny_female: String? = null,
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class HeartgoldSoulsilver(
    var back_default: String? = null,
    var back_female: String? = null,
    var back_shiny: String? = null,
    var back_shiny_female: String? = null,
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class Platinum(
    var back_default: String? = null,
    var back_female: String? = null,
    var back_shiny: String? = null,
    var back_shiny_female: String? = null,
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class GenerationIv(
    var diamondPearl: DiamondPearl? = null,
    var heartgoldSoulsilver: HeartgoldSoulsilver? = null,
    var platinum: Platinum? = null
)

data class Animated(
    var back_default: String? = null,
    var back_female: String? = null,
    var back_shiny: String? = null,
    var back_shiny_female: String? = null,
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class BlackWhite(
    var animated: Animated? = null,
    var back_default: String? = null,
    var back_female: String? = null,
    var back_shiny: String? = null,
    var back_shiny_female: String? = null,
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class GenerationV(var blackWhite: BlackWhite? = null)

data class OmegarubyAlphasapphire(
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class XY(
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class GenerationVi(
    var omegarubyAlphasapphire: OmegarubyAlphasapphire? = null,
    var xY: XY? = null
)

data class Icons(
    var front_default: String? = null,
    var front_female: Any? = null
)

data class UltraSunUltraMoon(
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null
)

data class GenerationVii(
    var icons: Icons? = null,
    var ultraSunUltraMoon: UltraSunUltraMoon? = null
)

data class GenerationViii(var icons: Icons? = null)

data class Versions(
    var generationI: GenerationI? = null,
    var generationIi: GenerationIi? = null,
    var generationIii: GenerationIii? = null,
    var generationIv: GenerationIv? = null,
    var generationV: GenerationV? = null,
    var generationVi: GenerationVi? = null,
    var generationVii: GenerationVii? = null,
    var generationViii: GenerationViii? = null
)

data class Sprites(
    var back_default: String? = null,
    var back_female: String? = null,
    var back_shiny: String? = null,
    var back_shiny_female: String? = null,
    var front_default: String? = null,
    var front_female: String? = null,
    var front_shiny: String? = null,
    var front_shiny_female: String? = null,
    var other: Other? = null,
    var versions: Versions? = null
)

data class StatDescription(
    var name: String? = null,
    var url: String? = null
)

data class Stat(
    var base_stat: Int? = 0,
    var effort: Int? = 0,
    var stat: StatDescription? = null
)

data class TypeDescription(
    var name: String? = null,
    var url: String? = null
)

data class Type(
    var slot: Int? = 0,
    var type: TypeDescription? = null
)

data class PokemonDetails(
    var abilities: List<Ability>? = null,
    var base_experience: Int? = 0,
    var forms: List<Form>? = null,
    var game_indices: List<GameIndice>? = null,
    var height: Int? = 0,
    var held_items: List<HeldItem>? = null,
    var id: Int? = 0,
    var is_default: Boolean? = false,
    var location_area_encounters: String? = null,
    var moves: List<Move>? = null,
    var name: String? = null,
    var order: Int? = 0,
    var past_types: List<Any>? = null,
    var species: Species? = null,
    var sprites: Sprites? = null,
    var stats: List<Stat>? = null,
    var types: List<Type>? = null,
    var weight: Int? = 0
)

