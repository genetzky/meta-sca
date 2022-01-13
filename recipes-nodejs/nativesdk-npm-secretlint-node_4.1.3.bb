SUMMARY = "NPM: @secretlint/node"
DESCRIPTION = "Secretlint client library for Node.js"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/node/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "\
    nativesdk-npm-debug \
    nativesdk-npm-p-map \
    nativesdk-npm-secretlint-config-loader \
    nativesdk-npm-secretlint-core \
    nativesdk-npm-secretlint-formatter \
    nativesdk-npm-secretlint-profiler \
    nativesdk-npm-secretlint-source-creator \
"

SRC_URI = "https://registry.npmjs.org/@secretlint/node/-/node-4.1.3.tgz"
SRC_URI[md5sum] = "55608ecd434772acf02ab247c4e31dd9"
SRC_URI[sha256sum] = "8dce3ef3f8b899f0433e94fb922dec03bc012bf706c7932564b2ba474d447790"

NPM_PKGNAME = "@secretlint/node"

inherit npmhelper
inherit nativesdk
