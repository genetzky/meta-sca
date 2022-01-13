SUMMARY = "NPM: eslint"
DESCRIPTION = "An AST-based pattern checker for JavaScript."
HOMEPAGE = "https://eslint.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b58aa052648f366fd94c13b91b417d5"

DEPENDS = "\
    nativesdk-npm-ajv \
    nativesdk-npm-chalk \
    nativesdk-npm-cross-spawn \
    nativesdk-npm-debug \
    nativesdk-npm-doctrine \
    nativesdk-npm-enquirer \
    nativesdk-npm-escape-string-regexp \
    nativesdk-npm-eslint-eslintrc \
    nativesdk-npm-eslint-scope \
    nativesdk-npm-eslint-utils \
    nativesdk-npm-eslint-visitor-keys \
    nativesdk-npm-espree \
    nativesdk-npm-esquery \
    nativesdk-npm-esutils \
    nativesdk-npm-fast-deep-equal \
    nativesdk-npm-file-entry-cache \
    nativesdk-npm-functional-red-black-tree \
    nativesdk-npm-glob-parent \
    nativesdk-npm-globals \
    nativesdk-npm-humanwhocodes-config-array \
    nativesdk-npm-ignore \
    nativesdk-npm-import-fresh \
    nativesdk-npm-imurmurhash \
    nativesdk-npm-is-glob \
    nativesdk-npm-js-yaml \
    nativesdk-npm-json-stable-stringify-without-jsonify \
    nativesdk-npm-levn \
    nativesdk-npm-lodash.merge \
    nativesdk-npm-minimatch \
    nativesdk-npm-natural-compare \
    nativesdk-npm-optionator \
    nativesdk-npm-progress \
    nativesdk-npm-regexpp \
    nativesdk-npm-semver \
    nativesdk-npm-strip-ansi \
    nativesdk-npm-strip-json-comments \
    nativesdk-npm-text-table \
    nativesdk-npm-v8-compile-cache \
"

SRC_URI = "https://registry.npmjs.org/eslint/-/eslint-8.6.0.tgz"
SRC_URI[md5sum] = "7d13c50f48175f86322e2582d130a027"
SRC_URI[sha256sum] = "ca47edc46dd95316882d457ee782e47b4c7bf5e3c095c8d98a44ccac63974d39"

NPM_PKGNAME = "eslint"

inherit npmhelper
inherit nativesdk
