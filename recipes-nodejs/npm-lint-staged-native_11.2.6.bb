SUMMARY = "NPM: lint-staged"
DESCRIPTION = "Lint files staged by git"
HOMEPAGE = "https://github.com/okonet/lint-staged#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b44479d65c486365b13a21124f3fe39"

DEPENDS = "npm-cli-truncate-native \
           npm-colorette-native \
           npm-commander-native \
           npm-cosmiconfig-native \
           npm-debug-native \
           npm-enquirer-native \
           npm-execa-native \
           npm-listr2-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-please-upgrade-node-native \
           npm-string-argv-native \
           npm-stringify-object-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/lint-staged/-/lint-staged-11.2.6.tgz"
SRC_URI[md5sum] = "2a95d46a92ba2a34aabf8a79fd8763ce"
SRC_URI[sha256sum] = "ba56f2d0506084f2c10fb15808077483fe80bb90589142ed8e794f29f6b38231"

NPM_PKGNAME = "lint-staged"

inherit npmhelper
inherit native