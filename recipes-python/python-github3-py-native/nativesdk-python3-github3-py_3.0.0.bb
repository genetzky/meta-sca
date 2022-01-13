SUMMARY = "Python wrapper for the GitHub API"
HOMEPAGE = "https://github.com/sigmavirus24/github3.py"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b574ed4b26bdce9060017ce052d0109"

DEPENDS += "\
    nativesdk-python3-jwcrypto \
    nativesdk-python3-python-dateutil \
    nativesdk-python3-requests \
    nativesdk-python3-uritemplate \
"

PYPI_PACKAGE = "github3.py"

SRC_URI[md5sum] = "2d7132e59549355f51e121c37e7be8b2"
SRC_URI[sha256sum] = "a9134cb9efd334b1644ad7c5ee3ff3ff488317c4549ffc0e8d82e4d63383a1a4"

inherit pypi
inherit setuptools3
inherit nativesdk
