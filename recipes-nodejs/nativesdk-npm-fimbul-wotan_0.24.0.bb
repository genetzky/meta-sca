SUMMARY = "NPM: @fimbul/wotan"
DESCRIPTION = "Pluggable TypeScript and JavaScript linter"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "\
    nativesdk-npm-bind-decorator \
    nativesdk-npm-chalk \
    nativesdk-npm-debug \
    nativesdk-npm-diff \
    nativesdk-npm-fimbul-mimir \
    nativesdk-npm-fimbul-ymir \
    nativesdk-npm-glob \
    nativesdk-npm-import-local \
    nativesdk-npm-inversify \
    nativesdk-npm-is-negated-glob \
    nativesdk-npm-js-yaml \
    nativesdk-npm-json5 \
    nativesdk-npm-minimatch \
    nativesdk-npm-normalize-glob \
    nativesdk-npm-reflect-metadata \
    nativesdk-npm-resolve \
    nativesdk-npm-semver \
    nativesdk-npm-stable \
    nativesdk-npm-tslib \
    nativesdk-npm-tsutils \
"

SRC_URI = "https://registry.npmjs.org/@fimbul/wotan/-/wotan-0.24.0.tgz"
SRC_URI[md5sum] = "27887bcdd051082482ad13550678ea26"
SRC_URI[sha256sum] = "944ac40f468235a0d65eb314431c86d9d1449a220532b078db184690f9452135"

NPM_PKGNAME = "@fimbul/wotan"

inherit npmhelper
inherit nativesdk
