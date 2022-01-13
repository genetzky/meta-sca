SUMMARY = "NPM: textlint"
DESCRIPTION = "The pluggable linting tool for text and markdown."
HOMEPAGE = "https://github.com/textlint/textlint/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = "\
    nativesdk-npm-debug \
    nativesdk-npm-deep-equal \
    nativesdk-npm-file-entry-cache \
    nativesdk-npm-get-stdin \
    nativesdk-npm-glob \
    nativesdk-npm-is-file \
    nativesdk-npm-log-symbols \
    nativesdk-npm-md5 \
    nativesdk-npm-mkdirp \
    nativesdk-npm-optionator \
    nativesdk-npm-path-to-glob-pattern \
    nativesdk-npm-rc-config-loader \
    nativesdk-npm-read-pkg \
    nativesdk-npm-read-pkg-up \
    nativesdk-npm-structured-source \
    nativesdk-npm-textlint-ast-node-types \
    nativesdk-npm-textlint-ast-traverse \
    nativesdk-npm-textlint-feature-flag \
    nativesdk-npm-textlint-fixer-formatter \
    nativesdk-npm-textlint-kernel \
    nativesdk-npm-textlint-linter-formatter \
    nativesdk-npm-textlint-module-interop \
    nativesdk-npm-textlint-textlint-plugin-markdown \
    nativesdk-npm-textlint-textlint-plugin-text \
    nativesdk-npm-textlint-types \
    nativesdk-npm-textlint-utils \
    nativesdk-npm-try-resolve \
    nativesdk-npm-unique-concat \
"

SRC_URI = "https://registry.npmjs.org/textlint/-/textlint-12.1.0.tgz"
SRC_URI[md5sum] = "a6fed9f7d4022c1a84f1a7e49eda7c8b"
SRC_URI[sha256sum] = "548d419e120aa720ad32e42c33f60f14661abe356d53f007cee9d7f5a888b69a"

NPM_PKGNAME = "textlint"

inherit npmhelper
inherit nativesdk
