SUMMARY = "This repo holds patterns for finding odd Go code"
HOMEPAGE = "https://github.com/dgryski/semgrep-go.git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cceb70c3f326568ccff13faee2f67113"

SRC_URI = "git://github.com/dgryski/semgrep-go.git;protocol=https"
SRCREV = "e5d96847b2712b3d7780f6a58d27efe1ad422d2d"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}/semgrep/semgrep-go
    install -m 0644 ${S}/*.yml ${D}${datadir}/semgrep/semgrep-go/
}

FILES_${PN} = "${datadir}"
