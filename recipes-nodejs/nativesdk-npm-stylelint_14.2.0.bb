SUMMARY = "NPM: stylelint"
DESCRIPTION = "A mighty, modern CSS linter."
HOMEPAGE = "https://stylelint.io"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e0ecf49fffcf64b1f3fa0a956ea44a0"

DEPENDS = "\
    nativesdk-npm-balanced-match \
    nativesdk-npm-colord \
    nativesdk-npm-cosmiconfig \
    nativesdk-npm-debug \
    nativesdk-npm-execall \
    nativesdk-npm-fast-glob \
    nativesdk-npm-fastest-levenshtein \
    nativesdk-npm-file-entry-cache \
    nativesdk-npm-get-stdin \
    nativesdk-npm-global-modules \
    nativesdk-npm-globby \
    nativesdk-npm-globjoin \
    nativesdk-npm-html-tags \
    nativesdk-npm-ignore \
    nativesdk-npm-import-lazy \
    nativesdk-npm-imurmurhash \
    nativesdk-npm-is-plain-object \
    nativesdk-npm-known-css-properties \
    nativesdk-npm-mathml-tag-names \
    nativesdk-npm-meow \
    nativesdk-npm-micromatch \
    nativesdk-npm-normalize-path \
    nativesdk-npm-normalize-selector \
    nativesdk-npm-picocolors \
    nativesdk-npm-postcss \
    nativesdk-npm-postcss-media-query-parser \
    nativesdk-npm-postcss-resolve-nested-selector \
    nativesdk-npm-postcss-safe-parser \
    nativesdk-npm-postcss-selector-parser \
    nativesdk-npm-postcss-value-parser \
    nativesdk-npm-resolve-from \
    nativesdk-npm-specificity \
    nativesdk-npm-string-width \
    nativesdk-npm-strip-ansi \
    nativesdk-npm-style-search \
    nativesdk-npm-svg-tags \
    nativesdk-npm-table \
    nativesdk-npm-v8-compile-cache \
    nativesdk-npm-write-file-atomic \
"

SRC_URI = "https://registry.npmjs.org/stylelint/-/stylelint-14.2.0.tgz"
SRC_URI[md5sum] = "b88e226f11c4c7dd157038b811c5cd15"
SRC_URI[sha256sum] = "e9ddd0a64d439ef632cb706a470be4fbf954fe907d64ad6b8c944ce19c7884ce"

NPM_PKGNAME = "stylelint"

inherit npmhelper
inherit nativesdk
