SUMMARY = "NPM: eslint-plugin-unicorn"
DESCRIPTION = "Various awesome ESLint rules"
HOMEPAGE = "https://github.com/sindresorhus/eslint-plugin-unicorn#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "\
    nativesdk-npm-babel-helper-validator-identifier \
    nativesdk-npm-ci-info \
    nativesdk-npm-clean-regexp \
    nativesdk-npm-eslint-utils \
    nativesdk-npm-esquery \
    nativesdk-npm-indent-string \
    nativesdk-npm-is-builtin-module \
    nativesdk-npm-lodash \
    nativesdk-npm-pluralize \
    nativesdk-npm-read-pkg-up \
    nativesdk-npm-regexp-tree \
    nativesdk-npm-safe-regex \
    nativesdk-npm-semver \
    nativesdk-npm-strip-indent \
"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-unicorn/-/eslint-plugin-unicorn-40.0.0.tgz"
SRC_URI[md5sum] = "84f28aa8d61326a2189e3baeb0e201b0"
SRC_URI[sha256sum] = "b5cbe325d9728afb74371e9b95397bb301ac2d68256250599f1080125cb50c63"

NPM_PKGNAME = "eslint-plugin-unicorn"

inherit npmhelper
inherit nativesdk
