SUMMARY = "NPM: jshint"
DESCRIPTION = "Static analysis tool for JavaScript"
HOMEPAGE = "http://jshint.com/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19041df56fbb7a49fb87c4322d5849"

DEPENDS = "\
    nativesdk-npm-cli \
    nativesdk-npm-console-browserify \
    nativesdk-npm-exit \
    nativesdk-npm-htmlparser2 \
    nativesdk-npm-lodash \
    nativesdk-npm-minimatch \
    nativesdk-npm-shelljs \
    nativesdk-npm-strip-json-comments \
"

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.13.3.tgz"
SRC_URI[md5sum] = "2fc5ebafe032724e9b4637eb62ed9ff1"
SRC_URI[sha256sum] = "b6e9897134aac532cae572615ff091d4cc643f5f3711bc71dd88054cda005795"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit nativesdk
