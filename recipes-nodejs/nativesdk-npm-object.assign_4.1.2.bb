SUMMARY = "NPM: object.assign"
DESCRIPTION = "ES6 spec-compliant Object.assign shim. From https://github.com/es-shims/es6-shim"
HOMEPAGE = "https://github.com/ljharb/object.assign#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b439ca9e99134dee172a7cc6d989174"

DEPENDS = "\
    nativesdk-npm-call-bind \
    nativesdk-npm-define-properties \
    nativesdk-npm-has-symbols \
    nativesdk-npm-object-keys \
"

SRC_URI = "https://registry.npmjs.org/object.assign/-/object.assign-4.1.2.tgz"
SRC_URI[md5sum] = "87b8da296ced17d6e062b791d48ed38b"
SRC_URI[sha256sum] = "acd6e7522988d9d32b68efbce6da0abaac28dd9cab50a2e7c9ead1d53fa8214f"

NPM_PKGNAME = "object.assign"

inherit npmhelper
inherit nativesdk
