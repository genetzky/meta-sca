SUMMARY = "NPM: textlint-rule-no-dead-link"
DESCRIPTION = "A textlint rule to check if all links are alive"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-dead-link"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ReadMe.md;beginline=175;md5=85e52b1f62cc74af17c98ccec0558602"

DEPENDS = "\
    nativesdk-npm-fs-extra \
    nativesdk-npm-get-url-origin \
    nativesdk-npm-minimatch \
    nativesdk-npm-node-fetch \
    nativesdk-npm-p-memoize \
    nativesdk-npm-p-queue \
    nativesdk-npm-textlint-rule-helper \
"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-dead-link/-/textlint-rule-no-dead-link-4.8.0.tgz"
SRC_URI[md5sum] = "ff09ef1819b472c9af2ac75a8528dbe4"
SRC_URI[sha256sum] = "6886754b91c903017a6ec23671684bf3e69325cdec043123cbd1e1271db871a0"

NPM_PKGNAME = "textlint-rule-no-dead-link"

inherit npmhelper
inherit nativesdk
