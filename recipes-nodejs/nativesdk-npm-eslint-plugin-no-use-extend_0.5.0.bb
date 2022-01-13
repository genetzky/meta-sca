SUMMARY = "\
    NPM: \
    nativesdk-eslint-plugin-no-use-extend \
"
DESCRIPTION = "ESLint plugin to prevent use of extended native objects"
HOMEPAGE = "nativesdk-https://github.com/dustinspecker/eslint-plugin-no-use-extend"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

DEPENDS = "\
    nativesdk-npm-is-get-set-prop \
    nativesdk-npm-is-js-type \
    nativesdk-npm-is-obj-prop \
    nativesdk-npm-is-proto-prop \
"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-use-extend-native/-/eslint-plugin-no-use-extend-native-0.5.0.tgz"
SRC_URI[md5sum] = "a48d077c9bea5967828bfa4ccb30879d"
SRC_URI[sha256sum] = "6f9c93d0bbddd682af54ef449e7f7bb8bf9212521c7a0051a03ca204c2f2ea96"

NPM_PKGNAME = "nativesdk-eslint-plugin-no-use-extend"

inherit npmhelper
inherit nativesdk
