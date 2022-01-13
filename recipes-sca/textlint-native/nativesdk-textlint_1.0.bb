SUMMARY = "sca definition for textlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
    nativesdk-npm-textlint \
    nativesdk-npm-textlint-filter-rule-comments \
    nativesdk-npm-textlint-plugin-html \
    nativesdk-npm-textlint-plugin-rst \
    nativesdk-npm-textlint-rule-abbr-within-parentheses \
    nativesdk-npm-textlint-rule-apostrophe \
    nativesdk-npm-textlint-rule-common-misspellings \
    nativesdk-npm-textlint-rule-date-weekday-mismatch \
    nativesdk-npm-textlint-rule-diacritics \
    nativesdk-npm-textlint-rule-en-capitalization \
    nativesdk-npm-textlint-rule-en-max-word-count \
    nativesdk-npm-textlint-rule-ginger \
    nativesdk-npm-textlint-rule-helper \
    nativesdk-npm-textlint-rule-max-comma \
    nativesdk-npm-textlint-rule-max-number-of-lines \
    nativesdk-npm-textlint-rule-ng-word \
    nativesdk-npm-textlint-rule-no-dead-link \
    nativesdk-npm-textlint-rule-no-empty-section \
    nativesdk-npm-textlint-rule-no-exclamation-question-mark \
    nativesdk-npm-textlint-rule-no-nfd \
    nativesdk-npm-textlint-rule-no-start-duplicated-conjunction \
    nativesdk-npm-textlint-rule-no-surrogate-pair \
    nativesdk-npm-textlint-rule-no-todo \
    nativesdk-npm-textlint-rule-period-in-list-item \
    nativesdk-npm-textlint-rule-rousseau \
    nativesdk-npm-textlint-rule-stop-words \
    nativesdk-npm-textlint-rule-terminology \
    nativesdk-npm-textlint-rule-textlint-rule-no-invalid-control-character \
    nativesdk-npm-textlint-rule-unexpanded-acronym \
    nativesdk-npm-textlint-rule-write-good \
"
inherit sca-description
inherit nativesdk
SCA_TOOL_DESCRIPTION = "textlint"
