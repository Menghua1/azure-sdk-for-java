// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/**
 * Lists the languages supported by the Microsoft language tokenizer.
 */
public enum MicrosoftTokenizerLanguage {
    /**
     * Selects the Microsoft tokenizer for Bangla.
     */
    BANGLA("bangla"),

    /**
     * Selects the Microsoft tokenizer for Bulgarian.
     */
    BULGARIAN("bulgarian"),

    /**
     * Selects the Microsoft tokenizer for Catalan.
     */
    CATALAN("catalan"),

    /**
     * Selects the Microsoft tokenizer for Chinese (Simplified).
     */
    CHINESE_SIMPLIFIED("chineseSimplified"),

    /**
     * Selects the Microsoft tokenizer for Chinese (Traditional).
     */
    CHINESE_TRADITIONAL("chineseTraditional"),

    /**
     * Selects the Microsoft tokenizer for Croatian.
     */
    CROATIAN("croatian"),

    /**
     * Selects the Microsoft tokenizer for Czech.
     */
    CZECH("czech"),

    /**
     * Selects the Microsoft tokenizer for Danish.
     */
    DANISH("danish"),

    /**
     * Selects the Microsoft tokenizer for Dutch.
     */
    DUTCH("dutch"),

    /**
     * Selects the Microsoft tokenizer for English.
     */
    ENGLISH("english"),

    /**
     * Selects the Microsoft tokenizer for French.
     */
    FRENCH("french"),

    /**
     * Selects the Microsoft tokenizer for German.
     */
    GERMAN("german"),

    /**
     * Selects the Microsoft tokenizer for Greek.
     */
    GREEK("greek"),

    /**
     * Selects the Microsoft tokenizer for Gujarati.
     */
    GUJARATI("gujarati"),

    /**
     * Selects the Microsoft tokenizer for Hindi.
     */
    HINDI("hindi"),

    /**
     * Selects the Microsoft tokenizer for Icelandic.
     */
    ICELANDIC("icelandic"),

    /**
     * Selects the Microsoft tokenizer for Indonesian.
     */
    INDONESIAN("indonesian"),

    /**
     * Selects the Microsoft tokenizer for Italian.
     */
    ITALIAN("italian"),

    /**
     * Selects the Microsoft tokenizer for Japanese.
     */
    JAPANESE("japanese"),

    /**
     * Selects the Microsoft tokenizer for Kannada.
     */
    KANNADA("kannada"),

    /**
     * Selects the Microsoft tokenizer for Korean.
     */
    KOREAN("korean"),

    /**
     * Selects the Microsoft tokenizer for Malay.
     */
    MALAY("malay"),

    /**
     * Selects the Microsoft tokenizer for Malayalam.
     */
    MALAYALAM("malayalam"),

    /**
     * Selects the Microsoft tokenizer for Marathi.
     */
    MARATHI("marathi"),

    /**
     * Selects the Microsoft tokenizer for Norwegian (Bokmål).
     */
    NORWEGIAN_BOKMAAL("norwegianBokmaal"),

    /**
     * Selects the Microsoft tokenizer for Polish.
     */
    POLISH("polish"),

    /**
     * Selects the Microsoft tokenizer for Portuguese.
     */
    PORTUGUESE("portuguese"),

    /**
     * Selects the Microsoft tokenizer for Portuguese (Brazil).
     */
    PORTUGUESE_BRAZILIAN("portugueseBrazilian"),

    /**
     * Selects the Microsoft tokenizer for Punjabi.
     */
    PUNJABI("punjabi"),

    /**
     * Selects the Microsoft tokenizer for Romanian.
     */
    ROMANIAN("romanian"),

    /**
     * Selects the Microsoft tokenizer for Russian.
     */
    RUSSIAN("russian"),

    /**
     * Selects the Microsoft tokenizer for Serbian (Cyrillic).
     */
    SERBIAN_CYRILLIC("serbianCyrillic"),

    /**
     * Selects the Microsoft tokenizer for Serbian (Latin).
     */
    SERBIAN_LATIN("serbianLatin"),

    /**
     * Selects the Microsoft tokenizer for Slovenian.
     */
    SLOVENIAN("slovenian"),

    /**
     * Selects the Microsoft tokenizer for Spanish.
     */
    SPANISH("spanish"),

    /**
     * Selects the Microsoft tokenizer for Swedish.
     */
    SWEDISH("swedish"),

    /**
     * Selects the Microsoft tokenizer for Tamil.
     */
    TAMIL("tamil"),

    /**
     * Selects the Microsoft tokenizer for Telugu.
     */
    TELUGU("telugu"),

    /**
     * Selects the Microsoft tokenizer for Thai.
     */
    THAI("thai"),

    /**
     * Selects the Microsoft tokenizer for Ukrainian.
     */
    UKRAINIAN("ukrainian"),

    /**
     * Selects the Microsoft tokenizer for Urdu.
     */
    URDU("urdu"),

    /**
     * Selects the Microsoft tokenizer for Vietnamese.
     */
    VIETNAMESE("vietnamese");

    /**
     * The actual serialized value for a MicrosoftTokenizerLanguage instance.
     */
    private final String value;

    MicrosoftTokenizerLanguage(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MicrosoftTokenizerLanguage instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed MicrosoftTokenizerLanguage object, or null if unable to parse.
     */
    public static MicrosoftTokenizerLanguage fromString(String value) {
        if (value == null) {
            return null;
        }
        MicrosoftTokenizerLanguage[] items = MicrosoftTokenizerLanguage.values();
        for (MicrosoftTokenizerLanguage item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
