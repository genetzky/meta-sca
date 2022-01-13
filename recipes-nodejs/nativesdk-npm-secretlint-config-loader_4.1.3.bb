SUMMARY = "NPM: @secretlint/config-loader"
DESCRIPTION = "Config loader for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-loader/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "\
    nativesdk-npm-debug \
    nativesdk-npm-rc-config-loader \
    nativesdk-npm-secretlint-config-validator \
    nativesdk-npm-secretlint-profiler \
    nativesdk-npm-secretlint-types \
    nativesdk-npm-try-resolve \
"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-4.1.3.tgz"
SRC_URI[md5sum] = "5acd4e9c74767b96ce011a48f2ddf9a9"
SRC_URI[sha256sum] = "7fed074ff9d598b4188d78be3296cd33e3b8e5f35b90207e257d769223fc79aa"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit nativesdk
