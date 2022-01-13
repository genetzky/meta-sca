SUMMARY = "pandas library for high-performance data analysis tools"
HOMEPAGE = "http://pandas.pydata.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f23c5c092b74d245d48eeef72bc3fd2"

DEPENDS += "\
    nativesdk-python3-cython \
    nativesdk-python3-python-dateutil \
    nativesdk-python3-pytz \
    python3-numpy-native \
"

PYPI_PACKAGE = "pandas"

SRC_URI[sha256sum] = "1e4285f5de1012de20ca46b188ccf33521bff61ba5c5ebd78b4fb28e5416a9f1"

inherit pypi
inherit setuptools3
inherit nativesdk
