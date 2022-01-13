SUMMARY = "NPM: vue-eslint-parser"
DESCRIPTION = "The ESLint custom parser for `.vue` files."
HOMEPAGE = "https://github.com/vuejs/vue-eslint-parser#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a97f9a1783ce81158d7f11f98073ce5"

DEPENDS = "\
    nativesdk-npm-debug \
    nativesdk-npm-eslint-scope \
    nativesdk-npm-eslint-visitor-keys \
    nativesdk-npm-espree \
    nativesdk-npm-esquery \
    nativesdk-npm-lodash \
    nativesdk-npm-semver \
"

SRC_URI = "https://registry.npmjs.org/vue-eslint-parser/-/vue-eslint-parser-8.0.1.tgz"
SRC_URI[md5sum] = "716344bfc9789428190451a8569e495f"
SRC_URI[sha256sum] = "cfa47445b8c9f60848f205ea31a179f90585657206f2c185f61ab6611a233988"

NPM_PKGNAME = "vue-eslint-parser"

inherit npmhelper
inherit nativesdk
