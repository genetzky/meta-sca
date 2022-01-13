SUMMARY = "NPM: @cspell/cspell-bundled-dicts"
DESCRIPTION = "Dictionaries bundled with cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "\
    nativesdk-npm-cspell-dict-ada \
    nativesdk-npm-cspell-dict-aws \
    nativesdk-npm-cspell-dict-bash \
    nativesdk-npm-cspell-dict-companies \
    nativesdk-npm-cspell-dict-cpp \
    nativesdk-npm-cspell-dict-cryptocurrencies \
    nativesdk-npm-cspell-dict-csharp \
    nativesdk-npm-cspell-dict-css \
    nativesdk-npm-cspell-dict-django \
    nativesdk-npm-cspell-dict-dotnet \
    nativesdk-npm-cspell-dict-elixir \
    nativesdk-npm-cspell-dict-en-gb \
    nativesdk-npm-cspell-dict-en-us \
    nativesdk-npm-cspell-dict-filetypes \
    nativesdk-npm-cspell-dict-fonts \
    nativesdk-npm-cspell-dict-fullstack \
    nativesdk-npm-cspell-dict-golang \
    nativesdk-npm-cspell-dict-haskell \
    nativesdk-npm-cspell-dict-html \
    nativesdk-npm-cspell-dict-html-symbol-entities \
    nativesdk-npm-cspell-dict-java \
    nativesdk-npm-cspell-dict-latex \
    nativesdk-npm-cspell-dict-lorem-ipsum \
    nativesdk-npm-cspell-dict-lua \
    nativesdk-npm-cspell-dict-node \
    nativesdk-npm-cspell-dict-npm \
    nativesdk-npm-cspell-dict-php \
    nativesdk-npm-cspell-dict-powershell \
    nativesdk-npm-cspell-dict-public-licenses \
    nativesdk-npm-cspell-dict-python \
    nativesdk-npm-cspell-dict-ruby \
    nativesdk-npm-cspell-dict-rust \
    nativesdk-npm-cspell-dict-scala \
    nativesdk-npm-cspell-dict-software-terms \
    nativesdk-npm-cspell-dict-swift \
    nativesdk-npm-cspell-dict-typescript \
    nativesdk-npm-cspell-dict-vue \
"

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-bundled-dicts/-/cspell-bundled-dicts-5.15.1.tgz"
SRC_URI[md5sum] = "6eb81e4ebb077cd48a0bd2bd058b3c7f"
SRC_URI[sha256sum] = "b62a3e4486c23e9869084952421994fe40593c241da12b994b7dd50be726ec50"

NPM_PKGNAME = "@cspell/cspell-bundled-dicts"

inherit npmhelper
inherit nativesdk
