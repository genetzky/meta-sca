SUMMARY = "NPM: standard"
DESCRIPTION = "JavaScript Standard Style"
HOMEPAGE = "https://standardjs.com"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = "\
    nativesdk-npm-eslint \
    nativesdk-npm-eslint-config-standard \
    nativesdk-npm-eslint-config-standard-jsx \
    nativesdk-npm-eslint-plugin-import \
    nativesdk-npm-eslint-plugin-node \
    nativesdk-npm-eslint-plugin-promise \
    nativesdk-npm-eslint-plugin-react \
    nativesdk-npm-standard-engine \
"

SRC_URI = "https://registry.npmjs.org/standard/-/standard-16.0.4.tgz"
SRC_URI[md5sum] = "a67fd53c88f197ecf5ad15f8f045b290"
SRC_URI[sha256sum] = "e66121a9d06ef94b473b0e802e4bb68baa0c5a3cacf5d06cda935f3962f0334c"

NPM_PKGNAME = "standard"

inherit npmhelper
inherit nativesdk
