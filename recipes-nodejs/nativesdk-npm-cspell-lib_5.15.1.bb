SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "\
    nativesdk-npm-clear-module \
    nativesdk-npm-comment-json \
    nativesdk-npm-configstore \
    nativesdk-npm-cosmiconfig \
    nativesdk-npm-cspell-cspell-bundled-dicts \
    nativesdk-npm-cspell-cspell-types \
    nativesdk-npm-cspell-glob \
    nativesdk-npm-cspell-io \
    nativesdk-npm-cspell-trie-lib \
    nativesdk-npm-find-up \
    nativesdk-npm-fs-extra \
    nativesdk-npm-gensequence \
    nativesdk-npm-import-fresh \
    nativesdk-npm-resolve-from \
    nativesdk-npm-resolve-global \
    nativesdk-npm-vscode-uri \
"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-5.15.1.tgz"
SRC_URI[md5sum] = "08c0ebae807b3c59f9f4180abd5c7e34"
SRC_URI[sha256sum] = "039f33f5b74d53bdba09084eedb4224b262a4afad5bed1e723a0edd23587c4c4"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit nativesdk
