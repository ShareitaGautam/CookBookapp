package edu.nku.classapp.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FoodResponse(
    @Json(name = "code")
    val code: String,
    @Json(name = "product")
    val product: Product,
    @Json(name = "status")
    val status: Int,
    @Json(name = "status_verbose")
    val statusVerbose: String
) {
    @JsonClass(generateAdapter = true)
    data class Product(
        @Json(name = "abbreviated_product_name")
        val abbreviatedProductName: String,
        @Json(name = "abbreviated_product_name_fr")
        val abbreviatedProductNameFr: String,
        @Json(name = "added_countries_tags")
        val addedCountriesTags: List<Any?>,
        @Json(name = "additives_n")
        val additivesN: Int,
        @Json(name = "additives_original_tags")
        val additivesOriginalTags: List<String>,
        @Json(name = "additives_prev_original_tags")
        val additivesPrevOriginalTags: List<String>,
        @Json(name = "additives_tags")
        val additivesTags: List<String>,
        @Json(name = "allergens")
        val allergens: String,
        @Json(name = "allergens_from_ingredients")
        val allergensFromIngredients: String,
        @Json(name = "allergens_from_user")
        val allergensFromUser: String,
        @Json(name = "allergens_hierarchy")
        val allergensHierarchy: List<String>,
        @Json(name = "allergens_lc")
        val allergensLc: String,
        @Json(name = "allergens_tags")
        val allergensTags: List<String>,
        @Json(name = "amino_acids_prev_tags")
        val aminoAcidsPrevTags: List<Any?>,
        @Json(name = "amino_acids_tags")
        val aminoAcidsTags: List<Any?>,
        @Json(name = "brands")
        val brands: String,
        @Json(name = "brands_tags")
        val brandsTags: List<String>,
        @Json(name = "carbon_footprint_percent_of_known_ingredients")
        val carbonFootprintPercentOfKnownIngredients: Int,
        @Json(name = "categories")
        val categories: String,
        @Json(name = "categories_hierarchy")
        val categoriesHierarchy: List<String>,
        @Json(name = "categories_lc")
        val categoriesLc: String,
        @Json(name = "categories_properties")
        val categoriesProperties: CategoriesProperties,
        @Json(name = "categories_properties_tags")
        val categoriesPropertiesTags: List<String>,
        @Json(name = "categories_tags")
        val categoriesTags: List<String>,
        @Json(name = "category_properties")
        val categoryProperties: CategoryProperties,
        @Json(name = "checked")
        val checked: String,
        @Json(name = "checkers_tags")
        val checkersTags: List<String>,
        @Json(name = "ciqual_food_name_tags")
        val ciqualFoodNameTags: List<String>,
        @Json(name = "cities_tags")
        val citiesTags: List<Any?>,
        @Json(name = "code")
        val code: String,
        @Json(name = "codes_tags")
        val codesTags: List<String>,
        @Json(name = "compared_to_category")
        val comparedToCategory: String,
        @Json(name = "complete")
        val complete: Int,
        @Json(name = "completeness")
        val completeness: Double,
        @Json(name = "conservation_conditions")
        val conservationConditions: String,
        @Json(name = "conservation_conditions_fr")
        val conservationConditionsFr: String,
        @Json(name = "correctors_tags")
        val correctorsTags: List<String>,
        @Json(name = "countries")
        val countries: String,
        @Json(name = "countries_beforescanbot")
        val countriesBeforescanbot: String,
        @Json(name = "countries_hierarchy")
        val countriesHierarchy: List<String>,
        @Json(name = "countries_lc")
        val countriesLc: String,
        @Json(name = "countries_tags")
        val countriesTags: List<String>,
        @Json(name = "created_t")
        val createdT: Int,
        @Json(name = "creator")
        val creator: String,
        @Json(name = "customer_service")
        val customerService: String,
        @Json(name = "customer_service_fr")
        val customerServiceFr: String,
        @Json(name = "data_quality_bugs_tags")
        val dataQualityBugsTags: List<Any?>,
        @Json(name = "data_quality_errors_tags")
        val dataQualityErrorsTags: List<Any?>,
        @Json(name = "data_quality_info_tags")
        val dataQualityInfoTags: List<String>,
        @Json(name = "data_quality_tags")
        val dataQualityTags: List<String>,
        @Json(name = "data_quality_warnings_tags")
        val dataQualityWarningsTags: List<String>,
        @Json(name = "data_sources")
        val dataSources: String,
        @Json(name = "data_sources_tags")
        val dataSourcesTags: List<String>,
        @Json(name = "ecoscore_data")
        val ecoscoreData: EcoscoreData,
        @Json(name = "ecoscore_extended_data")
        val ecoscoreExtendedData: EcoscoreExtendedData,
        @Json(name = "ecoscore_extended_data_version")
        val ecoscoreExtendedDataVersion: String,
        @Json(name = "ecoscore_grade")
        val ecoscoreGrade: String,
        @Json(name = "ecoscore_score")
        val ecoscoreScore: Int,
        @Json(name = "ecoscore_tags")
        val ecoscoreTags: List<String>,
        @Json(name = "editors_tags")
        val editorsTags: List<String>,
        @Json(name = "emb_codes")
        val embCodes: String,
        @Json(name = "emb_codes_20141016")
        val embCodes20141016: String,
        @Json(name = "emb_codes_orig")
        val embCodesOrig: String,
        @Json(name = "emb_codes_tags")
        val embCodesTags: List<Any?>,
        @Json(name = "entry_dates_tags")
        val entryDatesTags: List<String>,
        @Json(name = "environment_impact_level")
        val environmentImpactLevel: String,
        @Json(name = "environment_impact_level_tags")
        val environmentImpactLevelTags: List<Any?>,
        @Json(name = "expiration_date")
        val expirationDate: String,
        @Json(name = "food_groups")
        val foodGroups: String,
        @Json(name = "food_groups_tags")
        val foodGroupsTags: List<String>,
        @Json(name = "fruits-vegetables-nuts_100g_estimate")
        val fruitsVegetablesNuts100gEstimate: Int,
        @Json(name = "generic_name")
        val genericName: String,
        @Json(name = "generic_name_ar")
        val genericNameAr: String,
        @Json(name = "generic_name_de")
        val genericNameDe: String,
        @Json(name = "generic_name_en")
        val genericNameEn: String,
        @Json(name = "generic_name_es")
        val genericNameEs: String,
        @Json(name = "generic_name_fr")
        val genericNameFr: String,
        @Json(name = "generic_name_id")
        val genericNameId: String,
        @Json(name = "generic_name_it")
        val genericNameIt: String,
        @Json(name = "generic_name_nl")
        val genericNameNl: String,
        @Json(name = "grades")
        val grades: Grades,
        @Json(name = "_id")
        val _id: String,
        @Json(name = "id")
        val id: String,
        @Json(name = "image_front_small_url")
        val imageFrontSmallUrl: String,
        @Json(name = "image_front_thumb_url")
        val imageFrontThumbUrl: String,
        @Json(name = "image_front_url")
        val imageFrontUrl: String,
        @Json(name = "image_nutrition_small_url")
        val imageNutritionSmallUrl: String,
        @Json(name = "image_nutrition_thumb_url")
        val imageNutritionThumbUrl: String,
        @Json(name = "image_nutrition_url")
        val imageNutritionUrl: String,
        @Json(name = "image_small_url")
        val imageSmallUrl: String,
        @Json(name = "image_thumb_url")
        val imageThumbUrl: String,
        @Json(name = "image_url")
        val imageUrl: String,
        @Json(name = "images")
        val images: Images,
        @Json(name = "informers_tags")
        val informersTags: List<String>,
        @Json(name = "ingredients")
        val ingredients: List<Ingredient>,
        @Json(name = "ingredients_analysis")
        val ingredientsAnalysis: IngredientsAnalysis,
        @Json(name = "ingredients_analysis_tags")
        val ingredientsAnalysisTags: List<String>,
        @Json(name = "ingredients_from_or_that_may_be_from_palm_oil_n")
        val ingredientsFromOrThatMayBeFromPalmOilN: Int,
        @Json(name = "ingredients_from_palm_oil_n")
        val ingredientsFromPalmOilN: Int,
        @Json(name = "ingredients_from_palm_oil_tags")
        val ingredientsFromPalmOilTags: List<Any?>,
        @Json(name = "ingredients_hierarchy")
        val ingredientsHierarchy: List<String>,
        @Json(name = "ingredients_n")
        val ingredientsN: Int,
        @Json(name = "ingredients_n_tags")
        val ingredientsNTags: List<String>,
        @Json(name = "ingredients_original_tags")
        val ingredientsOriginalTags: List<String>,
        @Json(name = "ingredients_percent_analysis")
        val ingredientsPercentAnalysis: Int,
        @Json(name = "ingredients_tags")
        val ingredientsTags: List<String>,
        @Json(name = "ingredients_text")
        val ingredientsText: String,
        @Json(name = "ingredients_text_en")
        val ingredientsTextEn: String,
        @Json(name = "ingredients_text_fr")
        val ingredientsTextFr: String,
        @Json(name = "ingredients_text_with_allergens")
        val ingredientsTextWithAllergens: String,
        @Json(name = "ingredients_text_with_allergens_en")
        val ingredientsTextWithAllergensEn: String,
        @Json(name = "ingredients_text_with_allergens_fr")
        val ingredientsTextWithAllergensFr: String,
        @Json(name = "ingredients_that_may_be_from_palm_oil_n")
        val ingredientsThatMayBeFromPalmOilN: Int,
        @Json(name = "ingredients_that_may_be_from_palm_oil_tags")
        val ingredientsThatMayBeFromPalmOilTags: List<Any?>,
        @Json(name = "ingredients_with_specified_percent_n")
        val ingredientsWithSpecifiedPercentN: Int,
        @Json(name = "ingredients_with_specified_percent_sum")
        val ingredientsWithSpecifiedPercentSum: Int,
        @Json(name = "ingredients_with_unspecified_percent_n")
        val ingredientsWithUnspecifiedPercentN: Int,
        @Json(name = "ingredients_with_unspecified_percent_sum")
        val ingredientsWithUnspecifiedPercentSum: Int,
        @Json(name = "interface_version_created")
        val interfaceVersionCreated: String,
        @Json(name = "interface_version_modified")
        val interfaceVersionModified: String,
        @Json(name = "_keywords")
        val keywords: List<String>,
        @Json(name = "known_ingredients_n")
        val knownIngredientsN: Int,
        @Json(name = "labels")
        val labels: String,
        @Json(name = "labels_hierarchy")
        val labelsHierarchy: List<String>,
        @Json(name = "labels_lc")
        val labelsLc: String,
        @Json(name = "labels_tags")
        val labelsTags: List<String>,
        @Json(name = "lang")
        val lang: String,
        @Json(name = "languages")
        val languages: Languages,
        @Json(name = "languages_codes")
        val languagesCodes: LanguagesCodes,
        @Json(name = "languages_hierarchy")
        val languagesHierarchy: List<String>,
        @Json(name = "languages_tags")
        val languagesTags: List<String>,
        @Json(name = "last_check_dates_tags")
        val lastCheckDatesTags: List<String>,
        @Json(name = "last_checked_t")
        val lastCheckedT: Int,
        @Json(name = "last_checker")
        val lastChecker: String,
        @Json(name = "last_edit_dates_tags")
        val lastEditDatesTags: List<String>,
        @Json(name = "last_editor")
        val lastEditor: String,
        @Json(name = "last_image_dates_tags")
        val lastImageDatesTags: List<String>,
        @Json(name = "last_image_t")
        val lastImageT: Int,
        @Json(name = "last_modified_by")
        val lastModifiedBy: String,
        @Json(name = "last_modified_t")
        val lastModifiedT: Int,
        @Json(name = "lc")
        val lc: String,
        @Json(name = "link")
        val link: String,
        @Json(name = "main_countries_tags")
        val mainCountriesTags: List<Any?>,
        @Json(name = "manufacturing_places")
        val manufacturingPlaces: String,
        @Json(name = "manufacturing_places_tags")
        val manufacturingPlacesTags: List<Any?>,
        @Json(name = "max_imgid")
        val maxImgid: String,
        @Json(name = "minerals_prev_tags")
        val mineralsPrevTags: List<Any?>,
        @Json(name = "minerals_tags")
        val mineralsTags: List<Any?>,
        @Json(name = "misc_tags")
        val miscTags: List<String>,
        @Json(name = "no_nutrition_data")
        val noNutritionData: String,
        @Json(name = "nova_group")
        val novaGroup: Int,
        @Json(name = "nova_groups")
        val novaGroups: String,
        @Json(name = "nova_groups_markers")
        val novaGroupsMarkers: NovaGroupsMarkers,
        @Json(name = "nova_groups_tags")
        val novaGroupsTags: List<String>,
        @Json(name = "nucleotides_prev_tags")
        val nucleotidesPrevTags: List<Any?>,
        @Json(name = "nucleotides_tags")
        val nucleotidesTags: List<Any?>,
        @Json(name = "nutrient_levels")
        val nutrientLevels: NutrientLevels,
        @Json(name = "nutrient_levels_tags")
        val nutrientLevelsTags: List<String>,
        @Json(name = "nutriments")
        val nutriments: Nutriments,
        @Json(name = "nutriscore_data")
        val nutriscoreData: NutriscoreData,
        @Json(name = "nutriscore_grade")
        val nutriscoreGrade: String,
        @Json(name = "nutriscore_score")
        val nutriscoreScore: Int,
        @Json(name = "nutriscore_score_opposite")
        val nutriscoreScoreOpposite: Int,
        @Json(name = "nutrition_data")
        val nutritionData: String,
        @Json(name = "nutrition_data_per")
        val nutritionDataPer: String,
        @Json(name = "nutrition_data_prepared")
        val nutritionDataPrepared: String,
        @Json(name = "nutrition_data_prepared_per")
        val nutritionDataPreparedPer: String,
        @Json(name = "nutrition_grade_fr")
        val nutritionGradeFr: String,
        @Json(name = "nutrition_grades")
        val nutritionGrades: String,
        @Json(name = "nutrition_grades_tags")
        val nutritionGradesTags: List<String>,
        @Json(name = "nutrition_score_beverage")
        val nutritionScoreBeverage: Int,
        @Json(name = "nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
        val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients: Int,
        @Json(name = "nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
        val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue: Int,
        @Json(name = "nutrition_score_warning_no_fiber")
        val nutritionScoreWarningNoFiber: Int,
        @Json(name = "obsolete")
        val obsolete: String,
        @Json(name = "obsolete_since_date")
        val obsoleteSinceDate: String,
        @Json(name = "origin")
        val origin: String,
        @Json(name = "origins")
        val origins: String,
        @Json(name = "origins_hierarchy")
        val originsHierarchy: List<Any?>,
        @Json(name = "origins_lc")
        val originsLc: String,
        @Json(name = "origins_tags")
        val originsTags: List<Any?>,
        @Json(name = "other_nutritional_substances_tags")
        val otherNutritionalSubstancesTags: List<Any?>,
        @Json(name = "owner")
        val owner: String,
        @Json(name = "owners_tags")
        val ownersTags: String,
        @Json(name = "packaging")
        val packaging: String,
        @Json(name = "packaging_hierarchy")
        val packagingHierarchy: List<String>,
        @Json(name = "packaging_lc")
        val packagingLc: String,
        @Json(name = "packaging_tags")
        val packagingTags: List<String>,
        @Json(name = "packaging_text")
        val packagingText: String,
        @Json(name = "packaging_text_ar")
        val packagingTextAr: String,
        @Json(name = "packaging_text_de")
        val packagingTextDe: String,
        @Json(name = "packaging_text_en")
        val packagingTextEn: String,
        @Json(name = "packaging_text_es")
        val packagingTextEs: String,
        @Json(name = "packaging_text_fr")
        val packagingTextFr: String,
        @Json(name = "packaging_text_id")
        val packagingTextId: String,
        @Json(name = "packaging_text_it")
        val packagingTextIt: String,
        @Json(name = "packaging_text_nl")
        val packagingTextNl: String,
        @Json(name = "packagings")
        val packagings: List<Packaging>,
        @Json(name = "photographers_tags")
        val photographersTags: List<String>,
        @Json(name = "pnns_groups_1")
        val pnnsGroups1: String,
        @Json(name = "pnns_groups_1_tags")
        val pnnsGroups1Tags: List<String>,
        @Json(name = "pnns_groups_2")
        val pnnsGroups2: String,
        @Json(name = "pnns_groups_2_tags")
        val pnnsGroups2Tags: List<String>,
        @Json(name = "popularity_key")
        val popularityKey: Long,
        @Json(name = "popularity_tags")
        val popularityTags: List<String>,
        @Json(name = "product_name")
        val productName: String,
        @Json(name = "product_name_ar")
        val productNameAr: String,
        @Json(name = "product_name_de")
        val productNameDe: String,
        @Json(name = "product_name_en")
        val productNameEn: String,
        @Json(name = "product_name_es")
        val productNameEs: String,
        @Json(name = "product_name_fr")
        val productNameFr: String,
        @Json(name = "product_name_id")
        val productNameId: String,
        @Json(name = "product_name_it")
        val productNameIt: String,
        @Json(name = "product_name_nl")
        val productNameNl: String,
        @Json(name = "product_quantity")
        val productQuantity: String,
        @Json(name = "purchase_places")
        val purchasePlaces: String,
        @Json(name = "purchase_places_tags")
        val purchasePlacesTags: List<String>,
        @Json(name = "quantity")
        val quantity: String,
        @Json(name = "removed_countries_tags")
        val removedCountriesTags: List<Any?>,
        @Json(name = "rev")
        val rev: Int,
        @Json(name = "scans_n")
        val scansN: Int,
        @Json(name = "scores")
        val scores: Scores,
        @Json(name = "selected_images")
        val selectedImages: SelectedImages,
        @Json(name = "serving_quantity")
        val servingQuantity: String,
        @Json(name = "serving_size")
        val servingSize: String,
        @Json(name = "sortkey")
        val sortkey: Int,
        @Json(name = "sources")
        val sources: List<Source>,
        @Json(name = "sources_fields")
        val sourcesFields: SourcesFields,
        @Json(name = "states")
        val states: String,
        @Json(name = "states_hierarchy")
        val statesHierarchy: List<String>,
        @Json(name = "states_tags")
        val statesTags: List<String>,
        @Json(name = "stores")
        val stores: String,
        @Json(name = "stores_tags")
        val storesTags: List<String>,
        @Json(name = "teams")
        val teams: String,
        @Json(name = "teams_tags")
        val teamsTags: List<String>,
        @Json(name = "traces")
        val traces: String,
        @Json(name = "traces_from_ingredients")
        val tracesFromIngredients: String,
        @Json(name = "traces_from_user")
        val tracesFromUser: String,
        @Json(name = "traces_hierarchy")
        val tracesHierarchy: List<Any?>,
        @Json(name = "traces_lc")
        val tracesLc: String,
        @Json(name = "traces_tags")
        val tracesTags: List<Any?>,
        @Json(name = "unique_scans_n")
        val uniqueScansN: Int,
        @Json(name = "unknown_ingredients_n")
        val unknownIngredientsN: Int,
        @Json(name = "unknown_nutrients_tags")
        val unknownNutrientsTags: List<Any?>,
        @Json(name = "update_key")
        val updateKey: String,
        @Json(name = "vitamins_prev_tags")
        val vitaminsPrevTags: List<Any?>,
        @Json(name = "vitamins_tags")
        val vitaminsTags: List<Any?>
    ) {
        @JsonClass(generateAdapter = true)
        data class CategoriesProperties(
            @Json(name = "agribalyse_food_code:en")
            val agribalyseFoodCodeEn: String,
            @Json(name = "agribalyse_proxy_food_code:en")
            val agribalyseProxyFoodCodeEn: String,
            @Json(name = "ciqual_food_code:en")
            val ciqualFoodCodeEn: String
        )

        @JsonClass(generateAdapter = true)
        data class CategoryProperties(
            @Json(name = "ciqual_food_name:en")
            val ciqualFoodNameEn: String
        )

        @JsonClass(generateAdapter = true)
        data class EcoscoreData(
            @Json(name = "adjustments")
            val adjustments: Adjustments,
            @Json(name = "agribalyse")
            val agribalyse: Agribalyse,
            @Json(name = "grade")
            val grade: String,
            @Json(name = "grades")
            val grades: Grades,
            @Json(name = "missing")
            val missing: Missing,
            @Json(name = "missing_data_warning")
            val missingDataWarning: Int,
            @Json(name = "score")
            val score: Int,
            @Json(name = "scores")
            val scores: Scores,
            @Json(name = "status")
            val status: String
        ) {
            @JsonClass(generateAdapter = true)
            data class Adjustments(
                @Json(name = "origins_of_ingredients")
                val originsOfIngredients: OriginsOfIngredients,
                @Json(name = "packaging")
                val packaging: Packaging,
                @Json(name = "production_system")
                val productionSystem: ProductionSystem,
                @Json(name = "threatened_species")
                val threatenedSpecies: ThreatenedSpecies
            ) {
                @JsonClass(generateAdapter = true)
                data class OriginsOfIngredients(
                    @Json(name = "aggregated_origins")
                    val aggregatedOrigins: List<AggregatedOrigin>,
                    @Json(name = "epi_score")
                    val epiScore: Int,
                    @Json(name = "epi_value")
                    val epiValue: Int,
                    @Json(name = "origins_from_origins_field")
                    val originsFromOriginsField: List<String>,
                    @Json(name = "transportation_scores")
                    val transportationScores: TransportationScores,
                    @Json(name = "transportation_values")
                    val transportationValues: TransportationValues,
                    @Json(name = "values")
                    val values: Values,
                    @Json(name = "warning")
                    val warning: String
                ) {
                    @JsonClass(generateAdapter = true)
                    data class AggregatedOrigin(
                        @Json(name = "origin")
                        val origin: String,
                        @Json(name = "percent")
                        val percent: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class TransportationScores(
                        @Json(name = "fr")
                        val fr: Int,
                        @Json(name = "no")
                        val no: Int,
                        @Json(name = "uk")
                        val uk: Int,
                        @Json(name = "us")
                        val us: Int,
                        @Json(name = "world")
                        val world: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class TransportationValues(
                        @Json(name = "fr")
                        val fr: Int,
                        @Json(name = "no")
                        val no: Int,
                        @Json(name = "uk")
                        val uk: Int,
                        @Json(name = "us")
                        val us: Int,
                        @Json(name = "world")
                        val world: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class Values(
                        @Json(name = "fr")
                        val fr: Int,
                        @Json(name = "no")
                        val no: Int,
                        @Json(name = "uk")
                        val uk: Int,
                        @Json(name = "us")
                        val us: Int,
                        @Json(name = "world")
                        val world: Int
                    )
                }

                @JsonClass(generateAdapter = true)
                data class Packaging(
                    @Json(name = "non_recyclable_and_non_biodegradable_materials")
                    val nonRecyclableAndNonBiodegradableMaterials: Int,
                    @Json(name = "packagings")
                    val packagings: List<Packaging>,
                    @Json(name = "score")
                    val score: Int,
                    @Json(name = "value")
                    val value: Int,
                    @Json(name = "warning")
                    val warning: String
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Packaging(
                        @Json(name = "ecoscore_material_score")
                        val ecoscoreMaterialScore: Int,
                        @Json(name = "ecoscore_shape_ratio")
                        val ecoscoreShapeRatio: Int,
                        @Json(name = "material")
                        val material: String,
                        @Json(name = "shape")
                        val shape: String
                    )
                }

                @JsonClass(generateAdapter = true)
                data class ProductionSystem(
                    @Json(name = "labels")
                    val labels: List<Any?>,
                    @Json(name = "value")
                    val value: Int,
                    @Json(name = "warning")
                    val warning: String
                )

                @JsonClass(generateAdapter = true)
                data class ThreatenedSpecies(
                    @Json(name = "ingredient")
                    val ingredient: String,
                    @Json(name = "value")
                    val value: Int
                )
            }

            @JsonClass(generateAdapter = true)
            data class Agribalyse(
                @Json(name = "agribalyse_food_code")
                val agribalyseFoodCode: String,
                @Json(name = "co2_agriculture")
                val co2Agriculture: Double,
                @Json(name = "co2_consumption")
                val co2Consumption: Int,
                @Json(name = "co2_distribution")
                val co2Distribution: Double,
                @Json(name = "co2_packaging")
                val co2Packaging: Double,
                @Json(name = "co2_processing")
                val co2Processing: Double,
                @Json(name = "co2_total")
                val co2Total: Double,
                @Json(name = "co2_transportation")
                val co2Transportation: Double,
                @Json(name = "code")
                val code: String,
                @Json(name = "dqr")
                val dqr: String,
                @Json(name = "ef_agriculture")
                val efAgriculture: Double,
                @Json(name = "ef_consumption")
                val efConsumption: Int,
                @Json(name = "ef_distribution")
                val efDistribution: Double,
                @Json(name = "ef_packaging")
                val efPackaging: Double,
                @Json(name = "ef_processing")
                val efProcessing: Double,
                @Json(name = "ef_total")
                val efTotal: Double,
                @Json(name = "ef_transportation")
                val efTransportation: Double,
                @Json(name = "is_beverage")
                val isBeverage: Int,
                @Json(name = "name_en")
                val nameEn: String,
                @Json(name = "name_fr")
                val nameFr: String,
                @Json(name = "score")
                val score: Int
            )

            @JsonClass(generateAdapter = true)
            data class Grades(
                @Json(name = "fr")
                val fr: String,
                @Json(name = "no")
                val no: String,
                @Json(name = "uk")
                val uk: String,
                @Json(name = "us")
                val us: String,
                @Json(name = "world")
                val world: String
            )

            @JsonClass(generateAdapter = true)
            data class Missing(
                @Json(name = "labels")
                val labels: Int,
                @Json(name = "origins")
                val origins: Int,
                @Json(name = "packagings")
                val packagings: Int
            )

            @JsonClass(generateAdapter = true)
            data class Scores(
                @Json(name = "fr")
                val fr: Int,
                @Json(name = "no")
                val no: Int,
                @Json(name = "uk")
                val uk: Int,
                @Json(name = "us")
                val us: Int,
                @Json(name = "world")
                val world: Int
            )
        }

        @JsonClass(generateAdapter = true)
        data class EcoscoreExtendedData(
            @Json(name = "impact")
            val impact: Impact
        ) {
            @JsonClass(generateAdapter = true)
            data class Impact(
                @Json(name = "ef_single_score_log_stddev")
                val efSingleScoreLogStddev: Double,
                @Json(name = "likeliest_impacts")
                val likeliestImpacts: LikeliestImpacts,
                @Json(name = "likeliest_recipe")
                val likeliestRecipe: LikeliestRecipe,
                @Json(name = "mass_ratio_uncharacterized")
                val massRatioUncharacterized: Double,
                @Json(name = "uncharacterized_ingredients")
                val uncharacterizedIngredients: UncharacterizedIngredients,
                @Json(name = "uncharacterized_ingredients_mass_proportion")
                val uncharacterizedIngredientsMassProportion: UncharacterizedIngredientsMassProportion,
                @Json(name = "uncharacterized_ingredients_ratio")
                val uncharacterizedIngredientsRatio: UncharacterizedIngredientsRatio,
                @Json(name = "warnings")
                val warnings: List<String>
            ) {
                @JsonClass(generateAdapter = true)
                data class LikeliestImpacts(
                    @Json(name = "Climate_change")
                    val climateChange: Double,
                    @Json(name = "EF_single_score")
                    val eFSingleScore: Double
                )

                @JsonClass(generateAdapter = true)
                data class LikeliestRecipe(
                    @Json(name = "en:emulsifier")
                    val enEmulsifier: Double,
                    @Json(name = "en:hazelnut_oil")
                    val enHazelnutOil: Double,
                    @Json(name = "en:palm_oil")
                    val enPalmOil: Double,
                    @Json(name = "en:sugar")
                    val enSugar: Double,
                    @Json(name = "en:water")
                    val enWater: Double,
                    @Json(name = "fr:Cacao_Maigre_7")
                    val frCacaoMaigre7: Double,
                    @Json(name = "fr:Lait__cr_m__En_Poudre_8")
                    val frLaitCrMEnPoudre8: Double
                )

                @JsonClass(generateAdapter = true)
                data class UncharacterizedIngredients(
                    @Json(name = "impact")
                    val impact: List<String>,
                    @Json(name = "nutrition")
                    val nutrition: List<String>
                )

                @JsonClass(generateAdapter = true)
                data class UncharacterizedIngredientsMassProportion(
                    @Json(name = "impact")
                    val impact: Double,
                    @Json(name = "nutrition")
                    val nutrition: Double
                )

                @JsonClass(generateAdapter = true)
                data class UncharacterizedIngredientsRatio(
                    @Json(name = "impact")
                    val impact: Double,
                    @Json(name = "nutrition")
                    val nutrition: Double
                )
            }
        }

        @JsonClass(generateAdapter = true)
        class Grades

        @JsonClass(generateAdapter = true)
        data class Images(
            @Json(name = "front_en")
            val frontEn: FrontEn,
            @Json(name = "front_fr")
            val frontFr: FrontFr,
            @Json(name = "ingredients_fr")
            val ingredientsFr: IngredientsFr,
            @Json(name = "nutrition_en")
            val nutritionEn: NutritionEn,
            @Json(name = "packaging_fr")
            val packagingFr: PackagingFr,
            @Json(name = "1")
            val x1: X1,
            @Json(name = "2")
            val x2: X2,
            @Json(name = "3")
            val x3: X3
        ) {
            @JsonClass(generateAdapter = true)
            data class FrontEn(
                @Json(name = "angle")
                val angle: String,
                @Json(name = "coordinates_image_size")
                val coordinatesImageSize: String,
                @Json(name = "geometry")
                val geometry: String,
                @Json(name = "imgid")
                val imgid: String,
                @Json(name = "normalize")
                val normalize: String,
                @Json(name = "rev")
                val rev: String,
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "white_magic")
                val whiteMagic: String,
                @Json(name = "x1")
                val x1: String,
                @Json(name = "x2")
                val x2: String,
                @Json(name = "y1")
                val y1: String,
                @Json(name = "y2")
                val y2: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "200")
                    val x200: X200,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X200(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class FrontFr(
                @Json(name = "angle")
                val angle: Int,
                @Json(name = "coordinates_image_size")
                val coordinatesImageSize: String,
                @Json(name = "geometry")
                val geometry: String,
                @Json(name = "imgid")
                val imgid: String,
                @Json(name = "normalize")
                val normalize: String,
                @Json(name = "rev")
                val rev: String,
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "white_magic")
                val whiteMagic: String,
                @Json(name = "x1")
                val x1: String,
                @Json(name = "x2")
                val x2: String,
                @Json(name = "y1")
                val y1: String,
                @Json(name = "y2")
                val y2: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "200")
                    val x200: X200,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X200(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class IngredientsFr(
                @Json(name = "angle")
                val angle: Any?,
                @Json(name = "coordinates_image_size")
                val coordinatesImageSize: String,
                @Json(name = "geometry")
                val geometry: String,
                @Json(name = "imgid")
                val imgid: String,
                @Json(name = "normalize")
                val normalize: Any?,
                @Json(name = "rev")
                val rev: String,
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "white_magic")
                val whiteMagic: Any?,
                @Json(name = "x1")
                val x1: Any?,
                @Json(name = "x2")
                val x2: Any?,
                @Json(name = "y1")
                val y1: Any?,
                @Json(name = "y2")
                val y2: Any?
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "200")
                    val x200: X200,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X200(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class NutritionEn(
                @Json(name = "angle")
                val angle: String,
                @Json(name = "coordinates_image_size")
                val coordinatesImageSize: String,
                @Json(name = "geometry")
                val geometry: String,
                @Json(name = "imgid")
                val imgid: String,
                @Json(name = "normalize")
                val normalize: String,
                @Json(name = "rev")
                val rev: String,
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "white_magic")
                val whiteMagic: String,
                @Json(name = "x1")
                val x1: String,
                @Json(name = "x2")
                val x2: String,
                @Json(name = "y1")
                val y1: String,
                @Json(name = "y2")
                val y2: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "200")
                    val x200: X200,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X200(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class PackagingFr(
                @Json(name = "angle")
                val angle: Int,
                @Json(name = "coordinates_image_size")
                val coordinatesImageSize: String,
                @Json(name = "geometry")
                val geometry: String,
                @Json(name = "imgid")
                val imgid: String,
                @Json(name = "normalize")
                val normalize: Any?,
                @Json(name = "rev")
                val rev: String,
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "white_magic")
                val whiteMagic: Any?,
                @Json(name = "x1")
                val x1: String,
                @Json(name = "x2")
                val x2: String,
                @Json(name = "y1")
                val y1: String,
                @Json(name = "y2")
                val y2: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "200")
                    val x200: X200,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X200(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class X1(
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "uploaded_t")
                val uploadedT: String,
                @Json(name = "uploader")
                val uploader: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class X2(
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "uploaded_t")
                val uploadedT: String,
                @Json(name = "uploader")
                val uploader: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class X3(
                @Json(name = "sizes")
                val sizes: Sizes,
                @Json(name = "uploaded_t")
                val uploadedT: String,
                @Json(name = "uploader")
                val uploader: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Sizes(
                    @Json(name = "full")
                    val full: Full,
                    @Json(name = "100")
                    val x100: X100,
                    @Json(name = "400")
                    val x400: X400
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Full(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X100(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )

                    @JsonClass(generateAdapter = true)
                    data class X400(
                        @Json(name = "h")
                        val h: Int,
                        @Json(name = "w")
                        val w: Int
                    )
                }
            }
        }

        @JsonClass(generateAdapter = true)
        data class Ingredient(
            @Json(name = "from_palm_oil")
            val fromPalmOil: String?,
            @Json(name = "id")
            val id: String,
            @Json(name = "ingredients")
            val ingredients: List<Ingredient>?,
            @Json(name = "percent")
            val percent: Int?,
            @Json(name = "percent_estimate")
            val percentEstimate: Double,
            @Json(name = "percent_max")
            val percentMax: Int,
            @Json(name = "percent_min")
            val percentMin: Int,
            @Json(name = "text")
            val text: String,
            @Json(name = "vegan")
            val vegan: String?,
            @Json(name = "vegetarian")
            val vegetarian: String?
        ) {
            @JsonClass(generateAdapter = true)
            data class Ingredient(
                @Json(name = "id")
                val id: String,
                @Json(name = "percent_estimate")
                val percentEstimate: Int,
                @Json(name = "percent_max")
                val percentMax: Int,
                @Json(name = "percent_min")
                val percentMin: Int,
                @Json(name = "text")
                val text: String,
                @Json(name = "vegan")
                val vegan: String,
                @Json(name = "vegetarian")
                val vegetarian: String
            )
        }

        @JsonClass(generateAdapter = true)
        data class IngredientsAnalysis(
            @Json(name = "en:palm-oil")
            val enPalmOil: List<String>,
            @Json(name = "en:vegan-status-unknown")
            val enVeganStatusUnknown: List<String>,
            @Json(name = "en:vegetarian-status-unknown")
            val enVegetarianStatusUnknown: List<String>
        )

        @JsonClass(generateAdapter = true)
        data class Languages(
            @Json(name = "en:arabic")
            val enArabic: Int,
            @Json(name = "en:english")
            val enEnglish: Int,
            @Json(name = "en:french")
            val enFrench: Int,
            @Json(name = "en:german")
            val enGerman: Int,
            @Json(name = "en:italian")
            val enItalian: Int,
            @Json(name = "en:spanish")
            val enSpanish: Int
        )

        @JsonClass(generateAdapter = true)
        data class LanguagesCodes(
            @Json(name = "en")
            val en: Int,
            @Json(name = "fr")
            val fr: Int
        )

        @JsonClass(generateAdapter = true)
        data class NovaGroupsMarkers(
            @Json(name = "3")
            val x3: List<List<String>>,
            @Json(name = "4")
            val x4: List<List<String>>
        )

        @JsonClass(generateAdapter = true)
        data class NutrientLevels(
            @Json(name = "fat")
            val fat: String,
            @Json(name = "salt")
            val salt: String,
            @Json(name = "saturated-fat")
            val saturatedFat: String,
            @Json(name = "sugars")
            val sugars: String
        )

        @JsonClass(generateAdapter = true)
        data class Nutriments(
            @Json(name = "alcohol")
            val alcohol: Int,
            @Json(name = "alcohol_100g")
            val alcohol100g: Int,
            @Json(name = "alcohol_serving")
            val alcoholServing: Int,
            @Json(name = "alcohol_unit")
            val alcoholUnit: String,
            @Json(name = "alcohol_value")
            val alcoholValue: Int,
            @Json(name = "carbohydrates")
            val carbohydrates: Double,
            @Json(name = "carbohydrates_100g")
            val carbohydrates100g: Double,
            @Json(name = "carbohydrates_serving")
            val carbohydratesServing: Double,
            @Json(name = "carbohydrates_unit")
            val carbohydratesUnit: String,
            @Json(name = "carbohydrates_value")
            val carbohydratesValue: Double,
            @Json(name = "carbon-footprint-from-known-ingredients_product")
            val carbonFootprintFromKnownIngredientsProduct: Int,
            @Json(name = "carbon-footprint-from-known-ingredients_serving")
            val carbonFootprintFromKnownIngredientsServing: Double,
            @Json(name = "energy")
            val energy: Int,
            @Json(name = "energy_100g")
            val energy100g: Int,
            @Json(name = "energy-kcal")
            val energyKcal: Int,
            @Json(name = "energy-kcal_100g")
            val energyKcal100g: Int,
            @Json(name = "energy-kcal_serving")
            val energyKcalServing: Double,
            @Json(name = "energy-kcal_unit")
            val energyKcalUnit: String,
            @Json(name = "energy-kcal_value")
            val energyKcalValue: Int,
            @Json(name = "energy-kj")
            val energyKj: Int,
            @Json(name = "energy-kj_100g")
            val energyKj100g: Int,
            @Json(name = "energy-kj_serving")
            val energyKjServing: Int,
            @Json(name = "energy-kj_unit")
            val energyKjUnit: String,
            @Json(name = "energy-kj_value")
            val energyKjValue: Int,
            @Json(name = "energy_serving")
            val energyServing: Int,
            @Json(name = "energy_unit")
            val energyUnit: String,
            @Json(name = "energy_value")
            val energyValue: Int,
            @Json(name = "fat")
            val fat: Double,
            @Json(name = "fat_100g")
            val fat100g: Double,
            @Json(name = "fat_serving")
            val fatServing: Double,
            @Json(name = "fat_unit")
            val fatUnit: String,
            @Json(name = "fat_value")
            val fatValue: Double,
            @Json(name = "fruits-vegetables-nuts-estimate-from-ingredients_100g")
            val fruitsVegetablesNutsEstimateFromIngredients100g: Int,
            @Json(name = "fruits-vegetables-nuts-estimate-from-ingredients_serving")
            val fruitsVegetablesNutsEstimateFromIngredientsServing: Int,
            @Json(name = "nova-group")
            val novaGroup: Int,
            @Json(name = "nova-group_100g")
            val novaGroup100g: Int,
            @Json(name = "nova-group_serving")
            val novaGroupServing: Int,
            @Json(name = "nutrition-score-fr")
            val nutritionScoreFr: Int,
            @Json(name = "nutrition-score-fr_100g")
            val nutritionScoreFr100g: Int,
            @Json(name = "proteins")
            val proteins: Double,
            @Json(name = "proteins_100g")
            val proteins100g: Double,
            @Json(name = "proteins_serving")
            val proteinsServing: Double,
            @Json(name = "proteins_unit")
            val proteinsUnit: String,
            @Json(name = "proteins_value")
            val proteinsValue: Double,
            @Json(name = "salt")
            val salt: Double,
            @Json(name = "salt_100g")
            val salt100g: Double,
            @Json(name = "salt_serving")
            val saltServing: Double,
            @Json(name = "salt_unit")
            val saltUnit: String,
            @Json(name = "salt_value")
            val saltValue: Double,
            @Json(name = "saturated-fat")
            val saturatedFat: Double,
            @Json(name = "saturated-fat_100g")
            val saturatedFat100g: Double,
            @Json(name = "saturated-fat_serving")
            val saturatedFatServing: Double,
            @Json(name = "saturated-fat_unit")
            val saturatedFatUnit: String,
            @Json(name = "saturated-fat_value")
            val saturatedFatValue: Double,
            @Json(name = "sodium")
            val sodium: Double,
            @Json(name = "sodium_100g")
            val sodium100g: Double,
            @Json(name = "sodium_serving")
            val sodiumServing: Double,
            @Json(name = "sodium_unit")
            val sodiumUnit: String,
            @Json(name = "sodium_value")
            val sodiumValue: Double,
            @Json(name = "sugars")
            val sugars: Double,
            @Json(name = "sugars_100g")
            val sugars100g: Double,
            @Json(name = "sugars_serving")
            val sugarsServing: Double,
            @Json(name = "sugars_unit")
            val sugarsUnit: String,
            @Json(name = "sugars_value")
            val sugarsValue: Double
        )

        @JsonClass(generateAdapter = true)
        data class NutriscoreData(
            @Json(name = "energy")
            val energy: Int,
            @Json(name = "energy_points")
            val energyPoints: Int,
            @Json(name = "energy_value")
            val energyValue: Int,
            @Json(name = "fiber")
            val fiber: Int,
            @Json(name = "fiber_points")
            val fiberPoints: Int,
            @Json(name = "fiber_value")
            val fiberValue: Int,
            @Json(name = "fruits_vegetables_nuts_colza_walnut_olive_oils")
            val fruitsVegetablesNutsColzaWalnutOliveOils: Int,
            @Json(name = "fruits_vegetables_nuts_colza_walnut_olive_oils_points")
            val fruitsVegetablesNutsColzaWalnutOliveOilsPoints: Int,
            @Json(name = "fruits_vegetables_nuts_colza_walnut_olive_oils_value")
            val fruitsVegetablesNutsColzaWalnutOliveOilsValue: Int,
            @Json(name = "grade")
            val grade: String,
            @Json(name = "is_beverage")
            val isBeverage: Int,
            @Json(name = "is_cheese")
            val isCheese: Int,
            @Json(name = "is_fat")
            val isFat: Int,
            @Json(name = "is_water")
            val isWater: Int,
            @Json(name = "negative_points")
            val negativePoints: Int,
            @Json(name = "positive_points")
            val positivePoints: Int,
            @Json(name = "proteins")
            val proteins: Double,
            @Json(name = "proteins_points")
            val proteinsPoints: Int,
            @Json(name = "proteins_value")
            val proteinsValue: Double,
            @Json(name = "saturated_fat")
            val saturatedFat: Double,
            @Json(name = "saturated_fat_points")
            val saturatedFatPoints: Int,
            @Json(name = "saturated_fat_ratio")
            val saturatedFatRatio: Double,
            @Json(name = "saturated_fat_ratio_points")
            val saturatedFatRatioPoints: Int,
            @Json(name = "saturated_fat_ratio_value")
            val saturatedFatRatioValue: Double,
            @Json(name = "saturated_fat_value")
            val saturatedFatValue: Double,
            @Json(name = "score")
            val score: Int,
            @Json(name = "sodium")
            val sodium: Double,
            @Json(name = "sodium_points")
            val sodiumPoints: Int,
            @Json(name = "sodium_value")
            val sodiumValue: Double,
            @Json(name = "sugars")
            val sugars: Double,
            @Json(name = "sugars_points")
            val sugarsPoints: Int,
            @Json(name = "sugars_value")
            val sugarsValue: Double
        )

        @JsonClass(generateAdapter = true)
        data class Packaging(
            @Json(name = "material")
            val material: String
        )

        @JsonClass(generateAdapter = true)
        class Scores

        @JsonClass(generateAdapter = true)
        data class SelectedImages(
            @Json(name = "front")
            val front: Front,
            @Json(name = "ingredients")
            val ingredients: Ingredients,
            @Json(name = "nutrition")
            val nutrition: Nutrition,
            @Json(name = "packaging")
            val packaging: Packaging
        ) {
            @JsonClass(generateAdapter = true)
            data class Front(
                @Json(name = "display")
                val display: Display,
                @Json(name = "small")
                val small: Small,
                @Json(name = "thumb")
                val thumb: Thumb
            ) {
                @JsonClass(generateAdapter = true)
                data class Display(
                    @Json(name = "en")
                    val en: String,
                    @Json(name = "fr")
                    val fr: String
                )

                @JsonClass(generateAdapter = true)
                data class Small(
                    @Json(name = "en")
                    val en: String,
                    @Json(name = "fr")
                    val fr: String
                )

                @JsonClass(generateAdapter = true)
                data class Thumb(
                    @Json(name = "en")
                    val en: String,
                    @Json(name = "fr")
                    val fr: String
                )
            }

            @JsonClass(generateAdapter = true)
            data class Ingredients(
                @Json(name = "display")
                val display: Display,
                @Json(name = "small")
                val small: Small,
                @Json(name = "thumb")
                val thumb: Thumb
            ) {
                @JsonClass(generateAdapter = true)
                data class Display(
                    @Json(name = "fr")
                    val fr: String
                )

                @JsonClass(generateAdapter = true)
                data class Small(
                    @Json(name = "fr")
                    val fr: String
                )

                @JsonClass(generateAdapter = true)
                data class Thumb(
                    @Json(name = "fr")
                    val fr: String
                )
            }

            @JsonClass(generateAdapter = true)
            data class Nutrition(
                @Json(name = "display")
                val display: Display,
                @Json(name = "small")
                val small: Small,
                @Json(name = "thumb")
                val thumb: Thumb
            ) {
                @JsonClass(generateAdapter = true)
                data class Display(
                    @Json(name = "en")
                    val en: String
                )

                @JsonClass(generateAdapter = true)
                data class Small(
                    @Json(name = "en")
                    val en: String
                )

                @JsonClass(generateAdapter = true)
                data class Thumb(
                    @Json(name = "en")
                    val en: String
                )
            }

            @JsonClass(generateAdapter = true)
            data class Packaging(
                @Json(name = "display")
                val display: Display,
                @Json(name = "small")
                val small: Small,
                @Json(name = "thumb")
                val thumb: Thumb
            ) {
                @JsonClass(generateAdapter = true)
                data class Display(
                    @Json(name = "fr")
                    val fr: String
                )

                @JsonClass(generateAdapter = true)
                data class Small(
                    @Json(name = "fr")
                    val fr: String
                )

                @JsonClass(generateAdapter = true)
                data class Thumb(
                    @Json(name = "fr")
                    val fr: String
                )
            }
        }

        @JsonClass(generateAdapter = true)
        data class Source(
            @Json(name = "fields")
            val fields: List<String>,
            @Json(name = "id")
            val id: String,
            @Json(name = "images")
            val images: List<Any?>,
            @Json(name = "import_t")
            val importT: Int,
            @Json(name = "manufacturer")
            val manufacturer: String,
            @Json(name = "name")
            val name: String,
            @Json(name = "source_licence")
            val sourceLicence: String?,
            @Json(name = "source_licence_url")
            val sourceLicenceUrl: String?,
            @Json(name = "url")
            val url: String
        )

        @JsonClass(generateAdapter = true)
        data class SourcesFields(
            @Json(name = "org-gs1")
            val orgGs1: OrgGs1
        ) {
            @JsonClass(generateAdapter = true)
            data class OrgGs1(
                @Json(name = "gln")
                val gln: String,
                @Json(name = "gpcCategoryCode")
                val gpcCategoryCode: String,
                @Json(name = "gpcCategoryName")
                val gpcCategoryName: String,
                @Json(name = "isAllergenRelevantDataProvided")
                val isAllergenRelevantDataProvided: String,
                @Json(name = "lastChangeDateTime")
                val lastChangeDateTime: String,
                @Json(name = "partyName")
                val partyName: String,
                @Json(name = "productionVariantDescription")
                val productionVariantDescription: String,
                @Json(name = "publicationDateTime")
                val publicationDateTime: String
            )
        }
    }
}