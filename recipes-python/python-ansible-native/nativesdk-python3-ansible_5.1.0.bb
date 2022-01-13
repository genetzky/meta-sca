SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

DEPENDS += "\
    nativesdk-python3-ansible-core \
    nativesdk-python3-cryptography \
    nativesdk-python3-jinja2 \
    nativesdk-python3-packaging \
    nativesdk-python3-pyyaml \
    nativesdk-python3-resolvelib \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

PYPI_PACKAGE = "ansible"

SRC_URI[md5sum] = "48713cc6cc40f7b0aaa8d54ffe969720"
SRC_URI[sha256sum] = "7604f264f9bdf31442ea152fa4eb77fe700100ff5e54103822d284551b7524bc"

inherit pypi
inherit setuptools3
inherit nativesdk

do_install:append() {
    # replace hardcoded python shebang
    find ${D} -type f -exec sed -i -e '1s,#\!.*python3,#! /usr/bin/env python3,' {} \;
    # remove blanks from filename
    mv "${D}${PYTHON_SITEPACKAGES_DIR}/ansible_collections/community/network/tests/integration/targets/ce_is_is_view/tests/netconf/test_ce_is_is_view_entity .yaml" \
       "${D}${PYTHON_SITEPACKAGES_DIR}/ansible_collections/community/network/tests/integration/targets/ce_is_is_view/tests/netconf/test_ce_is_is_view_entity.yaml"
}

