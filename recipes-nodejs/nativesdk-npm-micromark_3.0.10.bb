SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "\
    nativesdk-npm-debug \
    nativesdk-npm-decode-named-character-reference \
    nativesdk-npm-micromark-core-commonmark \
    nativesdk-npm-micromark-factory-space \
    nativesdk-npm-micromark-util-character \
    nativesdk-npm-micromark-util-chunked \
    nativesdk-npm-micromark-util-combine-extensions \
    nativesdk-npm-micromark-util-decode-numeric-character-reference \
    nativesdk-npm-micromark-util-encode \
    nativesdk-npm-micromark-util-normalize-identifier \
    nativesdk-npm-micromark-util-resolve-all \
    nativesdk-npm-micromark-util-sanitize-uri \
    nativesdk-npm-micromark-util-subtokenize \
    nativesdk-npm-micromark-util-symbol \
    nativesdk-npm-micromark-util-types \
    nativesdk-npm-types-debug \
    nativesdk-npm-uvu \
"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-3.0.10.tgz"
SRC_URI[md5sum] = "02d71a4d4597f352dd6d593ef6d80cc7"
SRC_URI[sha256sum] = "4b32b96c8b9b6199a873fc6f5ed7950f795b01466542874cd26fb917f50f88ca"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit nativesdk
