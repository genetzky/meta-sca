SUMMARY = "Easy to write small tests"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81eb9f71d006c6b268cf4388e3c98f7b"

DEPENDS += "\
    nativesdk-python3-atomicwrites \
    nativesdk-python3-attrs \
    nativesdk-python3-colorama \
    nativesdk-python3-importlib-metadata \
    nativesdk-python3-more-itertools \
    nativesdk-python3-packaging \
    nativesdk-python3-pathlib2 \
    nativesdk-python3-pluggy \
    nativesdk-python3-py \
    nativesdk-python3-wcwidth \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "pytest"

SRC_URI[md5sum] = "8bc467ebd5d571778dc51dd87ff09513"
SRC_URI[sha256sum] = "131b36680866a76e6781d13f101efb86cf674ebb9762eb70d3082b6f29889e89"
inherit pypi
inherit setuptools3
inherit nativesdk
