SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS += "\
    nativesdk-python3-cryptography \
    nativesdk-python3-jinja2 \
    nativesdk-python3-packaging \
    nativesdk-python3-pyyaml \
    nativesdk-python3-resolvelib \
"

PYPI_PACKAGE = "ansible-core"

SRC_URI[md5sum] = "71b0b1e781a9378c6aa00b4f4102fe1b"
SRC_URI[sha256sum] = "a4508707262be11bb4dd98a006f1b14817879a055e6b6c46ad9fca8894fb3073"

inherit pypi
inherit setuptools3
inherit nativesdk
