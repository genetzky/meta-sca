SUMMARY = "NPM: listr2"
DESCRIPTION = "Terminal task list reborn! Create beautiful CLI interfaces via easy and logical to implement task lists that feel alive and interactive."
HOMEPAGE = "https://github.com/cenk1cenk2/listr2#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04c495203ab16a62384075f5ef0477d4"

DEPENDS = "\
    nativesdk-npm-cli-truncate \
    nativesdk-npm-colorette \
    nativesdk-npm-log-update \
    nativesdk-npm-p-map \
    nativesdk-npm-rfdc \
    nativesdk-npm-rxjs \
    nativesdk-npm-through \
    nativesdk-npm-wrap-ansi \
"

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-4.0.0.tgz"
SRC_URI[md5sum] = "b400ccf7b7f406fa3c4c6af4340e2c7f"
SRC_URI[sha256sum] = "9ace55b8348a3347d55bd620b3863467c61b6349b53b1b05118e432b2ad403d9"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit nativesdk
