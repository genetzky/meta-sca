SUMMARY = "NPM: eslint-plugin-fp"
DESCRIPTION = "ESLint rules for functional programming"
HOMEPAGE = "https://github.com/jfmengels/eslint-plugin-fp#readme"

DEPENDS = "\
    nativesdk-npm-create-eslint-index \
    nativesdk-npm-eslint-ast-utils \
    nativesdk-npm-lodash \
    nativesdk-npm-req-all \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1e5b333790e6b59d4d4d223304b5e80d"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-fp/-/eslint-plugin-fp-2.3.0.tgz"
SRC_URI[md5sum] = "e52841e84026c8a56c92a5fdae969e5a"
SRC_URI[sha256sum] = "d7603d4fe3a1fb2a4790d70f8ade1a79d79226961b9fb14fc7052e12b3009aa0"

NPM_PKGNAME = "eslint-plugin-fp"

inherit npmhelper
inherit nativesdk
