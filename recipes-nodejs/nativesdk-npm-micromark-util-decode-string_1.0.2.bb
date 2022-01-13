SUMMARY = "NPM: micromark-util-decode-string"
DESCRIPTION = "micromark utility to decode markdown strings"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=77;endline=78;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "\
    nativesdk-npm-decode-named-character-reference \
    nativesdk-npm-micromark-util-character \
    nativesdk-npm-micromark-util-decode-numeric-character-reference \
    nativesdk-npm-micromark-util-symbol \
"

SRC_URI = "https://registry.npmjs.org/micromark-util-decode-string/-/micromark-util-decode-string-1.0.2.tgz"
SRC_URI[md5sum] = "e839737f9c439f7f6590d96f56d9d0f5"
SRC_URI[sha256sum] = "778c7f1e96c22f6607f1fdf84b40ebef5c36d25dd6ead1e7f5f43aae8353b919"

NPM_PKGNAME = "micromark-util-decode-string"

inherit npmhelper
inherit nativesdk
