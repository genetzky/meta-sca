SUMMARY = "NPM: es-abstract"
DESCRIPTION = "ECMAScript spec abstract operations."
HOMEPAGE = "https://github.com/ljharb/es-abstract#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "\
    nativesdk-npm-call-bind \
    nativesdk-npm-es-to-primitive \
    nativesdk-npm-function-bind \
    nativesdk-npm-get-intrinsic \
    nativesdk-npm-get-symbol-description \
    nativesdk-npm-has \
    nativesdk-npm-has-symbols \
    nativesdk-npm-internal-slot \
    nativesdk-npm-is-callable \
    nativesdk-npm-is-negative-zero \
    nativesdk-npm-is-regex \
    nativesdk-npm-is-shared-array-buffer \
    nativesdk-npm-is-string \
    nativesdk-npm-is-weakref \
    nativesdk-npm-object-inspect \
    nativesdk-npm-object-keys \
    nativesdk-npm-object.assign \
    nativesdk-npm-string.prototype.trimend \
    nativesdk-npm-string.prototype.trimstart \
    nativesdk-npm-unbox-primitive \
"

SRC_URI = "https://registry.npmjs.org/es-abstract/-/es-abstract-1.19.1.tgz"
SRC_URI[md5sum] = "11444142629b2eb1c6cc47907ca74f1f"
SRC_URI[sha256sum] = "10fd94f8d892b32a91429bb7be44e1256d891c69467ae522e79bd6400f8946bc"

NPM_PKGNAME = "es-abstract"

inherit npmhelper
inherit nativesdk
