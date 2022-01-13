SUMMARY = "NPM: @textlint/fixer-formatter"
DESCRIPTION = "textlint output formatter for fixer"
HOMEPAGE = "https://github.com/textlint/textlint#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = "\
    nativesdk-npm-chalk \
    nativesdk-npm-debug \
    nativesdk-npm-diff \
    nativesdk-npm-is-file \
    nativesdk-npm-string-width \
    nativesdk-npm-strip-ansi \
    nativesdk-npm-text-table \
    nativesdk-npm-textlint-module-interop \
    nativesdk-npm-textlint-types \
    nativesdk-npm-try-resolve \
"

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-12.1.0.tgz"
SRC_URI[md5sum] = "3a834e42e65bc547a91b1520b1403bd7"
SRC_URI[sha256sum] = "f54140cc45f202cde6788bca6f4da250ecbcaf8683f44a82719a05d9d2929213"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit nativesdk
