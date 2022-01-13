SUMMARY = "NPM: micromark-core-commonmark"
DESCRIPTION = "The CommonMark markdown constructs"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=70;endline=71;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "\
    nativesdk-npm-decode-named-character-reference \
    nativesdk-npm-micromark-factory-destination \
    nativesdk-npm-micromark-factory-label \
    nativesdk-npm-micromark-factory-space \
    nativesdk-npm-micromark-factory-title \
    nativesdk-npm-micromark-factory-whitespace \
    nativesdk-npm-micromark-util-character \
    nativesdk-npm-micromark-util-chunked \
    nativesdk-npm-micromark-util-classify-character \
    nativesdk-npm-micromark-util-html-tag-name \
    nativesdk-npm-micromark-util-normalize-identifier \
    nativesdk-npm-micromark-util-resolve-all \
    nativesdk-npm-micromark-util-subtokenize \
    nativesdk-npm-micromark-util-symbol \
    nativesdk-npm-micromark-util-types \
    nativesdk-npm-uvu \
"

SRC_URI = "https://registry.npmjs.org/micromark-core-commonmark/-/micromark-core-commonmark-1.0.6.tgz"
SRC_URI[md5sum] = "2639b8a9dae7124612759ff4763afd0b"
SRC_URI[sha256sum] = "f04fdfd6587a3487f479705032c83ec7755f6e687183ee370b9271eb03686723"

NPM_PKGNAME = "micromark-core-commonmark"

inherit npmhelper
inherit nativesdk
