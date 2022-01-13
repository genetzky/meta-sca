SUMMARY = "NPM: @secretlint/formatter"
DESCRIPTION = "A formatter collection for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/formatter/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "\
    nativesdk-npm-chalk \
    nativesdk-npm-debug \
    nativesdk-npm-pluralize \
    nativesdk-npm-secretlint-types \
    nativesdk-npm-strip-ansi \
    nativesdk-npm-table \
    nativesdk-npm-terminal-link \
    nativesdk-npm-textlint-linter-formatter \
    nativesdk-npm-textlint-types \
    nativesdk-npm-try-resolve \
"

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-4.1.3.tgz"
SRC_URI[md5sum] = "2cb2c2e66f16ad535353b6d8cc044d6a"
SRC_URI[sha256sum] = "57f0939bfadb8fb2f783b6e6f7bc0618988ff72013dec3c526a3e8d9ebaa1542"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit nativesdk
