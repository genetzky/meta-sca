SUMMARY = "NPM: mdast-util-gfm"
DESCRIPTION = "mdast extension to parse and serialize GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "\
    nativesdk-npm-mdast-util-gfm-autolink-literal \
    nativesdk-npm-mdast-util-gfm-footnote \
    nativesdk-npm-mdast-util-gfm-strikethrough \
    nativesdk-npm-mdast-util-gfm-table \
    nativesdk-npm-mdast-util-gfm-task-list-item \
"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm/-/mdast-util-gfm-2.0.0.tgz"
SRC_URI[md5sum] = "7e733155999d013f04a53d9f2da37210"
SRC_URI[sha256sum] = "7d45e5495e01b36cc3bad4e567bf2635eb81ce98aefabee743939e0ef2b781f7"

NPM_PKGNAME = "mdast-util-gfm"

inherit npmhelper
inherit nativesdk
