SUMMARY = "NPM: rousseau"
DESCRIPTION = "Lightweight proofreader"
HOMEPAGE = "https://github.com/GitbookIO/rousseau"

DEPENDS = "\
    nativesdk-npm-bash-color \
    nativesdk-npm-cli-table \
    nativesdk-npm-crc \
    nativesdk-npm-find-line-column \
    nativesdk-npm-lodash \
    nativesdk-npm-simple-lru-cache \
    nativesdk-npm-tokenize-english \
    nativesdk-npm-tokenize-htmltext \
    nativesdk-npm-tokenize-text \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eef0cb2dfaccc1ebd623706ec7e6d1c6"

SRC_URI = "https://registry.npmjs.org/rousseau/-/rousseau-1.0.5.tgz"
SRC_URI[md5sum] = "0d16367e7cd1b95492c128e0f515d8e8"
SRC_URI[sha256sum] = "86ddc2f556f58045c0c1bac1f682fce78ffa309b66ef36bf6109c88eff126509"

NPM_PKGNAME = "rousseau"

inherit npmhelper
inherit nativesdk
