SUMMARY = "NPM: tslint"
DESCRIPTION = "An extensible static analysis linter for the TypeScript language"
HOMEPAGE = "https://palantir.github.io/tslint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS = "\
    nativesdk-npm-babel-code-frame \
    nativesdk-npm-builtin-modules \
    nativesdk-npm-chalk \
    nativesdk-npm-commander \
    nativesdk-npm-diff \
    nativesdk-npm-glob \
    nativesdk-npm-js-yaml \
    nativesdk-npm-minimatch \
    nativesdk-npm-mkdirp \
    nativesdk-npm-resolve \
    nativesdk-npm-semver \
    nativesdk-npm-tslib \
    nativesdk-npm-tsutils \
"

SRC_URI = "https://registry.npmjs.org/tslint/-/tslint-6.1.3.tgz"
SRC_URI[md5sum] = "57f2fc00cf994c8342ad3d821df1d6c3"
SRC_URI[sha256sum] = "e35879c2f92e7dd865c55117bf0fbe3d5ad2c62142fddb7051696ebf8312db43"

NPM_PKGNAME = "tslint"

inherit npmhelper
inherit nativesdk
