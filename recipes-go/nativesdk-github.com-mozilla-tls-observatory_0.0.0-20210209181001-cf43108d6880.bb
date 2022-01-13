SUMMARY = "go.mod: github.com/mozilla/tls-observatory"
HOMEPAGE = "https://pkg.go.dev/github.com/mozilla/tls-observatory"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mozilla-tls-observatory-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-aws-aws-sdk-go \
    nativesdk-github.com-fatih-color \
    nativesdk-github.com-google-certificate-transparency-go \
    nativesdk-github.com-gorhill-cronexpr \
    nativesdk-github.com-gorilla-mux \
    nativesdk-github.com-gregjones-httpcache \
    nativesdk-github.com-hashicorp-golang-lru \
    nativesdk-github.com-lib-pq \
    nativesdk-github.com-miekg-dns \
    nativesdk-github.com-mozilla-scribe \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-viki-org-dnscache \
    nativesdk-github.com-yudai-gojsondiff \
    nativesdk-go.mozilla.org-mozlog \
    nativesdk-golang.org-x-crypto \
    nativesdk-gopkg.in-gcfg.v1 \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/mozilla/tls-observatory"
inherit gosrc
inherit nativesdk
