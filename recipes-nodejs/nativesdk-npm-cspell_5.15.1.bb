SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "\
    nativesdk-npm-chalk \
    nativesdk-npm-commander \
    nativesdk-npm-comment-json \
    nativesdk-npm-cspell-gitignore \
    nativesdk-npm-cspell-glob \
    nativesdk-npm-cspell-lib \
    nativesdk-npm-fast-json-stable-stringify \
    nativesdk-npm-file-entry-cache \
    nativesdk-npm-fs-extra \
    nativesdk-npm-get-stdin \
    nativesdk-npm-glob \
    nativesdk-npm-imurmurhash \
    nativesdk-npm-semver \
    nativesdk-npm-strip-ansi \
    nativesdk-npm-vscode-uri \
"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.15.1.tgz"
SRC_URI[md5sum] = "2b181eb837f1291b31ed6b3be122297d"
SRC_URI[sha256sum] = "b52f63d5b7e506d84957e4e28deeebfd1080110cb292e337ecab58e69bae10dd"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit nativesdk
