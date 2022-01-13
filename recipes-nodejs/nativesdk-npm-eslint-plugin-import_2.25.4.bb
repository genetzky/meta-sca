SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "\
    nativesdk-npm-array-includes \
    nativesdk-npm-array.prototype.flat \
    nativesdk-npm-debug \
    nativesdk-npm-doctrine \
    nativesdk-npm-eslint-import-resolver-node \
    nativesdk-npm-eslint-module-utils \
    nativesdk-npm-has \
    nativesdk-npm-is-core-module \
    nativesdk-npm-is-glob \
    nativesdk-npm-minimatch \
    nativesdk-npm-object.values \
    nativesdk-npm-resolve \
    nativesdk-npm-tsconfig-paths \
"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.25.4.tgz"
SRC_URI[md5sum] = "441bc6892fc8ba6a5b335b241d27954b"
SRC_URI[sha256sum] = "96d40d97f89261c792a276dc515c20fafbbc4c2e24d6e51d34a53b700957021d"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit nativesdk
