SUMMARY = "go.mod: github.com/securego/gosec/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/securego/gosec/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-securego-gosec-v2-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-google-uuid \
    nativesdk-github.com-gookit-color \
    nativesdk-github.com-lib-pq \
    nativesdk-github.com-mozilla-tls-observatory \
    nativesdk-github.com-nbutton23-zxcvbn-go \
    nativesdk-golang.org-x-text \
    nativesdk-golang.org-x-tools \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/securego/gosec/v2"
inherit gosrc
inherit nativesdk
