SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dbc7fedfc1975d32106f930116d0082"

DEPENDS = "\
    nativesdk-npm-array-includes \
    nativesdk-npm-array.prototype.flatmap \
    nativesdk-npm-doctrine \
    nativesdk-npm-estraverse \
    nativesdk-npm-jsx-ast-utils \
    nativesdk-npm-minimatch \
    nativesdk-npm-object.entries \
    nativesdk-npm-object.fromentries \
    nativesdk-npm-object.hasown \
    nativesdk-npm-object.values \
    nativesdk-npm-prop-types \
    nativesdk-npm-resolve \
    nativesdk-npm-semver \
    nativesdk-npm-string.prototype.matchall \
"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.28.0.tgz"
SRC_URI[md5sum] = "601ac9e7582deff700f6738dc1464e7f"
SRC_URI[sha256sum] = "0182e119fa4287b25eaa50db42fe65217aa6d4844f38612431e1fc142d647def"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit nativesdk
