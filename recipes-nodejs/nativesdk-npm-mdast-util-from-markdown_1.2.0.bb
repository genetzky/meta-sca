SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "\
    nativesdk-npm-decode-named-character-reference \
    nativesdk-npm-mdast-util-to-string \
    nativesdk-npm-micromark \
    nativesdk-npm-micromark-util-decode-numeric-character-reference \
    nativesdk-npm-micromark-util-decode-string \
    nativesdk-npm-micromark-util-normalize-identifier \
    nativesdk-npm-micromark-util-symbol \
    nativesdk-npm-micromark-util-types \
    nativesdk-npm-types-mdast \
    nativesdk-npm-types-unist \
    nativesdk-npm-unist-util-stringify-position \
    nativesdk-npm-uvu \
"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-1.2.0.tgz"
SRC_URI[md5sum] = "fe53bf2061b59965545a0784514ef5e7"
SRC_URI[sha256sum] = "0e25d8b6f37dda461b586e8453bea761d5b60f01fb8a0f2608afe0378f89c6a1"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit nativesdk
