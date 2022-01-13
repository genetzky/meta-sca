SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "\
    nativesdk-npm-fast-deep-equal \
    nativesdk-npm-json-schema-traverse \
    nativesdk-npm-require-from-string \
    nativesdk-npm-uri-js \
"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.8.2.tgz"
SRC_URI[md5sum] = "d4db978293db712801adf9880a9b76c8"
SRC_URI[sha256sum] = "b25e585707b7768b139daf938fd1b951311f776e461566c8dc8fed4e94e802f1"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit nativesdk
