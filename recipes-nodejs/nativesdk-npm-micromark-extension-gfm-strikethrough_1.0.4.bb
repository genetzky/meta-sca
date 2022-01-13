SUMMARY = "NPM: micromark-extension-gfm-strikethrough"
DESCRIPTION = "micromark extension to support GFM strikethrough"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-strikethrough#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "\
    nativesdk-npm-micromark-util-chunked \
    nativesdk-npm-micromark-util-classify-character \
    nativesdk-npm-micromark-util-resolve-all \
    nativesdk-npm-micromark-util-symbol \
    nativesdk-npm-micromark-util-types \
    nativesdk-npm-uvu \
"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-strikethrough/-/micromark-extension-gfm-strikethrough-1.0.4.tgz"
SRC_URI[md5sum] = "96d362d0953dfd98afa675aec7e46df1"
SRC_URI[sha256sum] = "d3cfb6436c7e24ac5692b3e2382f1c808d428ad6affe200d9e864ca0b218e34d"

NPM_PKGNAME = "micromark-extension-gfm-strikethrough"

inherit npmhelper
inherit nativesdk
