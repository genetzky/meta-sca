SUMMARY = "Alex Kohler static go analyzer tools"
HOMEPAGE = "https://github.com/alexkohler"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
    nativesdk-github.com-alexkohler-dogsled \
    nativesdk-github.com-alexkohler-identypo \
    nativesdk-github.com-alexkohler-nakedret \
    nativesdk-github.com-alexkohler-nargs \
    nativesdk-github.com-alexkohler-noret \
    nativesdk-github.com-alexkohler-prealloc \
    nativesdk-github.com-alexkohler-unimport \
"
inherit sca-description
inherit nativesdk
SCA_TOOL_DESCRIPTION = "alexkohler"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
