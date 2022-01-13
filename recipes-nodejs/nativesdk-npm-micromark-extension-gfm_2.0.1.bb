SUMMARY = "NPM: micromark-extension-gfm"
DESCRIPTION = "micromark extension to support GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "\
    nativesdk-npm-micromark-extension-gfm-autolink-literal \
    nativesdk-npm-micromark-extension-gfm-footnote \
    nativesdk-npm-micromark-extension-gfm-strikethrough \
    nativesdk-npm-micromark-extension-gfm-table \
    nativesdk-npm-micromark-extension-gfm-tagfilter \
    nativesdk-npm-micromark-extension-gfm-task-list-item \
    nativesdk-npm-micromark-util-combine-extensions \
    nativesdk-npm-micromark-util-types \
"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm/-/micromark-extension-gfm-2.0.1.tgz"
SRC_URI[md5sum] = "db4c039327568be8cbdf01617d73a91b"
SRC_URI[sha256sum] = "ff2f56f9271307e2ca7ff626460e1781ed008f9b99012f483fc932ebf812eff1"

NPM_PKGNAME = "micromark-extension-gfm"

inherit npmhelper
inherit nativesdk
